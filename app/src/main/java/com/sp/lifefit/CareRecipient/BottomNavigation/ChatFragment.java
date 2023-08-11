package com.sp.lifefit.CareRecipient.BottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sp.lifefit.CareRecipient.Chat.Chat;
import com.sp.lifefit.R;

public class ChatFragment extends Fragment {

    private CardView anamwp;
    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        anamwp = rootView.findViewById(R.id.anamwp);
        anamwp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Chat.class);
                startActivity(intent);
            }
        });

        return rootView;

    }




}
