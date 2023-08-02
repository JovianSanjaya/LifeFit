package com.sp.lifefit.CareGiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sp.lifefit.CareRecipient.ChatFragment;
import com.sp.lifefit.CareRecipient.EventFragment;
import com.sp.lifefit.CareRecipient.HomeFragment;
import com.sp.lifefit.CareRecipient.WalletFragment;
import com.sp.lifefit.R;

public class MainCareGiver extends AppCompatActivity {

    private BottomNavigationView bottom_nav_bar;
    private ConstraintLayout fragment_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_caregiver);

        bottom_nav_bar = findViewById(R.id.bottom_navigation_caregiver);
        bottom_nav_bar.setSelectedItemId(R.id.Home_bottom);
        fragment_container = findViewById(R.id.fragment_container_caregiver);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_caregiver, new HomeFragmentCareGiver()).commit();
        bottomMenu();

    }

    private void bottomMenu(){
        bottom_nav_bar.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId() == R.id.home_caregiver){
                fragment = new HomeFragmentCareGiver();
            }
            else if (item.getItemId() == R.id.chat_caregiver) {
                fragment = new ChatFragmentCareGiver();

            } else if ((item.getItemId() == R.id.profile_caregiver)) {
                fragment = new ProfileFragmentCareGiver();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_caregiver, fragment).commit();
            return true;
        });

    }

}