package com.laminar.calculator.calculator;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_suvat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suvat);}

    public void v_uat(View a) {
        //when first suvat button is pressed
        if(a.getId()==R.id.suvat1){
            Intent v_uatIntent = new Intent(activity_suvat.this, v_uat_activity.class);
            startActivity(v_uatIntent);
        }
    }
    public void sutat(View a) {
        //when first sutat button is pressed
        if(a.getId()==R.id.suvat2){
            Intent v_uatIntent1 = new Intent(activity_suvat.this, sutat_activity.class);
            startActivity(v_uatIntent1);
        }
    }

    public void suvt(View a) {
        //when first suvt button is pressed
        if(a.getId()==R.id.suvat3){
            Intent v_uatIntent2 = new Intent(activity_suvat.this, suvt_activity.class);
            startActivity(v_uatIntent2);
        }
    }

    public void vuas(View a) {
        //when first vuas button is pressed
        if(a.getId()==R.id.suvat4){
            Intent v_uatIntent3 = new Intent(activity_suvat.this, vuas_activity.class);
            startActivity(v_uatIntent3);
        }
    }

    public void svtat(View a) {
        //when first svtat button is pressed
        if(a.getId()==R.id.suvat5){
            Intent v_uatIntent4 = new Intent(activity_suvat.this, svtat_activity.class);
            startActivity(v_uatIntent4);
        }
    }
    }


