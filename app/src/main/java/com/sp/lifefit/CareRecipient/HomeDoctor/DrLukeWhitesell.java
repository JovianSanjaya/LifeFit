package com.sp.lifefit.CareRecipient.HomeDoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

public class DrLukeWhitesell extends AppCompatActivity {

    private AppCompatButton nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_details);

        nextbtn = findViewById(R.id.nextbtn_appointmentdetails);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrLukeWhitesell.this, Payment.class);
                startActivity(intent);
                finish();
            }
        });

    }
}