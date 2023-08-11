package com.sp.lifefit.CareRecipient.HomeTherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

public class HomeTherapyCalendar extends AppCompatActivity {

    private Button confirmbtn;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hometherapy_calender);

        confirmbtn = findViewById(R.id.confirm_order_btn);
        backbtn = findViewById(R.id.home_therapy_back_button);
        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeTherapyCalendar.this, Payment.class);
                startActivity(intent);
                finish();
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeTherapyCalendar.this, HomeTherapy.class);
                startActivity(intent);
                finish();
            }
        });
    }
}