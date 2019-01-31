package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class octagonal_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octagonal_volume);
    }

    public void work(View a){
        EditText width = (EditText) findViewById(R.id.widthID);
        EditText height = (EditText)findViewById(R.id.heightID);
        EditText length = (EditText)findViewById(R.id.lengthID);
        TextView textout = (TextView)findViewById(R.id.TextOutID);

        if(width.length()==0 || height.length() == 0 || length.length() == 0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //V = A of the base x h
            // V = ( width * length) * height
            double width2 = Double.parseDouble(width.getText().toString());
            double height2 = Double.parseDouble(height.getText().toString());
            double length2 = Double.parseDouble(length.getText().toString());

            double area = width2 * length2;
            double total = height2 * area;

            textout.setText("Your volume is "+total+"m^3");

        }
    }

}
