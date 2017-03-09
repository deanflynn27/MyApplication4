package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flynn on 08/03/2017.
 */


public class RoutePlanner extends AppCompatActivity implements OnItemSelectedListener {
    private Spinner spinner1, spinner2,spinner3;
    SharedPreferences prefs;
    private String filename = "Map Preferences";
    private TextView mTextMessage;
    private Button button;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent in = new Intent(getBaseContext(),MapsActivity.class);
            switch (item.getItemId()) {

                case R.id.navigation_Explore:
                    Intent explore = new Intent(getBaseContext(),MapsActivity.class);
                    startActivity(explore);

                    //mTextMessage.setText(R.string.title_Explore);
                    return true;

                case R.id.navigation_home:
                    Toast.makeText(getBaseContext(),R.string.title_home,Toast.LENGTH_LONG).show();
                    // mTextMessage.setText(R.string.title_home);
                    Intent Home = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(Home);

                    return true;
                case R.id.navigation_planner:
                    //Intent planner = new Intent(getBaseContext(),RoutePlanner.class);
                    //startActivity(planner);
                    // mTextMessage.setText(R.string.title_dashboard);
                    return true;

            }
            return false;
        }

    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    setContentView(R.layout.planner);
        prefs= getSharedPreferences(filename, Context.MODE_PRIVATE);

   Spinner startSpinner = (Spinner) findViewById(R.id.spinner);
       // startSpinner.setOnItemSelectedListener();
      //  String s1 = String.valueOf(startSpinner.getSelectedItem());
       Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
        //startSpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());



        List<String> categories = new ArrayList<String>();
        categories.add("Birr Castle");
        categories.add("Glendalough");
        categories.add("Wicklow Gaol");
        categories.add("Lough Gur");
        categories.add("Athlone Castle");
        categories.add("Hooklight House");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        startSpinner.setAdapter(dataAdapter);


        button = (Button)findViewById(R.id.routebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Route = new Intent(getBaseContext(),PlannedRoute.class);
                startActivity(Route);

            }
        });


        //mTextMessage = (TextView) findViewById(R.id.message);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            String item = adapterView.getItemAtPosition(i).toString();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Startpos",item);
        editor.commit();
        }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
