package com.candidatetest.geetha.kwickie.video;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.candidatetest.geetha.kwickie.R;
import com.devbrackets.android.exomedia.EMVideoView;

public class VideoActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener {
    EMVideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Intent intent = getIntent();
        if(intent.hasExtra("videourl")) {
            String videoURL = intent.getStringExtra("videourl");

            videoView = (EMVideoView) findViewById(R.id.videoView);
            videoView.setOnPreparedListener(this);

            if(videoURL != null && !videoURL.equals("")) {
                videoView.setVideoURI(Uri.parse(videoURL));
            }
        }
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        videoView.start();
    }
}
