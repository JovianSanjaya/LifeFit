package com.sp.lifefit.CareRecipient.HomeTherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

public class HomeTherapyCalendar extends AppCompatActivity {

    private Button confirmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hometherapy_calender);

        confirmbtn = findViewById(R.id.confirm_order_btn);
        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeTherapyCalendar.this, Payment.class);
                startActivity(intent);
                finish();
            }
        });
    }
}