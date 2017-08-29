package com.laminar.calculator.calculator;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText Number1, Number2;
    Button add, subtract,divide, multiply, power;

    double enps_result;
    //premative float variable
    double num1, num2;
    //premative int variable
    double enps_secondary;
    //for power calculation

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.enps_result);

        Number1 = (EditText)findViewById(R.id.Number1);
        Number2 = (EditText)findViewById(R.id.Number2);

        add = (Button)findViewById(R.id.sumof);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.bleh);
        divide = (Button)findViewById(R.id.divide);
        power = (Button)findViewById(R.id.Power);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if((Number1.length() == 0)||(Number2.length()==0))
                {
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }
                else {
                    num1 = Double.parseDouble(Number1.getText().toString());
                    num2 = Double.parseDouble(Number2.getText().toString());
                    enps_result = num1 + num2;
                    result.setText(String.valueOf(enps_result));
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length()==0)||(Number2.length()==0)){
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }else {
                    num1 = Double.parseDouble(Number1.getText().toString());
                    num2 = Double.parseDouble(Number2.getText().toString());
                    enps_result = num1 - num2;
                    result.setText(String.valueOf(enps_result));
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length()==0)||(Number2.length()==0)){
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }else {
                    num1 = Double.parseDouble(Number1.getText().toString());
                    num2 = Double.parseDouble(Number2.getText().toString());
                    enps_result = num1 * num2;
                    result.setText(String.valueOf(enps_result));
                }
            }
        });
        power.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length()==0)||(Number2.length()==0)){
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }else {
                    num1 = Double.parseDouble(Number1.getText().toString());
                    num2 = Double.parseDouble(Number2.getText().toString());
                    enps_secondary = num1 * num1;
                    enps_result = num1 * enps_secondary;
                    result.setText(String.valueOf(enps_result));
                }
            }
        });


        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length()==0)||(Number2.length()==0)){
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }else {
                num1 = Double.parseDouble(Number1.getText().toString());
                num2 =Double.parseDouble(Number2.getText().toString());
                enps_result = num1 / num2;
                result.setText(String.valueOf(enps_result));
            }}
        });

    }
}
