package com.example.ashu.babypi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements  com.google.android.gms.maps.OnMapReadyCallback{

    
    com.google.android.gms.maps.SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_maps);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
              mapFragment.getMapAsync(this);

                        mapFragment.getMapAsync(new com.google.android.gms.maps.OnMapReadyCallback() {
                    @Override
                    public void onMapReady(GoogleMap googleMap) {
                        googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

                        googleMap.addMarker(new MarkerOptions()
                                .position(new LatLng(28.490004, 77.079162))
                                .title("Here's your Baby")
                                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

                        googleMap.addMarker(new MarkerOptions()
                                .position(new LatLng(28.490009,77.079167))
                                .title("And Here You Are"));



                        googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(new com.google.android.gms.maps.model.CameraPosition.Builder().target(new LatLng(28.490004, 77.079162)).zoom(15.0f).build()));

                    }
                });


    }




  @Override
    public void onMapReady(GoogleMap googleMap) {

      googleMap.addMarker(new MarkerOptions()
              .position(new LatLng(37.4233438, -122.0728817))
              .title("LinkedIn")
              .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4629101,-122.2449094))
                .title("Facebook")
                .snippet("Facebook HQ: Menlo Park"));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.3092293, -122.1136845))
                .title("Apple"));

        googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new LatLng(37.4233438, -122.0728817), 10));

    }}
