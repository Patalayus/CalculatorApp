package com.laminar.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class YoungsModulus extends AppCompatActivity {

    EditText force, area, changelength, length;
    TextView enps_text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youngs_modulus);

        force = (EditText)findViewById(R.id.forceid);
        area = (EditText)findViewById(R.id.A_ID);
        changelength = (EditText)findViewById(R.id.DeltaL_ID);
        length = (EditText)findViewById(R.id.L_ID);
        enps_text = (TextView)findViewById(R.id.bracket);

        force.setHint("Enter your force in newtons (N)");
        area.setHint("Enter your area in square meters (m^2)");
        changelength.setHint("Enter your change in length in meters (m)");
        length.setHint("Enter your original length in meters (m)");
        enps_text.setText(" Work out the Young's Modulus of an object.");
    }
    public void YoungsCalculation(View a){
        double force_v, area_v, change_v, length_v, youngs;

        if(force.length()==0||area.length()==0||changelength.length()==0||length.length()==0){
            Snackbar snackbar = Snackbar.make(a, "Please enter 3 numbers", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
        else if(a.getId() == R.id.calculation){
            TextView outputtext = (TextView)findViewById(R.id.idofoutput);
            youngs = ( Double.parseDouble(force.getText().toString())/Double.parseDouble(area.getText().toString()))
                    /(Double.parseDouble(changelength.getText().toString())/Double.parseDouble(length.getText().toString()));
            outputtext.setText("Young's Modulus: "+youngs+" Pascals");
        }
    }
}
