package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suvt_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suvt_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });}
             public void OnPressWorkOut(View a) {
                 EditText InitialVelocity = (EditText)findViewById(R.id.Initial_ID);
                 EditText FinalVelocity = (EditText)findViewById(R.id.Final_ID);
                 EditText Time = (EditText)findViewById(R.id.Time_ID);

                 double InitialVelocity1 = Double.parseDouble(InitialVelocity.getText().toString());
                 double FinalVelocity1 = Double.parseDouble(FinalVelocity.getText().toString());
                 double Time1 = Double.parseDouble(Time.getText().toString());

                 if(InitialVelocity.length()==0||FinalVelocity.length()==0||Time.length()==0){
                     Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                             .setAction("Action", null).show();
                 }else{
                     //S = 1/2 * ( U + V ) * T
                     double enps_UV = InitialVelocity1 + FinalVelocity1;
                     double enps_TopFinish = enps_UV * Time1;
                     double total_1 = 0.5 * enps_TopFinish;
                     TextView enps_outputS = (TextView)findViewById(R.id.textView9);
                     enps_outputS.setText("Your total is "+total_1+"m");
                 }
    }
}


