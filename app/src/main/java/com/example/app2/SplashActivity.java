package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById(R.id.welcomelottie);

        lottieAnimationView.animate().translationY(-1500).setDuration(1000).setStartDelay(2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
// This method will be executed once the timer is over
// Start your app main activity
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
// close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }


}
