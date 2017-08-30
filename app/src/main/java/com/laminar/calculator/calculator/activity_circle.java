package com.laminar.calculator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Chill on 30/08/2017.
 */

public class activity_circle extends Activity {
    EditText radius;
    TextView output_text;
    double enps_radius;
    double enps_half;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        radius = (EditText)findViewById(R.id.radius_text);
        //A=π*R^2
        enps_half = Double.parseDouble(radius.getText().toString()) * Double.parseDouble(radius.getText().toString());
        enps_radius = Math.PI * enps_half;
        output_text.setText(String.valueOf(enps_radius));

    }
}
