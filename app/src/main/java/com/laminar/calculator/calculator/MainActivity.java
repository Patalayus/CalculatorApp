package com.laminar.calculator.calculator;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText Number1;
    Button add, subtract,divide, multiply, power, calculate, percentage;

    double enps_result;
    //premative float variable
    double num1, num2;
    //premative int variable
    double enps_secondary;
    //for power calculation
    int current_op;
    String[] opstrings = new String[]{"No op", "Add...", "Minus...", "Multiplied by...", "Divided by...", "To the power of..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.enps_result);

        Number1 = (EditText)findViewById(R.id.Number1);

        add = (Button)findViewById(R.id.sumof);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.bleh);
        divide = (Button)findViewById(R.id.divide);
        power = (Button)findViewById(R.id.Power);
        calculate = (Button)findViewById(R.id.calculate);
        percentage = (Button)findViewById(R.id.percentage);




        // Onclick listeners for all buttons
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v, 1);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v, 2);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v, 3);
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v, 4);
            }
        });

        power.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v,5);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operationHandle(v,6);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Perform calculation operation dependant on current operation, then reset.
                if (Number1.length() == 0) {
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                } else if (current_op == 0) {
                    Snackbar nothing = Snackbar.make(v, "Nothing to calculate", Snackbar.LENGTH_LONG);
                    nothing.show();
                } else if (current_op == 1) {
                    enps_result = num1 + Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                } else if (current_op == 2) {
                    enps_result = num1 - Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                } else if (current_op == 3) {
                    enps_result = num1 * Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                } else if (current_op == 4) {
                    enps_result = num1 / Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                } else if (current_op == 5) {
                    enps_result = Math.pow(num1, Double.parseDouble(Number1.getText().toString()));
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                } else if (current_op == 6){
                    ;
                }
            }
        });

        // Clicks the calculate button if the user presses done on the keyboard
        Number1.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    calculate.performClick();
                    return true;
                }
                return false;
            }
        });

    }
    public void operationHandle(View v, int optype){
        if(Number1.length()==0){
            if (current_op != 0) {
                current_op = optype;
                Number1.setHint(String.valueOf(num1) + " " + opstrings[optype]);
            }
            else {
                Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                enternum.show();
            }
        }else {
            if (current_op == 0) {
                num1 = Double.parseDouble(Number1.getText().toString());
                current_op = optype;
                Number1.setText("");
                Number1.setHint(String.valueOf(num1) + " " + opstrings[optype]);
            } else {
                Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                presscalc.show();
            }
        }
    }
}
