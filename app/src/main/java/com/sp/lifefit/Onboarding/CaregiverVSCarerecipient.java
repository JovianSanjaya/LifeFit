package com.sp.lifefit.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.sp.lifefit.CareRecipient.LambSaladDetails;
import com.sp.lifefit.R;

public class CaregiverVSCarerecipient extends AppCompatActivity {

    private ImageButton carerecipientbtn;
    private ImageButton caregiverbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caregiver_vs_carerecipient);

        carerecipientbtn = findViewById(R.id.carerecipientbtn);
        caregiverbtn = findViewById(R.id.caregiverbtn);

        carerecipientbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaregiverVSCarerecipient.this, LambSaladDetails.class);
                startActivity(intent);
                finish();
            }
        });

        caregiverbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaregiverVSCarerecipient.this, Login.class);
                startActivity(intent);
                finish();
            }
        });


    }
}