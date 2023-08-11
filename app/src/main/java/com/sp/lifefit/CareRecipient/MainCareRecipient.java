package com.sp.lifefit.CareRecipient;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.sp.lifefit.CareRecipient.BottomNavigation.ChatFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.EventFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.HomeFragment;
import com.sp.lifefit.CareRecipient.BottomNavigation.WalletFragment;
import com.sp.lifefit.CareRecipient.NavigationDrawer.About;
import com.sp.lifefit.CareRecipient.NavigationDrawer.EditProfileFragment;
import com.sp.lifefit.CareRecipient.NavigationDrawer.HelpCenterFragment;
import com.sp.lifefit.CareRecipient.NavigationDrawer.TermsOfServiceFragment;
import com.sp.lifefit.R;

public class MainCareRecipient extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    private BottomNavigationView bottom_nav_bar;
    private DrawerLayout drawerLayout;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_carerecipient);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        drawerLayout = findViewById(R.id.drawerlayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open_nav,R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        bottom_nav_bar = findViewById(R.id.bottomnavigation);
        bottom_nav_bar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if(itemId == R.id.Home_bottom){
                    openFragment(new HomeFragment());
                    return true;
                }
                else if (itemId == R.id.Activity_bottom) {
                    openFragment(new EventFragment());
                    return true;
                }
                else if (itemId == R.id.Chat_bottom) {
                    openFragment(new ChatFragment());
                    return true;
                }
                else if (itemId == R.id.Wallet_bottom) {
                    openFragment(new WalletFragment());
                    return true;
                }
                return false;
            }
        });

        fragmentManager = getSupportFragmentManager();
        openFragment(new HomeFragment());


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId ==R.id.nav_home){
            openFragment(new HomeFragment());
        }
        else if (itemId ==R.id.nav_helpcentre) {
            openFragment(new HelpCenterFragment());
        }
        else if (itemId ==R.id.nav_editprofile) {
            openFragment(new EditProfileFragment());
        }
        else if (itemId ==R.id.nav_termsofservice) {
            openFragment(new TermsOfServiceFragment());
        }
        else if (itemId ==R.id.nav_aboutus) {
            openFragment(new About());
        }
        else if (itemId ==R.id.nav_exit) {
            finishAffinity();
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    private void openFragment (Fragment fragment){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }



}