package com.candidatetest.geetha.kwickie.main;

import com.candidatetest.kwickie.retrofit.KwickieData;

import java.util.List;

/**
 * Created by geetha on 21/05/2016.
 */
public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<KwickieData> items);

    void showError();
}
