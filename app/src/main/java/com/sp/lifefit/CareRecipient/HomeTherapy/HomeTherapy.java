package com.sp.lifefit.CareRecipient.HomeTherapy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.sp.lifefit.R;

public class HomeTherapy extends AppCompatActivity {

    private Button requestbtn;
    private ImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hometherapy_request);

        requestbtn = findViewById(R.id.requestnow_hometherapy);
        backbtn = findViewById(R.id.backbtn2);
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