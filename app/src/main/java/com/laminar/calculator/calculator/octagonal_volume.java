package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class octagonal_volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octagonal_volume);
    }

    public void work(View a){
        EditText width = (EditText) findViewById(R.id.widthID);
        EditText height = (EditText)findViewById(R.id.heightID);
        EditText length = (EditText)findViewById(R.id.lengthID);

    }

}
