package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class wattage extends AppCompatActivity {
    EditText voltage, current;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wattage);

        voltage = (EditText)findViewById(R.id.editText1);
        current = (EditText)findViewById(R.id.editText2);
    }

    public void go(View a){

        if(voltage.length()==0||current.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //V * A
            double convoltage = Double.parseDouble(voltage.getText().toString());
            double conamperage = Double.parseDouble(current.getText().toString());

            double total = convoltage * conamperage;
            out = (TextView)findViewById(R.id.textView19);
            out.setText("Your total is "+total+"W");

        }
    }
}
