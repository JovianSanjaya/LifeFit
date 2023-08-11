package com.sp.lifefit.Caregiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.CareRecipient.BottomNavigation.HomeDoctorListOnActivity;
import com.sp.lifefit.CareRecipient.BottomNavigation.MealArrangementListOnActivity;
import com.sp.lifefit.R;

public class HomeFragmentCareGiver extends Fragment {

    private Context mContext;
    private CardView meal;
    private CardView homedoctor;



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_requests_list_caregiver, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        meal = rootView.findViewById(R.id.meal_arrangement_onactivity_caregiver);
        homedoctor = rootView.findViewById(R.id.home_doctor_list_onactivity_caregiver);

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



        return rootView;
    }
}
