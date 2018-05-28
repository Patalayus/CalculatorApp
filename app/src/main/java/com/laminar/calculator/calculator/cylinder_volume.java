package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cylinder_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);
    }
    public void work(View a){
        EditText radius = (EditText)findViewById(R.id.radiusID);
        EditText length = (EditText)findViewById(R.id.lengthID);
        TextView output = (TextView)findViewById(R.id.outputID);

        if(radius.length()==0||length.length()==0){
            Snackbar.make(a, "Please enter your values into the equation", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }else{
            // Volume of cylinder = Length * (3.141592654 * R^2)
            double radCON = Double.parseDouble(radius.getText().toString());
            double lenCON = Double.parseDouble(length.getText().toString());
            double radCONSQR = radCON * radCON;

            double totalradCON = Math.PI * radCONSQR;
            double answer_total = totalradCON * lenCON;
            output.setText("Your volume is "+answer_total+"m^3");
        }
    }
}
