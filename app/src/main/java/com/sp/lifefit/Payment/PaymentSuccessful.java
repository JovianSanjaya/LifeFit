package com.sp.lifefit.Payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class PaymentSuccessful extends AppCompatActivity {

    private AppCompatButton nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_method_success);

        nextbtn = findViewById(R.id.nextbtn_successfulpayment);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentSuccessful.this, MainCareRecipient.class);
                startActivity(intent);
            }
        });
    }
}