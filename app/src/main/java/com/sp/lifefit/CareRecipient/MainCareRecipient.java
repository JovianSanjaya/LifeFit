package com.sp.lifefit.CareRecipient;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sp.lifefit.R;

public class








MainCareRecipient extends AppCompatActivity {

    private BottomNavigationView bottom_nav_bar;
    private ConstraintLayout fragment_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_carerecipient);

        bottom_nav_bar = findViewById(R.id.bottomnavigation);
        bottom_nav_bar.setSelectedItemId(R.id.Home_bottom);
        fragment_container = findViewById(R.id.fragmeent_container);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmeent_container, new HomeFragment()).commit();
        bottomMenu();

    }

    private void bottomMenu(){
        bottom_nav_bar.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId() == R.id.Home_bottom){
                fragment = new HomeFragment();
            }
            else if (item.getItemId() == R.id.Activity_bottom) {
                fragment = new EventFragment();

            } else if ((item.getItemId() == R.id.Chat_bottom)) {
                fragment = new ChatFragment();

            } else if ((item.getItemId() == R.id.Wallet_bottom)) {
                fragment = new WalletFragment();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmeent_container, fragment).commit();
            return true;
        });

    }


}