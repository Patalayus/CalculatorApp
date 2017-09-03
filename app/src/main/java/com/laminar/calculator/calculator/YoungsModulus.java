package com.laminar.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class YoungsModulus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youngs_modulus);
    }
    public void YoungsCalculation(View a){
        EditText force;
        EditText area;
        EditText changelength;
        EditText length;

        force = (EditText)findViewById(R.id.F_ID);
        area = (EditText)findViewById(R.id.A_ID);
        changelength = (EditText)findViewById(R.id.DeltaL_ID);
        length = (EditText)findViewById(R.id.L_ID);



    }
}

