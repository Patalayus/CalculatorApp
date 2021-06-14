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
        EditText hypotenuse_ = (EditText) findViewById(R.id.hypotenuseEditText);
        TextView answerTextView2 = (TextView) findViewById(R.id.textViewOutput);

        if(opposite.length()==0||hypotenuse_.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //convert the text to a double format so math can be applied
            double totOpp = Double.parseDouble(opposite.getText().toString());
            double totHyp = Double.parseDouble(hypotenuse_.getText().toString());

            double OppSqrd = totOpp * totOpp;
            double HypSqrd = totHyp * totHyp;
            double Opp2Root = HypSqrd - OppSqrd;
            double tot = Math.sqrt(Opp2Root);

            //output answer
            answerTextView2.setText("Your adjacent is " + tot + "m");
        }

    }
}