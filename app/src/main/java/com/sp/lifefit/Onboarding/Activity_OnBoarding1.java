package com.sp.lifefit.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp.lifefit.R;

public class Activity_OnBoarding1 extends AppCompatActivity {

    private Button GetStartedbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);

        GetStartedbutton = findViewById(R.id.GetStartedbtn);
        GetStartedbutton.setOnClickListener(onclick);

    }

    View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Activity_OnBoarding1.this, CaregiverVSCarerecipient.class);
            startActivity(intent);

        }
    };

}