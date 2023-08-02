package com.sp.lifefit.CareRecipient.HomePersonal.Housekeeping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.sp.lifefit.CareRecipient.HomePersonal.HomePersonalCare;
import com.sp.lifefit.R;

public class Housekeeping extends AppCompatActivity {

    private AppCompatButton ordernowbtn;
    private ImageButton gobackbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_service_house_cleaning_order);

        ordernowbtn = findViewById(R.id.ordernowbtn_housekeeping);
        gobackbtn = findViewById(R.id.gobackbtn_detail_service_house_cleaning);
        gobackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housekeeping.this, HomePersonalCare.class);
                startActivity(intent);
                finish();

            }
        });
        ordernowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Housekeeping.this,HomePersonalCare.class);
                startActivity(intent);
                finish();
            }
        });


    }

}