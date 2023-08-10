package com.sp.lifefit.CareRecipient.HomePersonal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.sp.lifefit.CareRecipient.HomePersonal.Housekeeping.Housekeeping;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealMenuList;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class HomePersonalCare extends AppCompatActivity {
    private CardView meal,housekeeping;
    private ImageButton backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_personal_care_nursing);

        meal = findViewById(R.id.meal_arrangement);
        housekeeping = findViewById(R.id.housekeeping);
        backbtn = findViewById(R.id.backbtn5);

        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePersonalCare.this, MealMenuList.class );
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

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePersonalCare.this, MainCareRecipient.class);
                startActivity(intent);
                finish();
            }
        });

    }
}