package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Start" , Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this, "Resume" , Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this, "Pause" , Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(this, "ReStart" , Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "Stop" , Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "Destroy" , Toast.LENGTH_SHORT).show();
//    }

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
