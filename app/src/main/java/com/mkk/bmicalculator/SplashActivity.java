package com.mkk.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent iMain = new Intent(SplashActivity.this, MainActivity.class);
        new Handler().postDelayed(() -> {
            startActivity(iMain);
            finish();
        }, 2000);
    }
}