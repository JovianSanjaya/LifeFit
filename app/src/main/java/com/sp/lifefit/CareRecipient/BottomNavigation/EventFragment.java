package com.sp.lifefit.CareRecipient.BottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sp.lifefit.CareRecipient.HomeDoctor.DoctorAdapter;
import com.sp.lifefit.CareRecipient.HomeDoctor.DoctorDetails;
import com.sp.lifefit.CareRecipient.HomeDoctor.DoctorListDetails;
import com.sp.lifefit.CareRecipient.HomeDoctor.HomeDoctorHelper;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealCartAdapter;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealDetails;
import com.sp.lifefit.CareRecipient.HomePersonal.MealArrangement.MealHelper;
import com.sp.lifefit.Onboarding.CareRecipient.SignUpCareRecipient;
import com.sp.lifefit.R;

import java.util.List;

public class EventFragment extends Fragment {

    private Context mContext;
    private CardView meal;
    private CardView homedoctor;
    private CardView medicine;
    private CardView houseKeeping;
    private CardView homeTherapy;
    private CardView teleConsult;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_activity_carerecipient, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        meal = rootView.findViewById(R.id.meal_arrangement_onactivity);
        homedoctor = rootView.findViewById(R.id.home_doctor_list_onactivity);
        medicine = rootView.findViewById(R.id.medicine_delivery_list_onactivity);
        houseKeeping = rootView.findViewById(R.id.housekeeping_list_onactivity);
        homeTherapy = rootView.findViewById(R.id.home_therapy_list_onactivity);
        teleConsult = rootView.findViewById(R.id.tele_consultation_list_onactivity);

        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MealArrangementListOnActivity.class);
                startActivity(intent);
            }
        });

        homedoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeDoctorListOnActivity.class);
                startActivity(intent);
            }
        });

        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MedicineDeliveryOnActivity.class);
                startActivity(intent);
            }
        });

        houseKeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HouseKeepingOnActivity.class);
                startActivity(intent);
            }
        });

        homeTherapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeTherapyOnActivity.class);
                startActivity(intent);
            }
        });

        teleConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TeleConsultationsOnActivity.class);
                startActivity(intent);
            }
        });

        return rootView;

    }

}

