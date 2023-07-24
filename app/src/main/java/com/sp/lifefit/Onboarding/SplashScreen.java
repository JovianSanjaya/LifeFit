package com.sp.lifefit.Onboarding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.sp.lifefit.R;

public class SplashScreen extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView text;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo = findViewById(R.id.logo_splashscreen);
        text = findViewById(R.id.text_splashscreen);

        logo.setAnimation(topAnim);
        text.setAnimation(bottomAnim);

        mediaPlayer = mediaPlayer.create(this, R.raw.audio);
        mediaPlayer.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Activity_OnBoarding1.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}

