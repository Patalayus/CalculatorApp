package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class svtat_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svtat_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });}
        public void finalvelocity_ID(View a){
            EditText initial_id1 = (EditText)findViewById(R.id.initialvelocityid);
            EditText area_id1 = (EditText)findViewById(R.id.area2id);
            EditText time_id1 = (EditText)findViewById(R.id.time2is);

            if(initial_id1.length()==0||area_id1.length()==0||time_id1.length()==0){
                Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }else{

            }
        }

    }

