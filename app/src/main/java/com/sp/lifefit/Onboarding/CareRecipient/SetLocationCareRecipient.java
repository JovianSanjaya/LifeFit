package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sp.lifefit.R;;
import java.util.List;
import java.util.Locale;

public class SetLocationCareRecipient extends AppCompatActivity implements LocationListener {
    private AppCompatButton setlocationbtn;
    private AppCompatButton nextbtn;
    private TextView locationdisplayed;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.setlocation_onboarding);

        setlocationbtn = findViewById(R.id.setlocation_onboarding_btn);
        nextbtn = findViewById(R.id.nextbtn_setlocation);
        locationdisplayed = findViewById(R.id.location_displayed);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetLocationCareRecipient.this, HealthProfileCareRecipient.class);
                startActivity(intent);
            }
        });

        if(ContextCompat.checkSelfPermission(SetLocationCareRecipient.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(SetLocationCareRecipient.this,new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION
            },100);
        }


        setlocationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getlocation();
            }
        });
    }

    @SuppressLint("MissingPermission")
    private void getlocation(){
        try {
            locationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000,5, SetLocationCareRecipient.this);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        Toast.makeText(this, ""+location.getLatitude()+","+location.getLongitude(), Toast.LENGTH_SHORT).show();

        try {
            Geocoder geocoder = new Geocoder(SetLocationCareRecipient.this, Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(),location.getLongitude(),1);
            String address = addresses.get(0).getAddressLine(0);
            locationdisplayed.setText(address);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onLocationChanged(@NonNull List<Location> locations) {
        LocationListener.super.onLocationChanged(locations);
    }

    @Override
    public void onFlushComplete(int requestCode) {
        LocationListener.super.onFlushComplete(requestCode);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        LocationListener.super.onStatusChanged(provider, status, extras);
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        LocationListener.super.onProviderEnabled(provider);
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        LocationListener.super.onProviderDisabled(provider);
    }
}