package com.sp.lifefit.CareRecipient.NavigationDrawer;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.R;

public class About extends Fragment {

    private Context mContext;
    private AppCompatButton homebtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.about, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        homebtn = rootView.findViewById(R.id.buttontogobackhome);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainCareRecipient.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}    