package com.sp.lifefit.CareRecipient.MedicineDelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.R;

public class MedicinePharmacy extends AppCompatActivity {

    private CardView obhcombiplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_delivery_pharmacy);

        obhcombiplus = findViewById(R.id.obh_combi_plus);
        obhcombiplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicinePharmacy.this, OBHCombiPlus.class);
                startActivity(intent);
                finish();
            }
        });





    }
}