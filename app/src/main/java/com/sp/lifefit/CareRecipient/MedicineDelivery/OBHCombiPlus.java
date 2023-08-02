package com.sp.lifefit.CareRecipient.MedicineDelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.sp.lifefit.R;

public class OBHCombiPlus extends AppCompatActivity {
    private ImageButton gobackbtn;
    private AppCompatButton checkoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drugs_detail);

        gobackbtn = findViewById(R.id.go_back_button_drugs_detail);

        gobackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OBHCombiPlus.this, MedicinePharmacy.class);
                startActivity(intent);
                finish();
            }
        });

        checkoutbtn = findViewById(R.id.checkoutbtn);
        checkoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OBHCombiPlus.this, MyCartMedicineDelivery.class);
                startActivity(intent);
                finish();
            }
        });
    }
}