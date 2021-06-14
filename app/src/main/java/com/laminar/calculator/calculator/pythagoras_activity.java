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

    public void loadOpposite(View a){
        //when opposite button is pressed
        if(a.getId()==R.id.oppositeID){
            Intent opposite_intent = new Intent(pythagoras_activity.this, opposite.class);
            startActivity(opposite_intent);
        }
    }

    public void loadAdjacentActivity(View a){
        //when adjacent activity is activated
        if(a.getId()==R.id.adjacentID){
            Intent adjacent_intent = new Intent(pythagoras_activity.this, adjacent.class);
            startActivity(adjacent_intent);
        }

    }
}
