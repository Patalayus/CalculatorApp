package com.laminar.calculator.calculator;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class hypotenuse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypotenuse);
    }

    public void calculateHyp(View a) {
        EditText opposite = (EditText) findViewById(R.id.editText_opposite);
        EditText adjacent = (EditText)findViewById(R.id.editText_adjacent);
        TextView answerTextView = (TextView)findViewById(R.id.textView_answerID);

        if(opposite.length()==0||adjacent.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //convert the text to a double format so math can be applied
            double totOpp = Double.parseDouble(opposite.getText().toString());
            double totAdj = Double.parseDouble(adjacent.getText().toString());

            //complete application calculation here
            //a^2 + b^2 = c^2

            double totOppSquared = totOpp*totOpp;
            double totAjdSquared = totAdj*totAdj;
            double hypTotal = totAjdSquared + totOppSquared;

            //output answer
            answerTextView.setText("Your hypotenuse is "+hypTotal);
        }

    }
}
