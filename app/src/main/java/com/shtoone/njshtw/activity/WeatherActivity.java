package com.shtoone.njshtw.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.shtoone.njshtw.R;
import com.shtoone.njshtw.activity.base.BaseActivity;
import com.shtoone.njshtw.fragment.weatheractivity.WeatherActivityWeatherFragment;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by gesangdianzi on 2016/8/22.
 */

public class WeatherActivity extends BaseActivity {

    private FrameLayout fl_container;
    private SupportFragment weatherActivityWeatherFragment;
    private Toolbar toolbar;

    String TAG="WeatherActivity:";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_weather);

        if (savedInstanceState == null) {
            weatherActivityWeatherFragment = WeatherActivityWeatherFragment.newInstance();
            int showPosition = 0;
            loadMultipleRootFragment(R.id.fl_container_weather_activity, showPosition, weatherActivityWeatherFragment);//
        } else {
            weatherActivityWeatherFragment = findFragment(WeatherActivityWeatherFragment.class);
        }


        initView();
        initData();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_toolbar);
        fl_container = (FrameLayout) findViewById(R.id.fl_container_weather_activity);
    }

    public void initData() {
        initToolbarBackNavigation(toolbar);
    }

    @Override
    protected void initToolbarBackNavigation(Toolbar toolbar) {
        super.initToolbarBackNavigation(toolbar);
        toolbar.setTitle("最近天气");
    }
}

