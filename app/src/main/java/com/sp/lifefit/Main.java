package com.sp.lifefit;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    private ImageButton caregiver_signup_button ;
    private ImageButton carereciepient_signup_button;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.caregiver_vs_carerecipient);

        caregiver_signup_button = findViewById(R.id.caregiverbtn);
        //caregiver_signup_button.setOnClickListener(caregiverClick);

        carereciepient_signup_button = findViewById(R.id.carerecipientbtn);
        //carereciepient_signup_button.setOnClickListener();



    }
}
