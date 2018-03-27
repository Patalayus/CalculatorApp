package com.laminar.calculator.calculator;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RefractiveIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refractive_index);

    }
    public void SinCalculate(View a){
        EditText iID = (EditText)findViewById(R.id.iID);
        EditText rID = (EditText)findViewById(R.id.rID);
        TextView out = (TextView)findViewById(R.id.answerID);

        if(iID.length()==0||rID.length()==0){
            Snackbar no_input = Snackbar.make(a, "Please enter a number", Snackbar.LENGTH_LONG);
            no_input.show();
        }else if(a.getId() == R.id.calculateID){
            double Convertedi = Double.parseDouble(iID.getText().toString());
            double Convertedr = Double.parseDouble(rID.getText().toString());
            double SINi = Math.sin(Convertedi);
            double SINr = Math.sin(Convertedr);
            double tot = SINi / SINr;

            out.setText("Refractive Index: "+tot);
            iID.setText("");
            rID.setText("");


        }

    }
}
