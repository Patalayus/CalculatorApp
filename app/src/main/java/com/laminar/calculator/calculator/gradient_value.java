package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gradient_value extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient_value);
    }
    public void run(View a){
        EditText Δx = (EditText)findViewById(R.id.Δx);
        EditText Δy = (EditText)findViewById(R.id.Δy);
        Button calculate = (Button)findViewById(R.id.calculate);
        TextView answer = (TextView)findViewById(R.id.answer);
        if(Δx.length()==0||Δy.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //Δy / Δx
            double ΔxCON = Double.parseDouble(Δx.getText().toString());
            double ΔYCON = Double.parseDouble(Δy.getText().toString());
            double answer_total = ΔYCON / ΔxCON;
            answer.setText("The gradient is "+answer_total);
        }
    }
}
