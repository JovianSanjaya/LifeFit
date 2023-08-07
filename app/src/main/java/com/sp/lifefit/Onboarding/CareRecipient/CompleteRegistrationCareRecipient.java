package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class CompleteRegistrationCareRecipient extends AppCompatActivity {

    private AppCompatButton startexploringbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_registration);

        startexploringbtn = findViewById(R.id.startexploringbtn);
        startexploringbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompleteRegistrationCareRecipient.this, MainCareRecipient.class);
                startActivity(intent);

            }
        });
    }
}