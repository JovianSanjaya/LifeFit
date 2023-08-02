package com.sp.lifefit.CareRecipient.AddCard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sp.lifefit.CareRecipient.WalletFragment;
import com.sp.lifefit.R;

import java.util.concurrent.Executor;

public class AddCard extends AppCompatActivity {
    private EditText name,credicardno, expdate;
    private AppCompatButton confirmbtn;

   BiometricPrompt biometricPrompt;
   BiometricPrompt.PromptInfo promptInfo;
   ConstraintLayout mMainlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcard);

        name = findViewById(R.id.fullname);
        credicardno = findViewById(R.id.creditcardnumber);
        expdate = findViewById(R.id.expdate);
        confirmbtn = findViewById(R.id.confirmbtn_addcard);
        mMainlayout = findViewById(R.id.constraintlayout_addcard);


//        String namestr = name.getText().toString();
//        String creditcardnostr = credicardno.getText().toString();
//        String expdatestr = expdate.getText().toString();


        BiometricManager biometricManager = BiometricManager.from(this);
        if(biometricManager.canAuthenticate() == BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE){
            Toast.makeText(this, "Device does not have fingerprint", Toast.LENGTH_SHORT).show();
        }
        else if (biometricManager.canAuthenticate() == BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE) {

            Toast.makeText(this, "Not Working", Toast.LENGTH_SHORT).show();
        }

        else if (biometricManager.canAuthenticate() == BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED) {

            Toast.makeText(this, "No Fingerprint Assigned", Toast.LENGTH_SHORT).show();
        }

        Executor executor = ContextCompat.getMainExecutor(this);
        biometricPrompt=new BiometricPrompt(AddCard.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(AddCard.this, "Fingerprint recognised", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
            }

        });

        promptInfo = new BiometricPrompt.PromptInfo.Builder().setTitle("LifeFit")
                        .setDescription("Use Fingerprint To Login").setDeviceCredentialAllowed(true).build();

        biometricPrompt.authenticate(promptInfo);

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent( AddCard.this, WalletFragment.class);
//                intent.putExtra("name", namestr);
//                intent.putExtra("creditcardno", creditcardnostr);
//                intent.putExtra("expdate", expdatestr);
                startActivity(intent);

            }
        });

    }
}