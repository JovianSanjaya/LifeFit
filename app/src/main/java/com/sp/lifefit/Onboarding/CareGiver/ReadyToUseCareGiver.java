package com.sp.lifefit.Onboarding.CareGiver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.sp.lifefit.R;

public class ReadyToUseCareGiver extends AppCompatActivity {
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ready_to_use_caregiver);

        nextbtn = findViewById(R.id.nextbtn_readytouse);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadyToUseCareGiver.this, CompleteRegistrationCareGiver.class);
                startActivity(intent);
            }
        });

    }
}