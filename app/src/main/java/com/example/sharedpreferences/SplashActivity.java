package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {
  private  static  int Time= 2000;
    MySharedPref mySharedPref;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
           mySharedPref=new MySharedPref(SplashActivity.this);

           new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(mySharedPref.getStatus().equals("true"))
                {
                    Intent i = new Intent(SplashActivity.this,MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    Intent i = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);

                }

            }
        },Time);
    }
}