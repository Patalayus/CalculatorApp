package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class amperage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amperage);

    }
    public void work(View a){
        TextView answer = (TextView)findViewById(R.id.answerID);
        EditText voltage = (EditText)findViewById(R.id.voltageID);
        EditText wattage = (EditText)findViewById(R.id.wattageID);
        Button output = (Button)findViewById(R.id.calculateID);
        if(voltage.length()==0||wattage.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //V / W
            double convoltage = Double.parseDouble(voltage.getText().toString());
            double conwattage = Double.parseDouble(wattage.getText().toString());

            double total = conwattage / convoltage;
            answer.setText("Your total is "+total+"A");

        }
    }
}
