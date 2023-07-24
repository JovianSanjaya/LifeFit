package com.sp.lifefit.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.R;

public class HomePersonalCare extends AppCompatActivity {
    private CardView meal,housekeeping;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_personal_care_nursing);

        meal = findViewById(R.id.meal_arrangement);
        housekeeping = findViewById(R.id.housekeeping);

        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePersonalCare.this, MealMenu.class );
                startActivity(intent);
                finish();
            }
        });

        housekeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePersonalCare.this, Housekeeping.class);
                startActivity(intent);
                finish();
            }
        });

    }
}