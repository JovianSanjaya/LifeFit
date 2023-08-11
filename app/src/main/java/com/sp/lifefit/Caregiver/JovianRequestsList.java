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
    private CardView medicine;
    private CardView houseKeeping;
    private CardView HomeTherapy;
    private CardView TeleConsult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jovian_carerecipient);
        meal = findViewById(R.id.meal_arrangement_onactivity_caregiver);
        homedoctor = findViewById(R.id.home_doctor_list_onactivity_caregiver);
        medicine = findViewById(R.id.medicine_delivery_list_onactivity);
        houseKeeping = findViewById(R.id.housekeeping_list_onactivity);
        HomeTherapy = findViewById(R.id.home_therapy_list_onactivity);
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

        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JovianRequestsList.this, MedicineDeliveryListOnActivityCaregiver.class);
                startActivity(intent);
            }
        });
        houseKeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JovianRequestsList.this, HousekeepingOnActivityCaregiver.class);
                startActivity(intent);
            }
        });

        HomeTherapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JovianRequestsList.this, HomeTherapyOnActivityCaregiver.class);
                startActivity(intent);
            }
        });







    }
}
