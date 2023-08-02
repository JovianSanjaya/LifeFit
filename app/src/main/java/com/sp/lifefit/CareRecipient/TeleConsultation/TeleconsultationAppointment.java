package com.sp.lifefit.CareRecipient.TeleConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.sp.lifefit.R;

public class TeleconsultationAppointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teleconsultation_appointment);

        Intent intent = new Intent(TeleconsultationAppointment.this, TeleConsultationDoctorList.class );
        startActivity(intent);
        finish();

    }
}