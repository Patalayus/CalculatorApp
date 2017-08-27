package com.laminar.calculator.calculator;

import android.content.Context;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText Number1, Number2;
    Button add, subtract,divide, multiply;

    double enps_result;
    //premative float variable
    double num1, num2;
    //premative int variable


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


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length() == 0)||(Number2.length()==0))
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter a number";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
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
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter a number";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context,   text, duration);
                    toast.show();
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
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter a number";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context,   text, duration);
                    toast.show();
                }else {
                    num1 = Double.parseDouble(Number1.getText().toString());
                    num2 = Double.parseDouble(Number2.getText().toString());
                    enps_result = num1 * num2;
                    result.setText(String.valueOf(enps_result));
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((Number1.length()==0)||(Number2.length()==0)){
                    Context context = getApplicationContext();
                    CharSequence text = "Please enter a number";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context,   text, duration);
                    toast.show();
                }else {
                num1 = Double.parseDouble(Number1.getText().toString());
                num2 =Double.parseDouble(Number2.getText().toString());
                enps_result = num1 / num2;
                result.setText(String.valueOf(enps_result));
            }}
        });

    }
}
