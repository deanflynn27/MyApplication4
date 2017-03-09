package com.example.myapplication;

/**
 * Created by flynn on 08/03/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class CustomOnItemSelectedListener extends Activity implements OnItemSelectedListener {
    String s1;
    SharedPreferences prefs;
    private String filename = "Map Preferences";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs= getSharedPreferences(filename, Context.MODE_PRIVATE);
        //getChoice();

    }
    public void getChoice()
    {
        //String opt = (String)prefs.getString(s1,"s");
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
         s1=parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + s1,
                Toast.LENGTH_SHORT).show();

      SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Startpos",s1);
        editor.commit();


    }
      //  sendDate();

  //  }
    public void sendDate(){
        Intent i;

        i = new Intent(CustomOnItemSelectedListener.this,MapsActivity.class);
       // i.putExtra("myloc",s1);
        startActivity(i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}