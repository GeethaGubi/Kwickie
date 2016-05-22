package com.candidatetest.kwickie.retrofit;


import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;


/**
 * Created by geetha on 19/05/2016.
 */
public interface KwickieVideoService {

    @POST("Members/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);

    @GET("kwickies/approved")
    Call<KwickieData[]> getVideoData(@Query("access_token") String accessToken);

    @GET
    Call<ResponseBody> download(@Url String fileUrl);

}
