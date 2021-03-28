package com.example.hsproject;



import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.versionedparcelable.ParcelField;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**--ActivityMain 작성자 Kenan 날짜: 2021-2-15~~~2021-8-미정 -- */

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Button btn, btn2, btn3;

    ImageButton menuB,loginB,settingB,scmB,cmnB,orderB,noticeB,ins,github,hspage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.draw);










        /*一下全部都是 按钮点击事件设置**/
        //학교 홈페이지 이동
        /** 隐式调用Intent,指定Intent的action是Intent.ACTION_VIEW; */
        hspage=(ImageButton)findViewById(R.id.hspage);
        hspage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("http://www.gunpo-ebiz.hs.kr");
                intent.setData(uri);
                startActivity(intent);
            }
        });


        //github 이
        github=(ImageButton)findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Uri uri=Uri.parse("https://github.com/gao01java/Hsproject");
                intent.setData(uri);
                startActivity(intent);
            }
        });





        //ins 이동
        ins=(ImageButton)findViewById(R.id.ins);
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("https://www.instagram.com/s2._.mple/");
                intent.setData(uri);
                startActivity(intent);
            }
        });



        noticeB=(ImageButton)findViewById(R.id.notice);
        noticeB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,NoticeActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        orderB=(ImageButton)findViewById(R.id.order);
        orderB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,OrderActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });


        cmnB=(ImageButton)findViewById(R.id.community);
        cmnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,CommunityActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });



        scmB=(ImageButton)findViewById(R.id.schoolmeal);
        scmB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,SchoolmealACtivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        menuB = (ImageButton) findViewById(R.id.ic_menu);
        menuB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });


        loginB=(ImageButton)findViewById(R.id.loginChange_Activity);
        loginB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        settingB=(ImageButton) findViewById(R.id.setting_activity);
        settingB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                    Toast.makeText(MainActivity.this,"手机操作系统版本过低",Toast.LENGTH_SHORT).show();
                    return ;
                }
                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
               // Intent intent=new Intent(MainActivity.this,SettingActivity.class);
                //startActivity(intent);
            }


        });

    }
}