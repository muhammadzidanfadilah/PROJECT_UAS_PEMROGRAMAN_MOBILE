package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class aksi extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi);

        videoView = findViewById(R.id.fast_x);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.fast_x;
        Uri videoUri = Uri.parse(videoPath);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.setVideoURI(videoUri);
        videoView.start();
    }
}
