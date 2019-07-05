package com.shtoone.njshtw.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shtoone.njshtw.R;
import com.shtoone.njshtw.bean.OverproofFragmentViewPagerFragmentListData;
import com.shtoone.njshtw.bean.WaterStablityOverprofData;
import com.shtoone.njshtw.ui.SlantedTextView;

import java.util.List;

public class SWOverproofFragmentViewPagerFragmentRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = SWOverproofFragmentViewPagerFragmentRecyclerViewAdapter.class.getSimpleName();
    private Context                                    context;
    private OnItemClickListener                        mOnItemClickListener;
    private List<WaterStablityOverprofData.DataEntity> itemsData;
    private Resources                                  mResources;

    public enum ITEM_TYPE {
        TYPE_ITEM, TYPE_FOOTER
    }

    public SWOverproofFragmentViewPagerFragmentRecyclerViewAdapter(Context context, List<WaterStablityOverprofData.DataEntity> itemsData) {
        super();
        this.context = context;
        this.itemsData = itemsData;
        mResources = context.getResources();
    }

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    @Override
    public int getItemCount() {
        if (itemsData != null && itemsData.size() > 0) {
            //这里的10是根据分页查询，一页该显示的条数
            if (itemsData.size() > 4) {
                return itemsData.size() + 1;
            } else {
                return itemsData.size();
            }
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (getItemCount() > 4 && position + 1 == getItemCount()) {
            return ITEM_TYPE.TYPE_FOOTER.ordinal();
        } else {
            return ITEM_TYPE.TYPE_ITEM.ordinal();
        }
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder mItemViewHolder = (ItemViewHolder) holder;
            mItemViewHolder.cv.setCardBackgroundColor(position % 2 == 0 ? mResources.getColor(R.color.material_teal_50) : mResources.getColor(R.color.material_blue_50));

            WaterStablityOverprofData.DataEntity item = itemsData.get(position);
            mItemViewHolder.tv_datetime.setText(item.getClTime());
            mItemViewHolder.tv_site.setText(item.getBzhName());
            mItemViewHolder.tv_equipmentid.setText(item.getSbbh());
            mItemViewHolder.tv_zcl.setText(item.getZcl());
            mItemViewHolder.stv_handle.setVisibility(View.VISIBLE);

            if ("0".equals(item.getChuli())) {
                mItemViewHolder.stv_handle.setText("未处置").setSlantedBackgroundColor(Color.YELLOW);
            } else {
                mItemViewHolder.stv_handle.setText("已处置").setSlantedBackgroundColor(Color.GREEN);
            }
            mItemViewHolder.stv_examine.setVisibility(View.VISIBLE);
            if (("0".equals(item.getShenhe()))||("-1".equals(item.getShenhe()))) {
                mItemViewHolder.stv_examine.setText("未审批").setSlantedBackgroundColor(Color.YELLOW);
            } else if ("1".equals(item.getShenhe())) {
                mItemViewHolder.stv_examine.setText("已审批").setSlantedBackgroundColor(Color.GREEN);
            }

            if (item.getSjg1().equals("1")){
                mItemViewHolder.tv_sjg1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg1.setText("实际骨料1"+":"+"初级超标");
            }else if (item.getSjg1().equals("2")){
                mItemViewHolder.tv_sjg1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg1.setText("实际骨料1"+":"+"中级超标");
            }else if (item.getSjg1().equals("3")){
                mItemViewHolder.tv_sjg1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg1.setText("实际骨料1"+":"+"高级超标");
            }

            if (item.getSjg2().equals("1")){
                mItemViewHolder.tv_sjg2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg2.setText("实际骨料2"+":"+"初级超标");
            }else if (item.getSjg2().equals("2")){
                mItemViewHolder.tv_sjg2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg2.setText("实际骨料2"+":"+"中级超标");
            }else if (item.getSjg2().equals("3")){
                mItemViewHolder.tv_sjg2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg2.setText("实际骨料2"+":"+"高级超标");
            }

            if (item.getSjg3().equals("1")){
                mItemViewHolder.tv_sjg3.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg3.setText("实际骨料3"+":"+"初级超标");
            }else if (item.getSjg3().equals("2")){
                mItemViewHolder.tv_sjg3.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg3.setText("实际骨料3"+":"+"中级超标");
            }else if (item.getSjg3().equals("3")){
                mItemViewHolder.tv_sjg3.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg3.setText("实际骨料3"+":"+"高级超标");
            }


            if (item.getSjg4().equals("1")){
                mItemViewHolder.tv_sjg4.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg4.setText("实际骨料4"+":"+"初级超标");
            }else if (item.getSjg4().equals("2")){
                mItemViewHolder.tv_sjg4.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg4.setText("实际骨料4"+":"+"中级超标");
            }else if (item.getSjg4().equals("3")){
                mItemViewHolder.tv_sjg4.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg4.setText("实际骨料4"+":"+"高级超标");
            }

            if (item.getSjg5().equals("1")){
                mItemViewHolder.tv_sjg5.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg5.setText("实际骨料5"+":"+"初级超标");
            }else if (item.getSjg5().equals("2")){
                mItemViewHolder.tv_sjg5.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg5.setText("实际骨料5"+":"+"中级超标");
            }else if (item.getSjg5().equals("3")){
                mItemViewHolder.tv_sjg5.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjg5.setText("实际骨料5"+":"+"高级超标");
            }

            if (item.getSjf1().equals("1")){
                mItemViewHolder.tv_sjf1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf1.setText("实际粉料1"+":"+"初级超标");
            }else if (item.getSjf1().equals("2")){
                mItemViewHolder.tv_sjf1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf1.setText("实际粉料1"+":"+"中级超标");
            }else if (item.getSjf1().equals("3")){
                mItemViewHolder.tv_sjf1.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf1.setText("实际粉料1"+":"+"高级超标");
            }

            if (item.getSjf2().equals("1")){
                mItemViewHolder.tv_sjf2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf2.setText("实际粉料2"+":"+"初级超标");
            }else if (item.getSjf2().equals("2")){
                mItemViewHolder.tv_sjf2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf2.setText("实际粉料2"+":"+"中级超标");
            }else if (item.getSjf2().equals("3")){
                mItemViewHolder.tv_sjf2.setVisibility(View.VISIBLE);
                mItemViewHolder.tv_sjf2.setText("实际粉料2"+":"+"高级超标");
            }



            if (mOnItemClickListener != null) {
                mItemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = holder.getLayoutPosition();
                        mOnItemClickListener.onItemClick(holder.itemView, position);
                    }
                });
            }
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE.TYPE_ITEM.ordinal()) {
            return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview_swoverproof_query_fragment, parent, false));
        } else if (viewType == ITEM_TYPE.TYPE_FOOTER.ordinal()) {
            return new FootViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_item_foot, parent, false));
        }
        return null;
    }

    static class ItemViewHolder extends ViewHolder {
        CardView cv;
        TextView tv_datetime;
        TextView tv_site;
        TextView tv_equipmentid;
        TextView tv_zcl;
        TextView tv_sjg1;
        TextView tv_sjg2;
        TextView tv_sjg3;
        TextView tv_sjg4;
        TextView tv_sjg5;
        TextView tv_sjf1;
        TextView tv_sjf2;

        SlantedTextView stv_handle;
        SlantedTextView stv_examine;

        public ItemViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cv_item_recyclerview_produce_query_fragment);
            tv_datetime = (TextView) view.findViewById(R.id.tv0_item_recyclerview_produce_query_fragment);
            tv_site = (TextView) view.findViewById(R.id.tv1_item_recyclerview_produce_query_fragment);
            tv_equipmentid = (TextView) view.findViewById(R.id.tv2_item_recyclerview_produce_query_fragment);
            tv_zcl = (TextView) view.findViewById(R.id.tv3_item_recyclerview_produce_query_fragment);
            stv_handle = (SlantedTextView) view.findViewById(R.id.stv_handle_item_recyclerview_produce_query_fragment);
            stv_examine = (SlantedTextView) view.findViewById(R.id.stv_examine_item_recyclerview_produce_query_fragment);
            tv_sjg1 = (TextView)view.findViewById(R.id.tv_sjg1);
            tv_sjg2 = (TextView)view.findViewById(R.id.tv_sjg2);
            tv_sjg3 = (TextView)view.findViewById(R.id.tv_sjg3);
            tv_sjg4 = (TextView)view.findViewById(R.id.tv_sjg4);
            tv_sjg5 = (TextView)view.findViewById(R.id.tv_sjg5);
            tv_sjf1 = (TextView)view.findViewById(R.id.tv_sjf1);
            tv_sjf2 = (TextView)view.findViewById(R.id.tv_sjf2);
        }
    }

    static class FootViewHolder extends ViewHolder {

        public FootViewHolder(View view) {
            super(view);
        }
    }
}
