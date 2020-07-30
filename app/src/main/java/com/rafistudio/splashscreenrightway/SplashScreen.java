package com.rafistudio.splashscreenrightway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemClock.sleep(500);
        startActivity(new Intent(SplashScreen.this, MainActivity.class));
        finish();
    }
}