package com.example.hsproject;

import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);


        /** 更改为explode转场*/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            Transition explode = TransitionInflater.from(this).inflateTransition(R.transition.explode);
            getWindow().setEnterTransition(explode);
        }
    }
}
