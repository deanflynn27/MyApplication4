
package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.ClusterManager;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private TextView mTextMessage;
    private GoogleMap mMap;
    SharedPreferences prefs;
    private String filename = "Map Preferences";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent in = new Intent(getBaseContext(),MapsActivity.class);
            switch (item.getItemId()) {

                case R.id.navigation_Explore:

                    return true;
                case R.id.navigation_home:
                    Toast.makeText(getBaseContext(),R.string.title_home,Toast.LENGTH_LONG).show();
                   // mTextMessage.setText(R.string.title_home);
                    Intent Home = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(Home);

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
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
       SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        prefs= getSharedPreferences(filename, Context.MODE_PRIVATE);
        String s = (String)prefs.getString("Startpos","Hi");
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();

//
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng WicklowGaol = new LatLng(52.978899, -6.037291);
        LatLng Powerscourt = new LatLng(53.184251, -6.186633);
        LatLng Curragh = new LatLng(52.978899, -6.037291);
        LatLng Studgarden = new LatLng(53.184251, -6.186633);
        LatLng Birr = new LatLng(52.978899, -6.037291);
        LatLng Clonmacnoise = new LatLng(53.184251, -6.186633);
        LatLng Athlone = new LatLng(52.978899, -6.037291);
        LatLng Uisneach = new LatLng(53.184251, -6.186633);
        LatLng Ironage = new LatLng(52.978899, -6.037291);
        LatLng Hilloftara = new LatLng(53.184251, -6.186633);
        LatLng Boinne = new LatLng(52.978899, -6.037291);
        LatLng Rebelgeneral = new LatLng(53.184251, -6.186633);
        LatLng Crafttolace = new LatLng(52.978899, -6.037291);
        LatLng Youthwarrior = new LatLng(53.184251, -6.186633);
        LatLng Proposalstone = new LatLng(52.978899, -6.037291);
        LatLng Stonewatchmen = new LatLng(53.184251, -6.186633);
        LatLng Temporarytomb = new LatLng(53.184251, -6.186633);
        LatLng Castleleslie = new LatLng(52.978899, -6.037291);
        LatLng Cavanburren = new LatLng(53.184251, -6.186633);
        LatLng Glendalough = new LatLng(53.011980, -6.329840);
        LatLng WonderfulWomen = new LatLng(52.690401, -6.649045);
        LatLng LoughGur = new LatLng(52.516315, -8.533876);
        LatLng RockOfCashel = new LatLng(52.520076, -7.890452);
        LatLng DunmoreCaves = new LatLng(52.733981, -7.246861);
        LatLng KilkennyMile = new LatLng(52.651720, -7.252129);
        LatLng SonOfKing = new LatLng(52.598511, -6.926587);
        LatLng FindingSanta = new LatLng(52.509952, -7.168579);
        LatLng DunbrodyShip = new LatLng(52.393546, -6.947813);
        LatLng WaterfordTriangle = new LatLng(52.260507, -7.108037);
        LatLng WilliamMarshall = new LatLng(52.236909, -6.838077);
        LatLng HookLighthouse = new LatLng(52.123745, -6.929368);
        LatLng CorkCity = new LatLng(51.897402, -8.473266);
        LatLng CorkTreasure = new LatLng(51.808752, -8.278930);
        LatLng TitanicExperience = new LatLng(51.850003, -8.294851);
        LatLng CobhHarbour = new LatLng(51.850527, -8.293227);

        mMap.addMarker(new MarkerOptions().position(WicklowGaol).title("Wicklow Gaol"));
        mMap.addMarker(new MarkerOptions().position(Powerscourt).title("Powerscourt Estate"));
        mMap.addMarker(new MarkerOptions().position(Curragh).title("The Curragh"));
        mMap.addMarker(new MarkerOptions().position(Studgarden).title("Irish National Stud & Gardens"));
        mMap.addMarker(new MarkerOptions().position(Birr).title("Star Gazing"));
        mMap.addMarker(new MarkerOptions().position(Clonmacnoise).title("Clonmacnoise"));
        mMap.addMarker(new MarkerOptions().position(Athlone).title("Athlone Castle"));
        mMap.addMarker(new MarkerOptions().position(Uisneach).title("Hill of Uisneach"));
        mMap.addMarker(new MarkerOptions().position(Ironage).title("Iron Age Road"));
        mMap.addMarker(new MarkerOptions().position(Hilloftara).title("Hill of Tara"));
        mMap.addMarker(new MarkerOptions().position(Boinne).title("Brú na Boinne"));
        mMap.addMarker(new MarkerOptions().position(Rebelgeneral).title("The Rebel General"));
        mMap.addMarker(new MarkerOptions().position(Crafttolace).title("Craft to Lace"));
        mMap.addMarker(new MarkerOptions().position(Youthwarrior).title("From Youth to Warrior"));
        mMap.addMarker(new MarkerOptions().position(Proposalstone).title("Proposal Stones"));
        mMap.addMarker(new MarkerOptions().position(Stonewatchmen).title("Silent Stone Watchman"));
        mMap.addMarker(new MarkerOptions().position(Temporarytomb).title("A Temporary Tomb"));
        mMap.addMarker(new MarkerOptions().position(Castleleslie).title("Castle Leslie Estate"));
        mMap.addMarker(new MarkerOptions().position(Cavanburren).title("Cavan Burren Park"));
        mMap.addMarker(new MarkerOptions().position(WonderfulWomen).title("Wonderful Women"));
        mMap.addMarker(new MarkerOptions().position(LoughGur).title("Lough Gur"));
        mMap.addMarker(new MarkerOptions().position(RockOfCashel).title("Rock of Cashel"));
        mMap.addMarker(new MarkerOptions().position(DunmoreCaves).title("Dunmore Caves"));
        mMap.addMarker(new MarkerOptions().position(KilkennyMile).title("Kilkenny Medevil Mile"));
        mMap.addMarker(new MarkerOptions().position(SonOfKing).title("Son of a King"));
        mMap.addMarker(new MarkerOptions().position(FindingSanta).title("Finding Santa"));
        mMap.addMarker(new MarkerOptions().position(DunbrodyShip).title("Dunbrody Famine Ship"));
        mMap.addMarker(new MarkerOptions().position(WaterfordTriangle).title("Waterford Viking Triangle"));
        mMap.addMarker(new MarkerOptions().position(WilliamMarshall).title("William Marshall"));
        mMap.addMarker(new MarkerOptions().position(HookLighthouse).title("Hook Lighthouse"));
        mMap.addMarker(new MarkerOptions().position(CorkCity).title("Cork- The Merchant City"));
        mMap.addMarker(new MarkerOptions().position(CorkTreasure).title("Cork Defended Treasure"));
        mMap.addMarker(new MarkerOptions().position(TitanicExperience).title("Titanic Experience Cobh"));
        mMap.addMarker(new MarkerOptions().position(CobhHarbour).title("Cobh Harbour"));
        mMap.addMarker(new MarkerOptions().position(Glendalough).title("Glendalough"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DunmoreCaves,8));
    }

    private ClusterManager<MarkerItem> mClusterManager;

    private  void setUpCluster(){
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(52.393546, -6.947813), 8));

        mClusterManager = new ClusterManager<MarkerItem>(this,mMap);

        mMap.setOnCameraIdleListener(mClusterManager);
        mMap.setOnMarkerClickListener(mClusterManager);
        addItems();
    }

    private void addItems(){
        double lat = 52.520076;
        double lng = -7.890452;
        for (int i = 0; i < 10; i++){
            double offset = i/60d;
            lat = lat + offset;
            lng = lng + offset;
            MarkerItem offsetItem = new MarkerItem(lat,lng);
            mClusterManager.addItem(offsetItem);
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}

