package com.shtoone.njshtw.activity;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.shtoone.njshtw.BaseApplication;
import com.shtoone.njshtw.R;
import com.shtoone.njshtw.activity.base.BaseActivity;
import com.shtoone.njshtw.adapter.WaterStablityProduceQueryDetailActivityRecyclerViewAdapter;
import com.shtoone.njshtw.bean.SC_chaxunItem_xq;
import com.shtoone.njshtw.bean.SC_chaxunItem_xq_data;
import com.shtoone.njshtw.bean.WaterStablityProduceQueryData;
import com.shtoone.njshtw.bean.WaterStablityProduceQueryDetailActivityData;
import com.shtoone.njshtw.ui.PageStateLayout;
import com.shtoone.njshtw.utils.DateUtils;
import com.shtoone.njshtw.utils.NetworkUtils;
import com.shtoone.njshtw.utils.URL;
import com.socks.library.KLog;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.views.ptr.PtrFrameLayout;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.SlideInLeftAnimationAdapter;


public class WaterStablityProduceQueryDetailActivity extends BaseActivity {
    private static final String TAG = WaterStablityProduceQueryDetailActivity.class.getSimpleName();
    private Toolbar                                     mToolbar;
    private NestedScrollView                            mNestedScrollView;
    private PageStateLayout                             mPageStateLayout;
    private PtrFrameLayout                              mPtrFrameLayout;
    private WaterStablityProduceQueryDetailActivityData data;
    private        TextView                                                   scchaxun_xq_date;
    private        TextView                                                   scchaxun_xq_bhjname ;
    private        TextView                                                   scchaxun_xq_chuliaoshijian;
    private        TextView                                                   scchaxun_xq_zcl;
    private        String                                                     bianhao;
    private        String                                                     shebeibianhao;
    private        RecyclerView                                               mRecyclerView;
    private        WaterStablityProduceQueryDetailActivityRecyclerViewAdapter mAdapter;
    private        WaterStablityProduceQueryData.DataEntity                   mDataBean;
    private        Gson                                                       mGson;
    private static String                                                     string;
    SC_chaxunItem_xq xqData = null;
    List<SC_chaxunItem_xq_data> lists = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail_waterstabilityproduction);
        initView();
        initDate();
    }

    private void initView() {

        mToolbar = (Toolbar) findViewById(R.id.toolbar_toolbar);
        mNestedScrollView = (NestedScrollView) findViewById(R.id.nsv_produce_query_detail_fragment);
        mPtrFrameLayout = (PtrFrameLayout) findViewById(R.id.ptr_produce_query_detail_fragment);
        mPageStateLayout = (PageStateLayout) findViewById(R.id.psl_produce_query_detail_fragment);
        scchaxun_xq_date = (TextView) this.findViewById(R.id.scchaxun_xq_date);
        scchaxun_xq_bhjname = (TextView) this.findViewById(R.id.scchaxun_xq_bhjname);
        scchaxun_xq_chuliaoshijian = (TextView) this.findViewById(R.id.scchaxun_xq_chuliaoshijian);
        scchaxun_xq_zcl = (TextView) this.findViewById(R.id.scchaxun_xq_zcl);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_produce_query_detail_fragment);
    }

    private void initDate() {
        mGson = new Gson();
        mDataBean = (WaterStablityProduceQueryData.DataEntity) getIntent().getSerializableExtra("producequerydetail");
        bianhao= mDataBean.getShuiwenid();
        shebeibianhao=mDataBean.getShebeibianhao();
        //xqData=new SC_chaxunItem_xq();
        setToolbarTitle();
        initToolbarBackNavigation(mToolbar);
        setSupportActionBar(mToolbar);
        initPageStateLayout(mPageStateLayout);
        initPtrFrameLayout(mPtrFrameLayout);

    }

    @Override
    public boolean isCanDoRefresh() {
        //判断是哪种状态的页面，都让其可下拉
        if (mNestedScrollView.getScrollY() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String createRefreshULR() {
        mPageStateLayout.showLoading();
        return URL.getSWProduceDetailData(bianhao,shebeibianhao);
    }

    @Override
    public void onRefreshSuccess(String response) {
        if (!TextUtils.isEmpty(response)) {
            JSONObject jsonObject = null;
            try {
                jsonObject = new JSONObject(response);
            } catch (JSONException e) {
                e.printStackTrace();
                mPageStateLayout.showError();
                return;
            }
            if (jsonObject.optBoolean("success")) {
                data = mGson.fromJson(response, WaterStablityProduceQueryDetailActivityData.class);
//                try {
//                    KLog.e(response);
//                    //getXqDataFromString(response);
//                }catch( Exception e){
//                    e.printStackTrace();
//                }
                if (null != data) {
                    if (data.isSuccess()) {
                        mPageStateLayout.showContent();
                       // mAdapter.notifyDataSetChanged();
                          setViewData();
                        setAdapter();
                    } else {
                        //提示数据为空，展示空状态
                        mPageStateLayout.showEmpty();
                    }
                } else {
                    //提示数据解析异常，展示错误页面
                    mPageStateLayout.showError();
                }
            } else {
                //提示数据为空，展示空状态
                mPageStateLayout.showEmpty();
            }
        } else {
            //提示返回数据异常，展示错误页面
            mPageStateLayout.showError();
        }
    }

    @Override
    public void onRefreshFailed(VolleyError error) {
        //提示网络数据异常，展示网络错误页面。此时：1.可能是本机网络有问题，2.可能是服务器问题
        if (!NetworkUtils.isConnected(this)) {
            //提示网络异常,让用户点击设置网络
            mPageStateLayout.showNetError();
        } else {
            //服务器异常，展示错误页面，点击刷新
            mPageStateLayout.showError();
        }
    }



    private  void setViewData()
    {
        // 设置显示数据
        scchaxun_xq_date.setText(data.getSwHead().getBaocunshijian());//
        scchaxun_xq_bhjname.setText(data.getSwHead().getBhjName());//
        scchaxun_xq_chuliaoshijian.setText(data.getSwHead().getShijians());//
        scchaxun_xq_zcl.setText(data.getSwHead().getZcl());//

    }
    //还是不能这样搞，可能会内存泄漏，重复创建Adapyer对象。后面解决
    private void setAdapter() {

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //KLog.e(TAG,"lisst=:"+xqData.getLists());
        //设置动画与适配器
        SlideInLeftAnimationAdapter mSlideInLeftAnimationAdapter = new SlideInLeftAnimationAdapter(mAdapter = new WaterStablityProduceQueryDetailActivityRecyclerViewAdapter(this,data.getData()));
        mSlideInLeftAnimationAdapter.setFirstOnly(true);
        mSlideInLeftAnimationAdapter.setDuration(500);
        mSlideInLeftAnimationAdapter.setInterpolator(new OvershootInterpolator(0.5f));
        ScaleInAnimationAdapter mScaleInAnimationAdapter = new ScaleInAnimationAdapter(mSlideInLeftAnimationAdapter);
        mScaleInAnimationAdapter.setFirstOnly(true);
        mRecyclerView.setAdapter(mScaleInAnimationAdapter);
    }

    private void setToolbarTitle() {
        if (null != mToolbar && null != BaseApplication.mDepartmentData && !TextUtils.isEmpty(BaseApplication.mDepartmentData.departmentName)) {
            //StringBuffer sb = new StringBuffer(BaseApplication.mDepartmentData.departmentName + " > ");
            StringBuffer sb = new StringBuffer("路面监控" + " > ");
            sb.append(getString(R.string.waterstablity) + " > ");
            sb.append(getString(R.string.produce_query) + " > ");
            sb.append(getString(R.string.detail)).trimToSize();
            mToolbar.setTitle(sb.toString());
        }
    }




    private void getXqDataFromString(String string) throws  Exception{
        JSONObject jsonObject = new JSONObject(string);
        if (jsonObject.getBoolean("success")) {
            xqData = new SC_chaxunItem_xq();
            lists = new ArrayList<SC_chaxunItem_xq_data>();
            JSONObject joData = jsonObject.getJSONObject("data"); //获取 data JSON
            JSONObject joFields = jsonObject.getJSONObject("Fields"); //获取 Fields JSON
            JSONObject joIsShow = jsonObject.getJSONObject("Isshow"); //获取 Isshow JSON

            if ("1".equals(joIsShow.getString("sjf1"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjf1"));
                data.setPeibi(joData.getString("llf1"));
                data.setShiji(joData.getString("persjf1"));
                data.setWucha(joData.getString("wsjf1"));
                data.setYongliang(joData.getString("sjf1"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjf2"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjf2"));
                data.setPeibi(joData.getString("llf2"));
                data.setShiji(joData.getString("persjf2"));
                data.setWucha(joData.getString("wsjf2"));
                data.setYongliang(joData.getString("sjf2"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg1"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg1"));
                data.setPeibi(joData.getString("llg1"));
                data.setShiji(joData.getString("persjg1"));
                data.setWucha(joData.getString("wsjg1"));
                data.setYongliang(joData.getString("sjg1"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg2"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg2"));
                data.setPeibi(joData.getString("llg2"));
                data.setShiji(joData.getString("persjg2"));
                data.setWucha(joData.getString("wsjg2"));
                data.setYongliang(joData.getString("sjg2"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg3"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg3"));
                data.setPeibi(joData.getString("llg3"));
                data.setShiji(joData.getString("persjg3"));
                data.setWucha(joData.getString("wsjg3"));
                data.setYongliang(joData.getString("sjg3"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg4"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg4"));
                data.setPeibi(joData.getString("llg4"));
                data.setShiji(joData.getString("persjg4"));
                data.setWucha(joData.getString("wsjg4"));
                data.setYongliang(joData.getString("sjg4"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg5"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg5"));
                data.setPeibi(joData.getString("llg5"));
                data.setShiji(joData.getString("persjg5"));
                data.setWucha(joData.getString("wsjg5"));
                data.setYongliang(joData.getString("sjg5"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg6"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg6"));
                data.setPeibi(joData.getString("llg6"));
                data.setShiji(joData.getString("persjg6"));
                data.setWucha(joData.getString("wsjg6"));
                data.setYongliang(joData.getString("sjg6"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjg7"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjg7"));
                data.setPeibi(joData.getString("llg7"));
                data.setShiji(joData.getString("persjg7"));
                data.setWucha(joData.getString("wsjg7"));
                data.setYongliang(joData.getString("sjg7"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjlq"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjlq"));
                data.setPeibi(joData.getString("lllq"));
                data.setShiji(joData.getString("persjlq"));
                data.setWucha(joData.getString("wsjlq"));
                data.setYongliang(joData.getString("sjlq"));
                lists.add(data);
            }
            if ("1".equals(joIsShow.getString("sjtjj"))) {
                SC_chaxunItem_xq_data data = new SC_chaxunItem_xq_data();
                data.setName(joFields.getString("sjtjj"));
                data.setPeibi(joData.getString("lltjj"));
                data.setShiji(joData.getString("persjtjj"));
                data.setWucha(joData.getString("wsjtjj"));
                data.setYongliang(joData.getString("sjtjj"));
                lists.add(data);
            }

            //1. 时间,实际油石比,理论油石比,误差实际油石比,沥青温度,骨料温度,出料温度
            xqData.setBanhezhanmingchen(joData.getString("banhezhanminchen"));
            xqData.setChuliaoshijian(DateUtils.subTime(joData.getString("shijian")));
            xqData.setShijiyoushibi(joData.getString("sjysb"));
            xqData.setLilunyoushibi(joData.getString("llysb"));
            xqData.setYoushibiwucha(joData.getString("wsjysb"));
            xqData.setLiqingwendu(joData.getString("lqwd"));
            xqData.setShiliaowend(joData.getString("glwd"));
            xqData.setChuliaowendu(joData.getString("clwd"));

            xqData.setLists(lists);
        }
    }
}
