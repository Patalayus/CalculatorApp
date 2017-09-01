package com.laminar.calculator.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
                    double enps_MINUSb = -b;
                    double enPS_FourTimesaTimesc = 4 * (a * c);
                    double enps_BSquared = b * b;
                    double enps_MinusBPlusTheSquareRootofBSquaredMinus4TimesATimesC = enps_MINUSb + Math.sqrt(enps_BSquared - enPS_FourTimesaTimesc);
                    double enps_MinusBMinusTheSquareRootofBSquaredMinus4TimesATimesC = enps_MINUSb - Math.sqrt(enps_BSquared - enPS_FourTimesaTimesc);
                    double enps_totalPOSITIVE = enps_MinusBPlusTheSquareRootofBSquaredMinus4TimesATimesC / 2 * a;
                    double enps_totalNEGATIVE = enps_MinusBMinusTheSquareRootofBSquaredMinus4TimesATimesC / 2 * a;
                    x1.setText("" + enps_totalNEGATIVE);
                    x2.setText("" + enps_totalPOSITIVE);
                    if(x1.equals("")){
                        Snackbar enternum = Snackbar.make(v, "Please enter a valid number", Snackbar.LENGTH_LONG);
                        enternum.show();
                    }
                }

            }

        });
    }

}
