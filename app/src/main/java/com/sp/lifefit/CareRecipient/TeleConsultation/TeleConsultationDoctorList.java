package com.sp.lifefit.CareRecipient.TeleConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

public class TeleConsultationDoctorList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_doctors_teleconsultation);

        Intent intent = new Intent(TeleConsultationDoctorList.this, Payment.class );
        startActivity(intent);
        finish();

    }
}