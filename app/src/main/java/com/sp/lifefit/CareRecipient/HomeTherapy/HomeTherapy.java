package com.sp.lifefit.CareRecipient.HomeTherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp.lifefit.R;

public class HomeTherapy extends AppCompatActivity {

    private Button requestbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hometherapy_request);

        requestbtn = findViewById(R.id.requestnow_hometherapy);
        requestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeTherapy.this, HomeTherapyCalendar.class);
                startActivity(intent);
                finish();
            }
        });

    }
}