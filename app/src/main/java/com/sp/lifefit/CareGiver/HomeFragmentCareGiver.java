package com.sp.lifefit.CareGiver;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.R;

public class HomeFragmentCareGiver extends Fragment {

    private Context mContext;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_requests_list_caregiver, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        return rootView;
    }
}
