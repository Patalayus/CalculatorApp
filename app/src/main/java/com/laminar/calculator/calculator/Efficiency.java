package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Efficiency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efficiency);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

    }
    public void go(View a){
        EditText EO = (EditText)findViewById(R.id.energyoutput);
        EditText EI = (EditText)findViewById(R.id.energyinput);
        Button make = (Button)findViewById(R.id.workout);

        if(EO.length()==0||EI.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{

            double oe = Double.parseDouble(EO.getText().toString());
            double ei = Double.parseDouble(EI.getText().toString());
            double stage1 = oe / ei;
            double stage2 = stage1 * 100;

            TextView VIEW = (TextView)findViewById(R.id.textView15);
            VIEW.setText("Efficiency: "+stage2+"%");
        }
    }

}
