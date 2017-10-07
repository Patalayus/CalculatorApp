package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class gravitationalpotential extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravitationalpotential);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Enter your mass, gravitational potential energy and height", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void AllWorkAndNoPlay(View a){
        EditText finalvel = (EditText)findViewById(R.id.finalvelo);
        EditText time = (EditText)findViewById(R.id.timea);
        EditText area = (EditText)findViewById(R.id.areaz);

        double finalvel2 = Double.parseDouble(finalvel.getText().toString());
        double time1 = Double.parseDouble(time.getText().toString());
        double area1 = Double.parseDouble(area.getText().toString());

        if(finalvel.length()==0||time.length()==0||area.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //S = V T - 1/2 * A T ^2
            double enps_VT = finalvel2 * time1;
            double enps_AT2 = (area1*time1)*(area1*time1);
            double enps_rest = 0.5*enps_AT2;

            double variabletotal = enps_VT - enps_rest;

            TextView enps_total4all = (TextView)findViewById(R.id.textView10);
            enps_total4all.setText("Your total is "+variabletotal+"m");

        }
    }
    }


