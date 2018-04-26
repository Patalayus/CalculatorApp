package com.laminar.calculator.calculator;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class velocity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocity);
    }
    public void vel(View a){
        EditText frequency = (EditText)findViewById(R.id.frequencyID);
        EditText wavelength = (EditText)findViewById(R.id.wavelengthID);
        Button calculate = (Button)findViewById(R.id.calculate);
        TextView answer = (TextView)findViewById(R.id.answer);
        if(frequency.length()==0||wavelength.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            //V = Wavelength * Frequency
            double frequencyCON = Double.parseDouble(frequency.getText().toString());
            double wavelengthCON = Double.parseDouble(wavelength.getText().toString());
            double answer_total = wavelengthCON * frequencyCON;
            answer.setText("Your velocity is "+answer_total);
        }
    }
}
