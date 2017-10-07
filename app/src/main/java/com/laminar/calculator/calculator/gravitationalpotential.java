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
    public void GPEACT(View a){
        EditText massdec = (EditText)findViewById(R.id.massid);
        EditText strengthdec = (EditText)findViewById(R.id.strengthid);
        EditText heightdec = (EditText)findViewById(R.id.heightid);


        if(massdec.length()==0||strengthdec.length()==0||heightdec.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //E = mgh
            double conmass = Double.parseDouble(massdec.getText().toString());
            double constrength = Double.parseDouble(strengthdec.getText().toString());
            double conheight = Double.parseDouble(heightdec.getText().toString());

            double enps_TOTGPE = conmass * constrength * conheight;
            TextView enps_out1 = (TextView)findViewById(R.id.sda);
            enps_out1.setText("Your total is "+enps_TOTGPE);

        }
    }
    }


