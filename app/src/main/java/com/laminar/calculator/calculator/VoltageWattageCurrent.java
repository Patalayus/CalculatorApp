package com.laminar.calculator.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VoltageWattageCurrent extends AppCompatActivity {
    Button wattage, amperage, voltage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voltage_wattage_current);

        wattage = (Button)findViewById(R.id.wattageID);
        voltage = (Button)findViewById(R.id.voltageID);
        amperage = (Button)findViewById(R.id.amperageID);
    }
    public void wattageclick(View v){
        if(v.getId()==R.id.wattageID){
            Intent gowattage = new Intent(VoltageWattageCurrent.this, wattage.class);
            startActivity(gowattage);
        }
    }
    public void voltageclick(View v){
        if(v.getId()==R.id.voltageID){
            Intent govoltage = new Intent(VoltageWattageCurrent.this, voltage.class);
            startActivity(govoltage);
        }
    }
    public void amerpageclick(View v){
        if(v.getId()==R.id.amperageID){
            Intent goamp = new Intent(VoltageWattageCurrent.this, amperage.class);
            startActivity(goamp);
        }
    }
}
