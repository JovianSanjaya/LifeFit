package com.sp.lifefit.Payment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.R;
public class CardPaymentFragment extends Fragment {
    private Context mContext;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_card_payment, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        return rootView;

    }
}
