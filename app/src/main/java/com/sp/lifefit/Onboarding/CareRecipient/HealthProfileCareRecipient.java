package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.R;

public class HealthProfileCareRecipient extends AppCompatActivity {

    private AppCompatButton nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_allergic_profile);

        nextbtn = findViewById(R.id.nextbtn_healthprofile_carerecipient);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthProfileCareRecipient.this, ReadyToUseCareRecipient.class);
                startActivity(intent);
            }
        });
    }
}