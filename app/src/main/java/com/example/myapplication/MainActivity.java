package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylibrary.CircleProgress;

public class MainActivity extends AppCompatActivity {

    private CircleProgress circleProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleProgress = findViewById(R.id.circleProgress);
        circleProgress.setOnCircleProgressListener(new CircleProgress.OnCircleProgressListener() {
            @Override
            public void onProgressChange(int progress) {
                circleProgress.setCircleText(String.valueOf(progress));
            }
        });


    }

    public void start(View view) {
        circleProgress.startAnimProgress(90);
    }

    public void progress(View view) {
        circleProgress.setProgress(50);
    }
}