package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Momentum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momentum);
    }
    public void work(View a){
        EditText mass = (EditText)findViewById(R.id.mass);
        EditText velocity = (EditText)findViewById(R.id.velocity);
        Button calculate = (Button)findViewById(R.id.calculate);
        TextView answer = (TextView)findViewById(R.id.answer);
        if(mass.length()==0||velocity.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //P = M * V
            double massCON = Double.parseDouble(mass.getText().toString());
            double velocityCON = Double.parseDouble(velocity.getText().toString());
            double answer_total = massCON * velocityCON;
            answer.setText("Your momentum is "+answer_total+"kgm/s");

        }

    }
}

