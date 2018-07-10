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

    public void due(View a) {
        EditText height = (EditText)findViewById(R.id.heightID);
        EditText width = (EditText)findViewById(R.id.widthID);
        EditText depth = (EditText)findViewById(R.id.depthID);
        TextView answer = (TextView)findViewById(R.id.answerID);

        if(height.length() == 0 || width.length() == 0 || depth.length() == 0) {
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else {
            //Volume of triangular prism = (w * h)/2
            double heiCON = Double.parseDouble(height.getText().toString());
            double widCON = Double.parseDouble(width.getText().toString());
            double depCON = Double.parseDouble(depth.getText().toString());
            double total = heiCON * widCON;
            double total2 = total / 2;
            double total3 = total2 * depCON;
            answer.setText("Your volume is" + total3 + "m^3");

        }
    }
}

