package com.sp.lifefit.CareRecipient;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.sp.lifefit.CareRecipient.BottomNavigation.ChatFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.EventFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.HomeFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.WalletFragment;
import com.sp.lifefit.HelpCenterFragment;
import com.sp.lifefit.R;

public class MainCareRecipient extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    private BottomNavigationView bottom_nav_bar;
    private DrawerLayout fragment_container;
    private FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_carerecipient);
        
        //nav bottom drawer
        bottom_nav_bar = findViewById(R.id.bottomnavigation);
        bottom_nav_bar.setSelectedItemId(R.id.Home_bottom);
        fragment_container = findViewById(R.id.fragment_container);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        bottomMenu();
        
        
        //nav drawer
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       fragment_container = findViewById(R.id.fragment_container);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, fragment_container, R.string.open_nav, R.string.close_nav);
        fragment_container.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(navSelected);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    NavigationView.OnNavigationItemSelectedListener navSelected = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            int id = item.getItemId();
            if (id == R.id.nav_home){
                fragment = new HomeFragment();
            }
            else if (id == R.id.nav_helpcentre) {
                fragment = new HelpCenterFragment();
            }
            else if (id == R.id.nav_editprofile) {
                fragment = new HomeFragment();
            }
            else if (id == R.id.nav_termsofservice) {
                fragment = new HomeFragment();
            }
            else if (id == R.id.nav_aboutus) {
                fragment = new HomeFragment();
            }
            else if (id == R.id.nav_exit) {
                finishAffinity();
            }
           
            fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
            fragment_container.closeDrawer(GravityCompat.START);
            return true;
        }
    };

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
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        });

    }


}