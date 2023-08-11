package com.sp.lifefit.Caregiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.sp.lifefit.CareRecipient.BottomNavigation.HomeDoctorListOnActivity;
import com.sp.lifefit.CareRecipient.BottomNavigation.MealArrangementListOnActivity;
import com.sp.lifefit.R;

public class JovianRequestsList extends AppCompatActivity {

    private Context mContext;
    private CardView meal;
    private CardView homedoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_delivery_list);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JovianRequestsList.this, MealArrangementListOnActivity.class);
                startActivity(intent);
            }
        });

        homedoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JovianRequestsList.this, HomeDoctorListOnActivity.class);
                startActivity(intent);
            }
        });

    }
}
