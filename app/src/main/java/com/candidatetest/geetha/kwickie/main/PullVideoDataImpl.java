package com.candidatetest.geetha.kwickie.main;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.candidatetest.kwickie.retrofit.KwickieData;
import com.candidatetest.kwickie.retrofit.KwickieVideoService;
import com.candidatetest.kwickie.retrofit.LoginRequest;
import com.candidatetest.kwickie.retrofit.LoginResponse;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PullVideoDataImpl implements PullVideoData {

    KwickieVideoService videoService = null;
    ArrayList<KwickieData> kwickieDataList = null;
    Context context;
    private final String TAG = "PullVideoDataImpl";

    public PullVideoDataImpl(Context context) {
        this.context = context;
    }

    @Override
    public void pullVideoData(final OnCompleteListener onCompleteListener) {

        if(kwickieDataList != null) {
            onCompleteListener.onComplete(kwickieDataList);
        } else {
            Retrofit adapter = new Retrofit.Builder()
                    .baseUrl("https://bigdev.kwickie.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            videoService = adapter.create(KwickieVideoService.class);

            Call<LoginResponse> loginRequest = videoService.login(new LoginRequest("shane.heal@kwickie.com", "password"));

            loginRequest.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    String id = response.body().getId();

                    Call<KwickieData[]> kwickieDataArray = videoService.getVideoData(id);

                    kwickieDataList = new ArrayList<KwickieData>();

                    kwickieDataArray.enqueue(new Callback<KwickieData[]>() {
                                                 @Override
                                                 public void onResponse(Call<KwickieData[]> call, Response<KwickieData[]> response) {
                                                     KwickieData[] kwickieDatas = response.body();
                                                     for(final KwickieData kwickieData : kwickieDatas) {

                                                         final String thumbUrl = kwickieData.getKwickieVideo().getThumbUrl();
                                                         kwickieDataList.add(kwickieData);
                                                         if(thumbUrl != null && !thumbUrl.equals("")) {
                                                                     videoService.download(thumbUrl).enqueue(new Callback<ResponseBody>() {
                                                                         @Override
                                                                         public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                                                             try {
                                                                                 File path = context.getFilesDir();
                                                                                 File file = new File(path, kwickieData.getKwickieVideo().getId().toString()+thumbUrl.substring(thumbUrl.length()-4,thumbUrl.length()));
                                                                                 FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                                                 IOUtils.write(response.body().bytes(), fileOutputStream);
                                                                             } catch (Exception e) {
                                                                                Log.e(TAG,"Vide data fetch error");
                                                                             }
                                                                         }

                                                                         @Override
                                                                         public void onFailure(Call<ResponseBody> call, Throwable t) {

                                                                         }
                                                                     });
                                                         }

                                                     }
                                                     onCompleteListener.onComplete(kwickieDataList);
                                                 }

                                                 @Override
                                                 public void onFailure(Call<KwickieData[]> call, Throwable t) {
                                                     onCompleteListener.onIncomplete();
                                                 }
                                             }
                    );
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    onCompleteListener.onIncomplete();
                }
            });

        }


    }
}
