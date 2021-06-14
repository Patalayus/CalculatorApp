package com.laminar.calculator.calculator;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class opposite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opposite);
    }

    //complete application calculation here
    //b^2 = c^2 - a^2
    //opposite = hypotenuse - adjacent

    public void calculateOpp(View a) {
        EditText adjacent = (EditText) findViewById(R.id.adjacentTextView);
        EditText hypotenuse = (EditText) findViewById(R.id.hypotenuseTextView);
        TextView answerTextView1 = (TextView) findViewById(R.id.textView32);

        if(adjacent.length()==0||hypotenuse.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //convert the text to a double format so math can be applied
            double totAdj = Double.parseDouble(adjacent.getText().toString());
            double totHyp = Double.parseDouble(hypotenuse.getText().toString());

            double AdjSqrd = totAdj * totAdj;
            double HypSqrd = totHyp * totHyp;
            double Opp2Root = HypSqrd - AdjSqrd;
            double tot = Math.sqrt(Opp2Root);

            //output answer
            answerTextView1.setText("Your opposite is "+tot+"m");
        }

    }


}