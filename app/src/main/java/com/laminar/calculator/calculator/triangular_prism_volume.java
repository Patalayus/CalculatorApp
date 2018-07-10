package com.laminar.calculator.calculator;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class triangular_prism_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangular_prism_volume);

        }
    public void work2(View a){
        EditText height = (EditText)findViewById(R.id.heightID);
        EditText width = (EditText)findViewById(R.id.widthID);
        EditText
        TextView answer = (TextView)findViewById(R.id.answerID);

        if(height.length()==0||width.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            // Volume of triangular prism = (w * h)/2
            double heiCON = Double.parseDouble(height.getText().toString());
            double widCON = Double.parseDouble(width.getText().toString());
            double total = heiCON * widCON;
            double total2 = total / 2;
            double total3 = total

            double totalradCON = Math.PI * radCONSQR;
            double answer_total = totalradCON * lenCON;
            output.setText("Your volume is "+answer_total+"m^3");
        }
    }
}
