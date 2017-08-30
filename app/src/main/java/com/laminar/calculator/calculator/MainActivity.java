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
    Button add, subtract,divide, multiply, power, calculate;

    double enps_result;
    //premative float variable
    double num1, num2;
    //premative int variable
    double enps_secondary;
    //for power calculation
    int current_op;

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

        // Onclick listeners for all buttons
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Check if textbox is empty
                if(Number1.length() == 0)
                {
                    // If textbox is empty and as different operation was being performed, change to this operation
                    if (current_op != 0) {
                        current_op = 1;
                        Number1.setHint(String.valueOf(num1) + " Add...");
                    }
                    else {
                        Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }
                else {
                    // Otherwise, store value in text box and reset it if there is no operation
                    if (current_op == 0){
                        num1 = Double.parseDouble(Number1.getText().toString());
                        current_op = 1;
                        Number1.setText("");
                        Number1.setHint(String.valueOf(num1) + " Add...");
                    } else {
                        // If there is something in the box when another operation has already been pressed, assume it is in error
                        Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                        presscalc.show();
                    }
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Number1.length()==0){
                    if (current_op != 0) {
                        current_op = 2;
                        Number1.setHint(String.valueOf(num1) + " Minus...");
                    }
                    else {
                        Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }else {
                    if (current_op == 0){
                        num1 = Double.parseDouble(Number1.getText().toString());
                        current_op = 2;
                        Number1.setText("");
                        Number1.setHint(String.valueOf(num1) + " Minus...");
                    } else {
                        Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                        presscalc.show();

                    }

                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Number1.length()==0){
                    if (current_op != 0) {
                        current_op = 3;
                        Number1.setHint(String.valueOf(num1) + " Multiplied by...");
                    }
                    else {
                        Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }else {
                    if (current_op == 0){
                        num1 = Double.parseDouble(Number1.getText().toString());
                        current_op = 3;
                        Number1.setText("");
                        Number1.setHint(String.valueOf(num1) + " Multiplied by...");
                    } else {
                        Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                        presscalc.show();

                    }

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Number1.length()==0){
                    if (current_op != 0) {
                        current_op = 4;
                        Number1.setHint(String.valueOf(num1) + " Divided by...");
                    }
                    else {
                        Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }else {
                    if (current_op == 0){
                        num1 = Double.parseDouble(Number1.getText().toString());
                        current_op = 4;
                        Number1.setText("");
                        Number1.setHint(String.valueOf(num1) + " Divided by...");
                    } else {
                        Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                        presscalc.show();

                    }

            }}
        });

        power.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Number1.length()==0){
                    if (current_op != 0) {
                        current_op = 5;
                        Number1.setHint(String.valueOf(num1) + " To the power of...");
                    }
                    else {
                        Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }else {
                    if (current_op == 0){
                        num1 = Double.parseDouble(Number1.getText().toString());
                        current_op = 5;
                        Number1.setText("");
                        Number1.setHint(String.valueOf(num1) + " To the power of...");
                    } else {
                        Snackbar presscalc = Snackbar.make(v, "Please press calculate", Snackbar.LENGTH_LONG);
                        presscalc.show();
                    }

                }
            }
        });

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Perform calculation operation dependant on current operation, then reset.
                if(Number1.length()==0) {
                    Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                    enternum.show();
                }
                else if(current_op == 0){
                    Snackbar nothing = Snackbar.make(v, "Nothing to calculate", Snackbar.LENGTH_LONG);
                    nothing.show();
                }else if(current_op == 1){
                    enps_result = num1 + Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                }else if(current_op == 2){
                    enps_result = num1 - Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                }else if(current_op == 3){
                    enps_result = num1 * Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                }else if(current_op == 4){
                    enps_result = num1 / Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                }else if(current_op == 5){
                    enps_result = Math.pow(num1, Double.parseDouble(Number1.getText().toString()));
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
                }}
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
}
