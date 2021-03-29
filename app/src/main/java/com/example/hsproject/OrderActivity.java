package com.example.hsproject;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    ImageButton backB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main);

        /** 更改为explode专场*/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            Transition explode = TransitionInflater.from(this).inflateTransition(R.transition.explode);
            getWindow().setEnterTransition(explode);
        }




        backB=(ImageButton)findViewById(R.id.bt_back);
        backB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OrderActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }));



    }
}
