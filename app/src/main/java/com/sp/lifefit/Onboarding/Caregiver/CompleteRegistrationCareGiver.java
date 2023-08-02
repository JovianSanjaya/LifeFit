package com.sp.lifefit.Onboarding.Caregiver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.sp.lifefit.CareGiver.MainCareGiver;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class CompleteRegistrationCareGiver extends AppCompatActivity {

    private AppCompatButton startexploringbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_registration_caregiver);

        startexploringbtn = findViewById(R.id.startexploringbtn);
        startexploringbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompleteRegistrationCareGiver.this, MainCareGiver.class);
                startActivity(intent);

            }
        });
    }
}