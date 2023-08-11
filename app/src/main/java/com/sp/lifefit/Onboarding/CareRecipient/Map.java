package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sp.lifefit.R;

public class Map extends AppCompatActivity {

    GoogleMap googleMap;

    MapView mapView;
    Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        // Initialize the GoogleMap instance
        mapView.getMapAsync(googleMap -> {
            this.googleMap = googleMap; // Assign the GoogleMap instance

            // You can configure the map here if needed

            // Call the method to request location updates
            requestLocationUpdates();
        });
    }

    private void requestLocationUpdates() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                // Handle the new location
                updateMapLocation(location); // Call method to update map with new location
            }
        };

        // Check for location permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            // TODO: Request permissions here if not granted
            return;
        }

        // Request location updates
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }

    private void updateMapLocation(Location location) {
        // Update the map with the new location
        LatLng currentLatLng = new LatLng(location.getLatitude(), location.getLongitude());
        if (googleMap != null) {
            googleMap.clear(); // Clear existing markers
            googleMap.addMarker(new MarkerOptions().position(currentLatLng).title("Current Location"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 15));
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
}
