package com.example.hsproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    private ImageButton backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_main);

/***********/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {//版本号大于4.4
            Transition explode = TransitionInflater.from(this).inflateTransition(R.transition.explode);
            getWindow().setEnterTransition(explode);//第一次进入时动画
        }
/***********/
        findViewById(R.id.signup1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showDialog();
            }
        });



        /** 返回按钮*/

        backB=(ImageButton)findViewById(R.id.bt_back);
        backB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CreateAccountActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }));

    }

    //显示对话框
    protected void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        builder.setTitle("회원가입");//设置标题
        builder.setMessage("회원 가입 하시겠습니까?");//设置信息
        builder.setIcon(R.mipmap.ic_launcher);//设置icon 也就是图像
        builder.setPositiveButton("로기인 하로 가기 ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /*
                dialog.dismiss();
                CreateAccountActivity.this.finish();//结束当前Activity 结束当前画面*/
                Intent intent=new Intent(CreateAccountActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.create().show();

    }
}