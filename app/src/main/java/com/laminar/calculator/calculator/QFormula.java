package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Space;
import android.widget.TextView;

public class QFormula extends AppCompatActivity {

    TextView x1, x2;
    EditText aInput, bInput, cInput;
    Button calc;

    double a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qformula);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        x1 = (TextView)findViewById(R.id.res1);
        x2 = (TextView)findViewById(R.id.res2);

        aInput = (EditText)findViewById(R.id.num1);
        bInput = (EditText)findViewById(R.id.num2);
        cInput = (EditText)findViewById(R.id.num3);

        calc = (Button)findViewById(R.id.calculate);

        calc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (aInput.length() == 0 || bInput.length() == 0 || cInput.length() == 0){
                    Snackbar enternum = Snackbar.make(v, "Please enter 3 numbers", Snackbar.LENGTH_LONG);
                    enternum.show();
                } else {
                    a = Double.parseDouble(aInput.getText().toString());
                    b = Double.parseDouble(bInput.getText().toString());
                    c = Double.parseDouble(cInput.getText().toString());

                    double discriminant = Math.pow(b, 2) - 4 * a * c;
                    if (discriminant < 0){
                        Snackbar enternum = Snackbar.make(v, "Imaginary roots", Snackbar.LENGTH_LONG);
                        enternum.show();
                    } else {
                        String x1out = Double.toString((-b - Math.sqrt(discriminant)) / 2 * a);
                        String x2out = Double.toString((-b + Math.sqrt(discriminant)) / 2 * a);
                        x1.setText(x1out);
                        x2.setText(x2out);
                    }
                }

            }

        });
        // Clicks the calculate button if the user presses done on the keyboard
        aInput.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    bInput.requestFocus();
                    return true;
                }
                return false;
            }
        });
        // Clicks the calculate button if the user presses done on the keyboard
        bInput.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    cInput.requestFocus();
                    return true;
                }
                return false;
            }
        });
        // Clicks the calculate button if the user presses done on the keyboard
        cInput.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    calc.performClick();
                    return true;
                }
                return false;
            }
        });
    }

}
