package com.laminar.calculator.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pythagoras_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythagoras_activity);
    }

    public void loadHypotenuse(View a) {
        //when hypotenuse button is pressed
        if(a.getId()==R.id.hypotenuseID){
            Intent hypotenuse_Intent = new Intent(pythagoras_activity.this, hypotenuse.class);
            startActivity(hypotenuse_Intent);
        }
    }
}
