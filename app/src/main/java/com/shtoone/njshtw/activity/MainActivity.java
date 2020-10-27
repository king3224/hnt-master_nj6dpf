package com.shtoone.njshtw.activity;

import android.Manifest;
import android.animation.Animator;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.google.gson.Gson;
import com.shtoone.njshtw.BaseApplication;
import com.shtoone.njshtw.R;
import com.shtoone.njshtw.activity.base.BaseActivity;
import com.shtoone.njshtw.bean.VersionData;
import com.shtoone.njshtw.bean.WeatherData;
import com.shtoone.njshtw.fragment.mainactivity.ConcreteFragment;
import com.shtoone.njshtw.fragment.mainactivity.LaboratoryFragment;
import com.shtoone.njshtw.fragment.mainactivity.PitchFragment;
import com.shtoone.njshtw.fragment.mainactivity.WaterStablityFragment;
import com.shtoone.njshtw.fragment.tanpu.PaveSiteFragment;
import com.shtoone.njshtw.utils.ConstantsUtils;
import com.shtoone.njshtw.utils.DownloadUtils;
import com.shtoone.njshtw.utils.HttpUtils;
import com.shtoone.njshtw.utils.SharedPreferencesUtils;
import com.shtoone.njshtw.utils.URL;
import com.socks.library.KLog;

import java.util.ArrayList;

import me.yokeyword.fragmentation.SupportFragment;
import zhy.com.highlight.HighLight;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    // 再点一次退出程序时间设置
    private static final long WAIT_TIME = 2000L;
    private long TOUCH_TIME = 0;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle toggle;
    private SupportFragment[] mFragments = new SupportFragment[5];
    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();
    private AHBottomNavigation bottomNavigation;
    private int bottomNavigationPreposition = 0;
    private HighLight mHightLight;
    private TextView tv_username;
    private FrameLayout fl_container;
    private TextView tv_phone_number;
    private TextView city;
    private TextView tempreture;
    private TextView weather;
    RequestQueue mQueue;
    WeatherData weatherData;
    private static final int REQUEST_CODE_READ_EXTERNAL_STORAGE_PERMISSIONS = 1;
    private static final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE = 2;
    private static final int REQUEST_INSTALL_PACKAGES = 3;
    private Gson        mGson;
    private VersionData mVersionData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            if (savedInstanceState == null) {
            mFragments[0] = ConcreteFragment.newInstance();
            mFragments[1] = PitchFragment.newInstance();
            mFragments[2] = WaterStablityFragment.newInstance();
            mFragments[3] = LaboratoryFragment.newInstance();
            mFragments[4] = PaveSiteFragment.newInstance();
            loadMultipleRootFragment(R.id.fl_container_main_activity, 0, mFragments[0], mFragments[1],mFragments[2],mFragments[3],mFragments[4]);
        } else {
            // 这里库已经做了Fragment恢复,所有不需要额外的处理了, 不会出现重叠问题
            // 这里我们需要拿到mFragments的引用,也可以通过getSupportFragmentManager.getFragments()自行进行判断查找(效率更高些),用下面的方法查找更方便些
            mFragments[0] = findFragment(ConcreteFragment.class);
            mFragments[1] = findFragment(PitchFragment.class);
            mFragments[2] = findFragment(WaterStablityFragment.class);
            mFragments[3] = LaboratoryFragment.newInstance();
            mFragments[4] = findFragment(PaveSiteFragment.class);

        }

        initView();
        initData();
//        getWeather();

    }

//    public void getWeather() {
//        mQueue = Volley.newRequestQueue(this);
//        SharedPreferences sharedPreferences = this.getSharedPreferences("chengshi", Context.MODE_PRIVATE);
//        final String cityName = sharedPreferences.getString("name", "");
//        Log.e("TAG", cityName);
//        String url = "http://apicloud.mob.com/v1/weather/query?key=10fe7d0582836&city=" + StringUtils.getUTF8FromStr(cityName);
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Log.d("TAG", response.toString());
//
//                        Gson gson = new Gson();
//                        weatherData = gson.fromJson(response.toString(), WeatherData.class);
//                        if (weatherData != null && weatherData.getRetCode().equals("200")) {
//                            city.setText(cityName);
//                            tempreture.setText(weatherData.getResult().get(0).getTemperature());
//                            weather.setText(weatherData.getResult().get(0).getWeather());
//                        } else {
//                            Toast.makeText(getApplicationContext(), "请求天气数据失败", Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("TAG", error.getMessage(), error);
//                //Toast.makeText(getApplicationContext(), "2" + error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        mQueue.add(jsonObjectRequest);
//
//    }

    private void initView() {
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationView_main_activity);
        mNavigationView.setNavigationItemSelectedListener(this);
        fl_container = (FrameLayout) findViewById(R.id.fl_container_main_activity);
        LinearLayout llNavHeader = (LinearLayout) mNavigationView.getHeaderView(0);
        tv_username = (TextView) llNavHeader.findViewById(R.id.tv_username_nav_header_main);
        tv_phone_number = (TextView) llNavHeader.findViewById(R.id.tv_phone_number_nav_header_main);
        city = (TextView) llNavHeader.findViewById(R.id.navigation_header_container_city);
        tempreture = (TextView) llNavHeader.findViewById(R.id.iv_header_nav_header_tempreture);
        weather = (TextView) llNavHeader.findViewById(R.id.navigation_header_container_weather);
        llNavHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.closeDrawer(GravityCompat.START);
                mDrawer.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 250);
            }
        });
        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation_main_activity);

    }

    public void initToolBar(Toolbar toolbar) {
        toggle = new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();
    }


    public void initData() {
        mGson = new Gson();
        if (null != BaseApplication.mUserInfoData) {
            if (!TextUtils.isEmpty(BaseApplication.mUserInfoData.getUserFullName())) {
                tv_username.setText("用户：" + BaseApplication.mUserInfoData.getUserFullName());
            }
            if (!TextUtils.isEmpty(BaseApplication.mUserInfoData.getUserPhoneNum())) {
                tv_phone_number.setText("电话：" + BaseApplication.mUserInfoData.getUserPhoneNum());
            }
        }

        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.concrete, R.drawable.ic_bhz, R.color.white);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.asphalt, R.drawable.ic_android_black_24dp, R.color.white);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem(R.string.waterstablity, R.drawable.ic_android_black_24dp, R.color.white);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.laboratory, R.drawable.ic_lab, R.color.white);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.pavesite, R.drawable.road, R.color.white);
        bottomNavigationItems.add(item1);
        bottomNavigationItems.add(item2);
        bottomNavigationItems.add(item5);
        bottomNavigationItems.add(item3);
        bottomNavigationItems.add(item4);
        bottomNavigation.addItems(bottomNavigationItems);
        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.white));
        bottomNavigation.setBehaviorTranslationEnabled(true);
        bottomNavigation.setColored(true);
        bottomNavigation.setForceTint(false);
        bottomNavigation.setAccentColor(getResources().getColor(R.color.base_color));
        bottomNavigation.setInactiveColor(getResources().getColor(R.color.gray));
        bottomNavigation.setForceTitlesDisplay(true);

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, boolean wasSelected) {
                showHideFragment(mFragments[position], mFragments[bottomNavigationPreposition]);
                bottomNavigationPreposition = position;
                if (position ==2) {
                    KLog.e(TAG, "22222");
                }
                if (!wasSelected && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    int cx = (fl_container.getLeft() + fl_container.getRight()) / 2;
                    int cy = fl_container.getBottom();
                    int radius = Math.max(fl_container.getWidth(), fl_container.getHeight());
                    Animator mAnimator = ViewAnimationUtils.createCircularReveal(fl_container, cx, cy, 0, radius);
                    mAnimator.setDuration(300);
                    mAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                    mAnimator.start();
                }
            }
        });
        bottomNavigation.setCurrentItem(0);
        upload();
    }

    private void upload() {

        //动态请求权限
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        REQUEST_CODE_READ_EXTERNAL_STORAGE_PERMISSIONS);
                requestPermissions(
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        REQUEST_CODE_WRITE_EXTERNAL_STORAGE);
                requestPermissions(
                        new String[]{Manifest.permission.REQUEST_INSTALL_PACKAGES},
                        REQUEST_INSTALL_PACKAGES);
            }
        }

        HttpUtils.getRequest(URL.BaseURL + "appVersion/app-version.json", new HttpUtils.HttpListener() {
            @Override
            public void onSuccess(String response) {

                mVersionData = mGson.fromJson(response,VersionData.class);
                try {


                    final int versionCode = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
                    if (Integer.parseInt(mVersionData.getAppversion())>versionCode){
                        setMyPop();
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });
    }

    private void setMyPop() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //        builder.setIcon(R.drawable.wanneng);
        //        builder.setTitle("结束生产");

        // 判断 生产申请判断料仓是否合格，关闭申请判断料仓是否还有使用
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_verify_jianli_jieshushenchan_new, null);
        builder.setView(view);
        final Button btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
        final Button btn_ok = (Button) view.findViewById(R.id.btn_ok);
        final ImageView iv_cancell = (ImageView) view.findViewById(R.id.iv_cancell);

        final AlertDialog ad = builder.create();
        ad.setCancelable(true);
        ad.setCanceledOnTouchOutside(false);
        ad.show();

        iv_cancell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.dismiss();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.dismiss();
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DownloadUtils(getApplication(), URL.BaseURL+"appVersion/app-nj6pf.apk","app-nj6pf.apk");

                ad.dismiss();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
                finish();
            } else {
                TOUCH_TIME = System.currentTimeMillis();
                Toast.makeText(this, R.string.press_again_exit, Toast.LENGTH_SHORT).show();
            }
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(final MenuItem item) {
        mDrawer.closeDrawer(GravityCompat.START);
        mDrawer.postDelayed(new Runnable() {
            @Override
            public void run() {
                int id = item.getItemId();

                if (id == R.id.message_drawer_main_activity) {
                    JumpToMessageActivity();
                } else if (id == R.id.logout_drawer_main_activity) {
                    JumpToLoginActivity();
                } else if (id == R.id.about_drawer_main_activity) {
                    JumpToAboutActivity();
                } else if (id == R.id.version_drawer_main_activity) {
                    JumpToVersionActivity();
                }
            }
        }, 250);
        return true;
    }


    private void JumpToLoginActivity() {
        //清除已存的用户信息
        SharedPreferencesUtils.put(this, ConstantsUtils.USERNAME, "");
        SharedPreferencesUtils.put(this, ConstantsUtils.PASSWORD, "");
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void JumpToMessageActivity() {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }

//    private void JumpToWeatherActivity() {
//        KLog.e(TAG, "JumpToWeatherActivity()0");
//        Intent intent = new Intent(this, WeatherActivity.class);
//        startActivity(intent);
//    }

    private void JumpToAboutActivity() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    private void JumpToVersionActivity() {
        Intent intent = new Intent(this, VersionActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        if ((Boolean) SharedPreferencesUtils.get(MainActivity.this, ConstantsUtils.ISFIRSTGUIDE, true)) {
            showTipMask();
        }
        super.onResume();
    }

    private void showTipMask() {
        mHightLight = new HighLight(MainActivity.this)//
                .addHighLight(R.id.action_hierarchy, R.layout.info_gravity_right_up, new HighLight.OnPosCallback() {
                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.rightMargin = 1;
                        marginInfo.topMargin = rectF.bottom;
                    }
                }).setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        mHightLight = new HighLight(MainActivity.this);
                        mHightLight.addHighLight(R.id.fab, R.layout.info_down, new HighLight.OnPosCallback() {
                            @Override
                            public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                                marginInfo.rightMargin = rectF.width() / 2 + 1;
                                marginInfo.bottomMargin = bottomMargin + rectF.height();
                            }
                        }).setClickCallback(new HighLight.OnClickCallback() {
                            @Override
                            public void onClick() {
                                SharedPreferencesUtils.put(MainActivity.this, ConstantsUtils.ISFIRSTGUIDE, false);
                            }
                        }).show();
                    }
                });
        mHightLight.show();
    }

    @Override
    public boolean swipeBackPriority() {
        return false;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_WRITE_EXTERNAL_STORAGE: {
                for (int i = 0; i < permissions.length; i++) {
                    if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "允许写存储！", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "未允许写存储！", Toast.LENGTH_SHORT).show();
                    }

                }
            }
            break;
            case REQUEST_CODE_READ_EXTERNAL_STORAGE_PERMISSIONS: {
                for (int i = 0; i < permissions.length; i++) {
                    if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "允许读存储！", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(this, "未允许读存储！", Toast.LENGTH_SHORT).show();
                    }

                }
            }
            break;

            case REQUEST_INSTALL_PACKAGES: {
                for (int i = 0; i < permissions.length; i++) {
                    if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "允许安装包！", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(this, "未允许安装包！", Toast.LENGTH_SHORT).show();
                    }

                }
            }
            break;
            default: {
                super.onRequestPermissionsResult(requestCode, permissions,
                        grantResults);
            }
        }
    }


}
