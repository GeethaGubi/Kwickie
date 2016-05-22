package com.candidatetest.geetha.kwickie.main;

import com.candidatetest.kwickie.retrofit.KwickieData;
import java.util.List;

/**
 * Created by geetha on 21/05/2016.
 */
public interface PullVideoData {
    interface OnCompleteListener {
        void onComplete(List<KwickieData> items);
        void onIncomplete();
    }

    void pullVideoData(OnCompleteListener onCompleteListener);
}
