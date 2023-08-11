package com.sp.lifefit.CareRecipient.TeleConsultation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.sp.lifefit.CareRecipient.HomeDoctor.HomeDoctor;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class TeleConsultation extends AppCompatActivity {

    private Button requestnowbtn;
    private ImageButton backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tele_consultation_request);

        requestnowbtn = findViewById(R.id.requestnow_teleconsulatation);
        backbtn = findViewById(R.id.tele_consultation_back_button);
        requestnowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeleConsultation.this, HomeDoctor.class );
                startActivity(intent);
                finish();

            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TeleConsultation.this, MainCareRecipient.class );
                startActivity(intent);
                finish();

            }
        });


    }
}