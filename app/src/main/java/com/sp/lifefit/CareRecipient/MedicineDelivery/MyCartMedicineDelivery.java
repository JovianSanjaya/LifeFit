package com.sp.lifefit.CareRecipient.MedicineDelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.Payment.Payment;
import com.sp.lifefit.R;

public class MyCartMedicineDelivery extends AppCompatActivity {

    private AppCompatButton checkoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_cart_medicine_delivery);

        checkoutbtn = findViewById(R.id.checkout_drug_button_my_cart);
        checkoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MyCartMedicineDelivery.this, Payment.class);
                startActivity(intent);
                finish();

            }
        });

    }
}