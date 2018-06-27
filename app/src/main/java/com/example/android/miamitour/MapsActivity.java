package com.example.android.miamitour;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapNavItem);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private List<Marker> markers = new ArrayList<Marker>();

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        Marker wynwood = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(25.803837, -80.199304))
                .title(getString(R.string.wynwood)));
        markers.add(wynwood);

        Marker overtown = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(25.783714, -80.195917))
                .title(getString(R.string.overtown)));
        markers.add(overtown);

        Marker littleHavana = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(25.765960, -80.216489))
                .title(getString(R.string.littleHavana)));
        markers.add(littleHavana);

        Marker opalacka = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(25.905179, -80.251258))
                .title(getString(R.string.opalocka)));
        markers.add(opalacka);

        zoomIntoLocation(25.783714, -80.195917, 12);
    }

    private void goToLocation(double lat, double lng) {
        LatLng ll = new LatLng(lat, lng);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(ll);
        mMap.moveCamera(cameraUpdate);
    }

    private void zoomIntoLocation(double lat, double lang, float zoomLevel) {
        LatLng ll = new LatLng(lat, lang);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(ll, zoomLevel);
        mMap.moveCamera(cameraUpdate);
    }
}
