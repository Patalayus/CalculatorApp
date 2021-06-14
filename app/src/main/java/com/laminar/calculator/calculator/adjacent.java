package com.laminar.calculator.calculator;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class adjacent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjacent);
    }

    public void calculateAdj(View a) {
        EditText opposite = (EditText) findViewById(R.id.oppositeEditText);
        EditText hypotenuse = (EditText) findViewById(R.id.hypotenuseEditText);
        TextView answerTextView1 = (TextView) findViewById(R.id.textViewOutput);

        if(opposite.length()==0||hypotenuse.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //convert the text to a double format so math can be applied
            double totOpp = Double.parseDouble(opposite.getText().toString());
            double totHyp = Double.parseDouble(hypotenuse.getText().toString());

            //complete application calculation here
            //a^2 = c^2 - b^2
            //adjacent = hypotenuse - opposite

            double oppositeSqrd = totOpp * totOpp;
            double hypotenuseSqrd = totHyp * totOpp;

            double tot2sqr = hypotenuseSqrd - oppositeSqrd;
            double ans = Math.sqrt(tot2sqr);

            //output answer
            answerTextView1.setText("Your adjacent is "+ans+"m");
        }


    }
}