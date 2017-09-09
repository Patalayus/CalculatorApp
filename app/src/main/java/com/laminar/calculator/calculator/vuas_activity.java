package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class vuas_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vuas_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Substitute values into the SUVAT equation provided", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });}
    public void onPressWorkThrough(View a){
        EditText initial_id1 = (EditText)findViewById(R.id.velocity1);
        EditText area_id1 = (EditText)findViewById(R.id.area1);
        EditText time_id1 = (EditText)findViewById(R.id.time1);

        double enps_InitialVelocity1 = Double.parseDouble(initial_id1.getText().toString());
        double enps_areaid1 = Double.parseDouble(area_id1.getText().toString());
        double enps_time1id = Double.parseDouble(time_id1.getText().toString());

        if(initial_id1.length()==0||area_id1.length()==0||time_id1.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //V ^2 = U ^2 + 2 * A S
            double enps_2AS = 2*(enps_areaid1*enps_time1id);
            double enps_U2 = enps_InitialVelocity1*enps_InitialVelocity1;
            double allwork = enps_U2 + enps_2AS;
            TextView asdasda = (TextView)findViewById(R.id.allthroughtext);
            asdasda.setText("Your total is "+allwork+"m^2");

        }
    }
    }


