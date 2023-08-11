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
    private CardView jovianCarerecipient;



    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_requests_list_caregiver, container, false);

        mContext = getActivity();


        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);






        return rootView;
    }
}
