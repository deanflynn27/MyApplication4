package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity   {

    private TextView mTextMessage;
    private ViewPager mViewPager;
    private CustomPagerAdapter mCustomPagerAdapter;

    private GoogleMap mMap;
    Fragment frag = null;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_Explore:



                    Intent explore = new Intent(getBaseContext(),MapsActivity.class);
                    startActivity(explore);

                    mTextMessage.setText(R.string.title_Explore);
                    return true;
                case R.id.navigation_home:
                    /*Intent in = new Intent(getBaseContext(),MainActivity.class);
                            startActivity(in);*/
                    //setContentView(R.layout.activity_main);
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_planner:
                    Intent planner = new Intent(getBaseContext(),RoutePlanner.class);
                    startActivity(planner);
                   // mTextMessage.setText(R.string.title_dashboard);
                    return true;
            }

            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager = (ViewPager)findViewById(R.id.pager);
        CustomPagerAdapter customView = new CustomPagerAdapter(this);
        mViewPager.setAdapter(customView);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
