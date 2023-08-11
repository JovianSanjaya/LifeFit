package com.sp.lifefit.Payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.Onboarding.SliderAdapter;
import com.sp.lifefit.R;

import java.util.ArrayList;

public class Payment extends AppCompatActivity {
    private AppCompatButton nextbtn;
    private ViewPager viewPager;
    ArrayList<Integer> images = new ArrayList<>();
    PaymentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        viewPager = findViewById(R.id.viewpager_payment);
        images.add(R.drawable.cardpay);
        images.add(R.drawable.cashpay);

        adapter = new PaymentAdapter(this,images);
        viewPager.setAdapter(adapter);



        nextbtn = findViewById(R.id.nextbtn_payment);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment.this, PaymentSuccessful.class);
                startActivity(intent);
                finish();
            }
        });

    }
}