package com.sp.lifefit.CareRecipient.BottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.CareRecipient.AddCard.AddCard;
import com.sp.lifefit.R;

public class WalletFragment extends Fragment {

    private AppCompatButton addcardbtn;


    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_card, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        addcardbtn = rootView.findViewById(R.id.addcardbtn);

        addcardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddCard.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
