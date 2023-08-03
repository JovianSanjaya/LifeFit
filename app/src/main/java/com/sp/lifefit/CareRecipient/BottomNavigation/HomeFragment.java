package com.sp.lifefit.CareRecipient.BottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.CareRecipient.HomePersonal.HomePersonalCare;
import com.sp.lifefit.CareRecipient.HomeDoctor.HomeDoctor;
import com.sp.lifefit.CareRecipient.HomeTherapy.HomeTherapy;
import com.sp.lifefit.CareRecipient.MedicineDelivery.MedicineDelivery;
import com.sp.lifefit.CareRecipient.TeleConsultation.TeleConsultation;
import com.sp.lifefit.R;

public class HomeFragment extends Fragment {
    private Context mContext;

    private CardView Homepersonalcare, Hometherapy, Homedoctor, Teleconsultation, Medicinedelivery;

    private ImageButton Happybtn , Calmbtn , Relaxbtn , Focusbtn;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home_carerecipient, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Homepersonalcare = rootView.findViewById(R.id.Home_Personal_Care_Nursing);
        Hometherapy = rootView.findViewById(R.id.Home_Therapy);
        Homedoctor = rootView.findViewById(R.id.Home_Doctor);
        Teleconsultation = rootView.findViewById(R.id.Tele_Consultation);
        Medicinedelivery = rootView.findViewById(R.id.Medicine_Delivery);

        Happybtn = rootView.findViewById(R.id.happy_button);
        Calmbtn = rootView.findViewById(R.id.calm_button);
        Relaxbtn = rootView.findViewById(R.id.relax_button);
        Focusbtn = rootView.findViewById(R.id.focus_button);

        Happybtn.setOnClickListener(onclickhappy);
        Calmbtn.setOnClickListener(onclickcalm);
        Relaxbtn.setOnClickListener(onclickrelax);
        Focusbtn.setOnClickListener(onclickfocus);

        Homepersonalcare.setOnClickListener(onclickpersonalcare);
        Hometherapy.setOnClickListener(onclicktherapy);
        Homedoctor.setOnClickListener(onclickdoctor);
        Teleconsultation.setOnClickListener(onclickconsultation);
        Medicinedelivery.setOnClickListener(onclickmeddelivery);

        return rootView;

    }

    private View.OnClickListener onclickpersonalcare = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), HomePersonalCare.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onclicktherapy = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), HomeTherapy.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onclickdoctor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), HomeDoctor.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onclickconsultation = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), TeleConsultation.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener onclickmeddelivery = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), MedicineDelivery.class);
            startActivity(intent);

        }
    };

    private View.OnClickListener onclickhappy = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "You are happy!", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener onclickrelax = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "You are relax!", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener onclickcalm = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "You are calm!", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener onclickfocus = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "You are focus!", Toast.LENGTH_SHORT).show();
        }
    };




}
