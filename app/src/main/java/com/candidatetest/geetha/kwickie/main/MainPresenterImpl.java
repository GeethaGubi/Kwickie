package com.candidatetest.geetha.kwickie.main;

import android.content.Context;
import android.os.Handler;

import com.candidatetest.kwickie.retrofit.KwickieData;

import java.util.List;

/**
 * Created by geetha on 21/05/2016.
 */
public class MainPresenterImpl implements MainPresenter, PullVideoData.OnCompleteListener {

    private MainView mainView;
    private PullVideoData pullVideoData;

    MainPresenterImpl(MainView mainView, Context context) {
        this.mainView = mainView;
        pullVideoData = new PullVideoDataImpl(context);
    }

    @Override
    public void onResume() {
        pullVideoData.pullVideoData(this);

    }

    @Override
    public void onCreate() {
        mainView.showProgress();
    }


    @Override
    public void onComplete(final List<KwickieData> items) {
        //5 seconds delay is for the image (thumbnails) to be downloaded fully
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mainView.hideProgress();
                mainView.setItems(items);
            }
        }, 5000);

    }

    @Override
    public void onIncomplete() {
        mainView.showError();
    }
}
