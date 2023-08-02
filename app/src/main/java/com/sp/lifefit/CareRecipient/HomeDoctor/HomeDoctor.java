package com.sp.lifefit.CareRecipient.HomeDoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class HomeDoctor extends AppCompatActivity {

    private CardView drluke;
    private ImageButton gobackbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_doctors);

        drluke = findViewById(R.id.drluke);
        gobackbtn = findViewById(R.id.gobackbtn_mydoctors);
        drluke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDoctor.this, DrLukeWhitesell.class);
                startActivity(intent);
                finish();
            }
        });

        gobackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeDoctor.this, MainCareRecipient.class);
                startActivity(intent);
                finish();
            }
        });

    }
}