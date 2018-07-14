package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class square_prism_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_prism_volume);
    }

    public void work(View a){

        EditText width = (EditText)findViewById(R.id.widthID);
        EditText height = (EditText)findViewById(R.id.heightID);
        EditText length = (EditText) findViewById(R.id.lengthID);
        TextView answer = (TextView)findViewById(R.id.answer);

        if(width.length()==0||height.length()==0||length.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //P = W * H * L
            double WidthCON = Double.parseDouble(width.getText().toString());
            double HeightCON = Double.parseDouble(height.getText().toString());
            double LenCON = Double.parseDouble(length.getText().toString());

            double answer_total = WidthCON * HeightCON * LenCON;
            answer.setText("Your volume is "+answer_total+"m^3");

        }

    }
}
