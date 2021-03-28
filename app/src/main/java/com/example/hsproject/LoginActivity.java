package com.example.hsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class LoginActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    /** 设置ImageButton点击事件时 不能像一般Button一样 直接使用private Button ... ; 而是要使用 private ImageButton ...;
     * 并且设置监听是也是要加入ImageButton 例:LoginButton= (ImageButton) findViewById(R.id.login_1);
     */

    /** btn1为 바탕화면호이동
     *  LoginButton 为Login
     *  Cab=reateAccountActivity 移动button 缩写
     */


    private ImageButton LoginButton,Cab,backB;
    Button btn1;
    TextView logoutB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
/**************************************************************/
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            Transition slide = TransitionInflater.from(this).inflateTransition(R.transition.fade);
            getWindow().setEnterTransition(slide);
            getWindow().setExitTransition(slide);
        }
        /**************************************************************/
        /** 点击返回主界面后 直接回到主界面的代码*/

/** 下面一行为 登入按钮点击之后 移动到主界面的点击事件*/
        LoginButton= (ImageButton) findViewById(R.id.login_1);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        /** 下面一行为 还没有账户 点击注册账户后跳转到注册界面的 代码*/
        Cab=(ImageButton) findViewById(R.id.create_account);
        Cab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        /** 返回按钮*/

        backB=(ImageButton)findViewById(R.id.bt_back);
        backB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }));

    }
    /*
    private View.OnClickListener onClickListener=new View.OnClickListener(){
        @Override
        public void onClick(View v){

            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);


        }
    };*/



}
