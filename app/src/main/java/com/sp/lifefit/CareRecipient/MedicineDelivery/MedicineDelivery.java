package com.sp.lifefit.CareRecipient.MedicineDelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class MedicineDelivery extends AppCompatActivity {
    private AppCompatButton requestbtn;
    private ImageButton backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_delivery);

        requestbtn = findViewById(R.id.requestbtn_medicinedelivery);
        backbtn = findViewById(R.id.backbtn3);

        requestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineDelivery.this, MedicinePharmacy.class);
                startActivity(intent);
                finish();
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineDelivery.this, MainCareRecipient.class);
                startActivity(intent);
                finish();
            }
        });

    }
}