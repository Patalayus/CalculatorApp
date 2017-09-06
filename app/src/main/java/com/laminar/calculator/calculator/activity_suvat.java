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
    }

    public void suvt(View a) {
        //when first suvt button is pressed
    }

    public void vuas(View a) {
        //when first vuas button is pressed
    }

    public void svtat(View a) {
        //when first svtat button is pressed
    }
    }


