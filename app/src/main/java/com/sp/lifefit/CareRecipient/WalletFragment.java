package com.sp.lifefit.CareRecipient;

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
    private TextView name_displayed,creditcardno_displayed,expdate_displayed;

    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_card, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        addcardbtn = rootView.findViewById(R.id.addcardbtn);

        name_displayed = rootView.findViewById(R.id.name_on_card);
        creditcardno_displayed = rootView.findViewById(R.id.card_number);
        expdate_displayed = rootView.findViewById(R.id.card_expiry_date);

        String name = getActivity().getIntent().getStringExtra("name");
        String creditcardno = getActivity().getIntent().getStringExtra("creditcardno");
        String expdate = getActivity().getIntent().getStringExtra("expdate");

        name_displayed.setText(name);
        creditcardno_displayed.setText(creditcardno);
        expdate_displayed.setText(expdate);

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
