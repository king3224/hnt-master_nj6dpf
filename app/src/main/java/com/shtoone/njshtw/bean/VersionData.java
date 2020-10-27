package com.shtoone.njshtw.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2020/5/22.
 */

public class VersionData {


    /**
     * app-version : 2
     * success : true
     */

    @SerializedName("app-version")
    private String  appversion;
    private boolean success;

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
