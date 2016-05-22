package com.candidatetest.geetha.kwickie.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.candidatetest.geetha.kwickie.R;
import com.candidatetest.kwickie.retrofit.KwickieData;
import com.candidatetest.kwickie.retrofit.KwickieVideoService;
import com.devbrackets.android.exomedia.EMVideoView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    ArrayList<String> kwickieVideoUrl = new ArrayList<>();
    EMVideoView videoView = null;
    KwickieVideoService videoService = null;
    RecyclerView recyclerView;
    ProgressBar progress;
    TextView status;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        presenter = new MainPresenterImpl(this,this);

        recyclerView = (RecyclerView) findViewById(R.id.videoDataView);
        progress = (ProgressBar) findViewById(R.id.progress);
        status = (TextView) findViewById(R.id.status);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        presenter.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void showProgress() {
        status.setVisibility(View.VISIBLE);
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        hideStatusFromUser();

    }

    private void hideStatusFromUser() {
        if(status.getVisibility() == View.VISIBLE) {
            status.setVisibility(View.GONE);
        }

        if(progress.getVisibility() == View.VISIBLE) {
            progress.setVisibility(View.GONE);
        }
    }

    @Override
    public void setItems(List<KwickieData> items) {
        recyclerView.setAdapter(new VideoDataListAdapter(this,items));
    }

    @Override
    public void showError() {
        hideStatusFromUser();
        Toast errorToast = Toast.makeText(this,
                "Error fetching Kwickie Data",
                Toast.LENGTH_SHORT);
        errorToast.show();
    }

}
