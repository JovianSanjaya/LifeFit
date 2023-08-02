package com.sp.lifefit.CareRecipient.AddCard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sp.lifefit.CareRecipient.WalletFragment;
import com.sp.lifefit.R;

public class AddCard extends AppCompatActivity {
    private EditText name,credicardno, expdate;
    private AppCompatButton confirmbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcard);

        name = findViewById(R.id.fullname);
        credicardno = findViewById(R.id.creditcardnumber);
        expdate = findViewById(R.id.expdate);
        confirmbtn = findViewById(R.id.confirmbtn_addcard);

        String namestr = name.getText().toString();
        String creditcardnostr = credicardno.getText().toString();
        String expdatestr = expdate.getText().toString();

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( AddCard.this, WalletFragment.class);
                intent.putExtra("name", namestr);
                intent.putExtra("creditcardno", creditcardnostr);
                intent.putExtra("expdate", expdatestr);
                startActivity(intent);

            }
        });

    }
}