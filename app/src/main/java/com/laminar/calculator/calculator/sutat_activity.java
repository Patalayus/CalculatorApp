package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sutat_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sutat_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "substitute values into the equation", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });}
    public void onPressExecute(View a){
        EditText initial_id1 = (EditText)findViewById(R.id.initialvelocityid);
        EditText area_id1 = (EditText)findViewById(R.id.area2id);
        EditText time_id1 = (EditText)findViewById(R.id.time2is);

        double enps_InitialVelocity1 = Double.parseDouble(initial_id1.getText().toString());
        double enps_areaid1 = Double.parseDouble(area_id1.getText().toString());
        double enps_time1id = Double.parseDouble(time_id1.getText().toString());

        if(initial_id1.length()==0||area_id1.length()==0||time_id1.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //S =U * T + 1/2 * AT^2
            double enps_UmultT = enps_InitialVelocity1 * enps_time1id;
            double enps_end = (enps_areaid1*enps_time1id)*(enps_areaid1*enps_time1id);
            double enps_total22 = enps_UmultT+0.5*enps_end;
            TextView enps_total222 = (TextView)findViewById(R.id.outputtextshsh);
            enps_total222.setText("Your total is "+enps_total22);

        }
    }
}


