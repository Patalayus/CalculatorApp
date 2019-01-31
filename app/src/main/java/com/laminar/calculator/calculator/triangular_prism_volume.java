package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class triangular_prism_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangular_prism_volume);
    }

    public void make(View a) {
        EditText widthV = (EditText)findViewById(R.id.widthID);
        EditText heightV = (EditText)findViewById(R.id.heightID);
        EditText depthV = (EditText)findViewById(R.id.depthID);
        TextView giveuser = (TextView)findViewById(R.id.answerID);

        if(widthV.length()==0||heightV.length()==0||depthV.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            double widthV2 = Double.parseDouble(widthV.getText().toString());
            double heightV2 = Double.parseDouble(heightV.getText().toString());
            double depthV2 = Double.parseDouble(depthV.getText().toString());

            double test = widthV2 * heightV2 * depthV2;
            double test2 = test/2;

            giveuser.setText("Your volume is "+test2+"m^3");
        }

    }

}



