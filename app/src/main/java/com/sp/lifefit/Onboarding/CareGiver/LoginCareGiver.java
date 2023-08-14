package com.sp.lifefit.Onboarding.CareGiver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.sp.lifefit.CareRecipient.MainCareRecipient;
import com.sp.lifefit.Caregiver.MainCareGiver;
import com.sp.lifefit.R;

import java.util.Objects;

public class LoginCareGiver extends AppCompatActivity {

    private TextView donthaveacc;
    private AppCompatButton nextloginbtn;

    private EditText loginemail,loginpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        donthaveacc = findViewById(R.id.donthaveaccount);
        nextloginbtn = findViewById(R.id. nextbtn_login);
        loginemail = findViewById(R.id.emailinput);
        loginpassword = findViewById(R.id.passwordinput);


        nextloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!ValidateEmail() || !ValidatePassword()){


                }
                else {
                    checkUser();
                }
            }
        });
        donthaveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginCareGiver.this, SignUpCareGiver.class);
                startActivity(intent);
            }
        });


    }


    public Boolean ValidateEmail(){

        String val = loginemail.getText().toString();
        if(val.isEmpty()){
            loginemail.setError("Email cannot be empty");
            return  false;
        }
        else {
            loginemail.setError(null);
            return true;
        }

    }

    public Boolean ValidatePassword(){

        String val = loginpassword.getText().toString();
        if(val.isEmpty()){
            loginpassword.setError("Password cannot be empty");
            return  false;
        }
        else {
            loginpassword.setError(null);
            return true;
        }

    }

    public void checkUser(){
        String userEmail = loginemail.getText().toString().trim();
        String userPassword = loginpassword.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance("https://lifefit-c080f-default-rtdb.asia-southeast1.firebasedatabase.app").getReference("Caregivers");
        Query checkUserDatabase = reference.orderByChild("email").equalTo(userEmail);



        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    loginemail.setError(null);
                    String passwordFromDB = snapshot.child(userPassword).child("password").getValue(String.class);

                    if(Objects.equals(passwordFromDB,userPassword)){
                        loginemail.setError(null);
                        Intent intent =new Intent(LoginCareGiver.this, MainCareGiver.class);
                        startActivity(intent);
                    }
                    else {
                        loginpassword.setError("Invalid Credentials");
                        loginpassword.requestFocus();
                    }
                }
                else {
                    loginemail.setError("User does not exist");
                    loginemail.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}