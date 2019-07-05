package com.shtoone.njshtw.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shtoone.njshtw.BaseApplication;
import com.shtoone.njshtw.bean.ParametersData;
import com.shtoone.njshtw.fragment.pitchactivity.PitchOverproofFragmentViewPagerFragment;
import com.shtoone.njshtw.fragment.waterstablityactivity.WaterStablityOverproofFragmentViewPagerFragment;
import com.shtoone.njshtw.utils.ConstantsUtils;
import com.socks.library.KLog;
import com.squareup.otto.Subscribe;

/**
 * Created by gesangdianzi on 2016/9/2.
 */
public class WaterStablityOverproofFragmentViewPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = WaterStablityOverproofFragmentViewPagerAdapter.class.getSimpleName();
    private String[] tabTitles = {"初级", "中级", "高级"};
    private ParametersData mParametersData;
    private boolean isRegistered = false;

    public WaterStablityOverproofFragmentViewPagerAdapter(FragmentManager fm, ParametersData mParametersData) {
        super(fm);
        this.mParametersData = mParametersData;
        if (!isRegistered) {
            BaseApplication.bus.register(this);
            isRegistered = true;
        }
    }

    @Override
    public Fragment getItem(int position) {
        ParametersData mParametersData = (ParametersData) this.mParametersData.clone();

        switch (position) {
            case 0:
                mParametersData.chaobiaolx = "1";
                break;
            case 1:
                mParametersData.chaobiaolx = "2";
                break;
            case 2:
                mParametersData.chaobiaolx = "3";
                break;
        }

        return WaterStablityOverproofFragmentViewPagerFragment.newInstance(mParametersData);
    }

    @Override
    public int getCount() {
        if (null != tabTitles) {
            return tabTitles.length;
        }
        return 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (null != tabTitles) {
            return tabTitles[position];
        }
        return null;
    }

    @Subscribe
    public void updateSearch(ParametersData mParametersData) {
        if (mParametersData != null) {
            if (mParametersData.fromTo == ConstantsUtils.WATERSTABLITYOVERPROOFFRAGMENT) {
                this.mParametersData.startDateTime = mParametersData.startDateTime;
                this.mParametersData.endDateTime = mParametersData.endDateTime;
                this.mParametersData.equipmentID = mParametersData.equipmentID;
                this.mParametersData.cllx = mParametersData.cllx;
                KLog.e("mParametersData:" + mParametersData.startDateTime);
                KLog.e("mParametersData:" + mParametersData.endDateTime);
                KLog.e("mParametersData:" + mParametersData.equipmentID);
                KLog.e("mParametersData:" + mParametersData.handleType);
            }
        }
    }

    public void unRegister() {
        BaseApplication.bus.unregister(this);
    }
}

