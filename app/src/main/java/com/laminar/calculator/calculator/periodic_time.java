package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class periodic_time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_time);
    }
    public void frequency(View a){
        EditText frequencyID = (EditText)findViewById(R.id.frequencyID);
        TextView answer = (TextView)findViewById(R.id.answer);
        if(frequencyID.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //1 / Periodic Time
            double CONfreq = Double.parseDouble(frequencyID.getText().toString());
            double answer_total = 1 / CONfreq;
            answer.setText("The periodic time is "+answer_total+"s");
        }
    }
}
