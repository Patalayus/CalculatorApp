package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class voltage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voltage);
        //V = W / A
    }
    public void dovoltage(View a){
        TextView answer = (TextView)findViewById(R.id.answerID);
        EditText wattage = (EditText)findViewById(R.id.wattageID);
        EditText amperage = (EditText)findViewById(R.id.amperageID);

        if(wattage.length()==0||amperage.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            double conamperage = Double.parseDouble(amperage.getText().toString());
            double conwattage = Double.parseDouble(wattage.getText().toString());

            double total = conwattage / conamperage;
            answer.setText("Your total is "+total+"V");

        }
    }
}
