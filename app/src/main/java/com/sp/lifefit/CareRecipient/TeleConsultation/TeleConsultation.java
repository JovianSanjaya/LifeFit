package com.sp.lifefit.CareRecipient.TeleConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp.lifefit.R;

public class TeleConsultation extends AppCompatActivity {

    private Button requestnowbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tele_consultation_request);

        requestnowbtn = findViewById(R.id.requestnow_teleconsulatation);
        requestnowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeleConsultation.this, TeleconsultationAppointment.class );
                startActivity(intent);
                finish();

            }
        });

    }
}