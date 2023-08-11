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

import com.sp.lifefit.CareRecipient.Chat.Chat;
import com.sp.lifefit.R;

public class ChatFragmentCareGiver extends Fragment {

    private Context mContext;
    private CardView anamwpcaregiver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_chat_list_caregiver, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        anamwpcaregiver = rootView.findViewById(R.id.anamwp_caregiver);
        anamwpcaregiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Chat.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
