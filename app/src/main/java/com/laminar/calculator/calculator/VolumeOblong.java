package com.laminar.calculator.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VolumeOblong extends AppCompatActivity {

    Button cylinder, squarebased_prism, triangularbased_prism, octagonalbased_prism;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_oblong);

        cylinder = (Button)findViewById(R.id.button4);
        squarebased_prism = (Button)findViewById(R.id.squarebasedID);
        triangularbased_prism = (Button)findViewById(R.id.triangularbasedID);
        octagonalbased_prism = (Button)findViewById(R.id.octagonalbasedID);
    }
    public void gocylinder(View v){
        if(v.getId()==R.id.button4){
            Intent gocylinder = new Intent(VolumeOblong.this, cylinder_volume.class);
            startActivity(gocylinder);
        }

    }
    public void gosquareprism(View v){
        if(v.getId()==R.id.squarebasedID){
            Intent gosquarebased = new Intent(VolumeOblong.this, cylinder_volume.class);
            startActivity(gosquarebased);
        }

    }
    public void gotriangleprism(View v){
        if(v.getId()==R.id.triangularbasedID){
            Intent gotriangular = new Intent(VolumeOblong.this, cylinder_volume.class);
            startActivity(gotriangular);
        }

    }
    public void gooctagonalprism(View v){
        if(v.getId()==R.id.octagonalbasedID){
            Intent gooctagonal = new Intent(VolumeOblong.this, cylinder_volume.class);
            startActivity(gooctagonal);
        }

    }
}
