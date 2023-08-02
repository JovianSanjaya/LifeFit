package com.sp.lifefit.Miscellaneous;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class About extends AppCompatActivity {

    private AppCompatButton homebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        homebtn = findViewById(R.id.buttontogobackhome);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this, MainCareRecipient.class);
                startActivity(intent);
            }
        });
    }
}