package com.sp.lifefit.Onboarding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import com.sp.lifefit.R;

public class SplashScreen extends AppCompatActivity {
    private static final int SPLASH_DELAY = 3000;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Activity_OnBoarding1.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DELAY);
    }


}

