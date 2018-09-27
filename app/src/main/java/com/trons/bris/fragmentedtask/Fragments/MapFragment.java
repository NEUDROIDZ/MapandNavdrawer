package com.trons.bris.fragmentedtask.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.trons.bris.fragmentedtask.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public MapFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        UiSettings uiSettings = mMap.getUiSettings();
        uiSettings.setMyLocationButtonEnabled(true);
        uiSettings.setCompassEnabled(true);
        uiSettings.setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        LatLng AD = new LatLng(7.323870,13.583640);
        LatLng CE = new LatLng(3.861770,11.518750);
        LatLng ES = new LatLng(4.575470,13.684600);
        LatLng FN = new LatLng(10.603240,14.322580);
        LatLng LT = new LatLng(4.054860,9.698720);
        LatLng NO = new LatLng(9.300000,13.400010);
        LatLng NW = new LatLng(5.958050,10.147510);
        LatLng SO = new LatLng(2.918480,11.147970);
        LatLng SW = new LatLng(4.153740,9.243970);
        LatLng WE = new LatLng(5.485660,10.412990);
        LatLng LIMBE = new LatLng(4.023550,9.209440);
        LatLng BAMS = new LatLng(6.019990,10.268350);
        LatLng ELAK = new LatLng(6.244910,10.490730);
        LatLng MAMF = new LatLng(5.751940,9.320940);
        LatLng SABG = new LatLng(6.011460,10.319750);
        mMap.addMarker(new MarkerOptions().position(AD).title("NGOUNDERE"));
        mMap.addMarker(new MarkerOptions().position(CE).title("YAOUNDE"));
        mMap.addMarker(new MarkerOptions().position(ES).title("BERTOUA"));
        mMap.addMarker(new MarkerOptions().position(FN).title("MAROUA"));
        mMap.addMarker(new MarkerOptions().position(LT).title("DOUALA"));
        mMap.addMarker(new MarkerOptions().position(NO).title("GAROUA"));
        mMap.addMarker(new MarkerOptions().position(NW).title("BAMENDA"));
        mMap.addMarker(new MarkerOptions().position(SO).title("EBOLOWA"));
        mMap.addMarker(new MarkerOptions().position(SW).title("BUEA"));
        mMap.addMarker(new MarkerOptions().position(WE).title("BAFOUSSAM"));
        mMap.addMarker(new MarkerOptions().position(LIMBE).title("LIMBE"));
        mMap.addMarker(new MarkerOptions().position(BAMS).title("BAMBILI"));
        mMap.addMarker(new MarkerOptions().position(ELAK).title("OKU"));
        mMap.addMarker(new MarkerOptions().position(MAMF).title("MAMFE"));
        mMap.addMarker(new MarkerOptions().position(SABG).title("SABGA"));
        mMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NW));

    }
}
