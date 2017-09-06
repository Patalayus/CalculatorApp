package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class v_uat_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_uat_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Please enter your initial velocity, area and time"
                        , Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }});
    }
    public void onClickVelocity(View a){
        EditText initial_id = (EditText)findViewById(R.id.initial_id);
        EditText area_id = (EditText)findViewById(R.id.area_id);
        EditText time_id = (EditText)findViewById(R.id.time_id);

        if (initial_id.length()==0||area_id.length()==0||time_id.length()==0){
            Snackbar Reminder = Snackbar.make(a, "Please enter numbers to use for calculation", Snackbar.LENGTH_LONG);
            Reminder.show();
            //show notification if user has not entered a number
        }else if(a.getId() == R.id.velocity_calculation){
            double enps_InitialVelocity = Double.parseDouble(initial_id.getText().toString());
            double enps_Area = Double.parseDouble(area_id.getText().toString());
            double enps_Time = Double.parseDouble(time_id.getText().toString());
            //V=U+AT
            double enps_AT = enps_Area * enps_Time;
            double enps_VUAT = enps_InitialVelocity + enps_AT;
            TextView VelocityOutput = (TextView)findViewById(R.id.VelocityOutput);
            VelocityOutput.setText("Your total velocity is "+enps_VUAT+"ms^-1");

        }
    }
}
