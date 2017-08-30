package com.laminar.calculator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityCircle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);}

        public void RadiusCalculation(View a){
            EditText RadiusVariable = (EditText)findViewById(R.id.radius_text);
            if(RadiusVariable.length()==0){
                Snackbar Reminder = Snackbar.make(a, "Please enter a number", Snackbar.LENGTH_LONG);
                Reminder.show();
            }else if (a.getId() == R.id.calculateButton_ID)
            {
                double ConvertedR = Double.parseDouble(RadiusVariable.getText().toString());
                double RadHalf = ConvertedR * ConvertedR;
                double RadComp = Math.PI * RadHalf;
                TextView TextViewV = (TextView)findViewById(R.id.output_text);
                TextViewV.setText(""+RadComp);
                RadiusVariable.setText("");
            }
    }
}
