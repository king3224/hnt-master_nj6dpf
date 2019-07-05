package com.shtoone.njshtw.utils;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Author：leguang on 2016/10/9 0009 15:49
 * Email：langmanleguang@qq.com
 */
public interface ApiService {



    //超标处置提交
    @Multipart
    @POST("lqChaoBiaoChuZhiController.do?appLqChaobiaoChuzhi")
    Observable<Object> uploadPendingTreatResult(@QueryMap Map<String, String> options, @Part MultipartBody.Part params);

    //超标处置提交
    @Multipart
    @POST("swScsjcxController.do?appSWChaobiaoChuzhi")
    Observable<Object> uploadSWPendingTreatResult(@QueryMap Map<String, String> options, @Part MultipartBody.Part params);


    //超标处置提交
    @POST("swScsjcxController.do?appSwChaobiaoShenpi")
    Observable<Object> uploadSWSHResult(@QueryMap Map<String, String> options);



}
