package com.laminar.calculator.calculator;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.laminar.calculator.calculator.R.id.circle_button;
import static com.laminar.calculator.calculator.R.id.young_id;


public class MainActivity extends AppCompatActivity {
    private LocationManager locationManager;
    private LocationListener locationListener;

    private static int SPLASH_TIME_OUT = 3000;

    TextView result;
    EditText Number1;
    Button add, subtract, divide, multiply, power, calculate, percentage, qformula, circle_class, youngclass, classrefract, efficiency, WVA, gradient_value, momentum, periodic_time, velocity, prism, pythagoras;

    double enps_result;
    //premative float variable
    double num1;
    //premative int variable
    double enps_secondary;
    //for power calculation
    int current_op;
    String[] opstrings = new String[]{"No op", "Add...", "Minus...", "Multiplied by...", "Divided by...", "To the power of...", "Percent of..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        locationManager = (LocationManager) this.getSystemService(LOCATION_SERVICE);
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                Log.d("Location: ", location.toString());
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };


        result = (TextView) findViewById(R.id.enps_result);

        Number1 = (EditText) findViewById(R.id.Number1);

        add = (Button) findViewById(R.id.sumof);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.bleh);
        divide = (Button) findViewById(R.id.divide);
        power = (Button) findViewById(R.id.Power);
        calculate = (Button) findViewById(R.id.calculate);
        percentage = (Button) findViewById(R.id.percentage);
        qformula = (Button) findViewById(R.id.qformula);
        circle_class = (Button) findViewById(circle_button);
        youngclass = (Button) findViewById(young_id);
        classrefract = (Button) findViewById(R.id.refractID);
        efficiency = (Button) findViewById(R.id.efficiencyID);
        WVA = (Button) findViewById(R.id.WAV);
        gradient_value = (Button) findViewById(R.id.gradient_value_ID);
        momentum = (Button) findViewById(R.id.momentumID);
        periodic_time = (Button) findViewById(R.id.pdtID);
        velocity = (Button) findViewById(R.id.velocityID);
        prism = (Button) findViewById(R.id.prismID);
        pythagoras = (Button) findViewById(R.id.pythagorasID);


        // Onclick listeners for all buttons
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 1);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 2);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 3);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 4);
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 5);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationHandle(v, 6);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
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
                    //if current_op equals 1, add numbers together
                    enps_result = num1 + Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;

                } else if (current_op == 2) {
                    //if current_op equals 2, minus numbers
                    enps_result = num1 - Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;

                } else if (current_op == 3) {
                    //if current_op equals 3, multiply numbers
                    enps_result = num1 * Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;

                } else if (current_op == 4) {
                    //if current_op equals 4, divide numbers
                    enps_result = num1 / Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;

                } else if (current_op == 5) {
                    //if current_op equals 5, multiply numbers by a power
                    enps_result = Math.pow(num1, Double.parseDouble(Number1.getText().toString()));
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;

                } else if (current_op == 6) {
                    //if current_op equals 6, work out a percentage
                    enps_secondary = num1 / 100;
                    enps_result = enps_secondary * Double.parseDouble(Number1.getText().toString());
                    num1 = 0;
                    Number1.setText("");
                    Number1.setHint("Enter your first number here.");
                    result.setText(String.valueOf(enps_result));
                    current_op = 0;
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

        qformula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QFormula.class));
            }
        });


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

        } else {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locationListener);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                    ==PackageManager.PERMISSION_GRANTED){
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
            }
        }
    }


    public void onButtonClick(View v) {
        if (v.getId() == R.id.circle_button) {
            Intent i = new Intent(MainActivity.this, ActivityCircle.class);
            startActivity(i);
        }
    }

    public void onButtonClick2(View v) {
        if (v.getId() == R.id.young_id) {
            Intent i2 = new Intent(MainActivity.this, YoungsModulus.class);
            startActivity(i2);
        }
    }

    public void suvaton(View v) {
        if (v.getId() == R.id.suvatid) {
            Intent getsuvat = new Intent(MainActivity.this, activity_suvat.class);
            startActivity(getsuvat);
        }
    }

    public void GPE(View v) {
        if (v.getId() == R.id.GPEID) {
            Intent roomgpe = new Intent(MainActivity.this, gravitationalpotential.class);
            startActivity(roomgpe);
        }
    }

    public void refractGO(View v) {
        if (v.getId() == R.id.refractID) {
            Intent gorefract = new Intent(MainActivity.this, RefractiveIndex.class);
            startActivity(gorefract);
        }
    }

    public void goEfficient(View v) {
        if (v.getId() == R.id.efficiencyID) {
            Intent goefficient = new Intent(MainActivity.this, Efficiency.class);
            startActivity(goefficient);
        }
    }

    public void gowav(View v) {
        if (v.getId() == R.id.WAV) {
            Intent goawv = new Intent(MainActivity.this, VoltageWattageCurrent.class);
            startActivity(goawv);
        }
    }

    public void goactivity(View v) {
        if (v.getId() == R.id.gradient_value_ID) {
            Intent forward = new Intent(MainActivity.this, gradient_value.class);
            startActivity(forward);
        }
    }

    public void gomomentum(View v) {
        if (v.getId() == R.id.momentumID) {
            Intent move = new Intent(MainActivity.this, Momentum.class);
            startActivity(move);
        }
    }

    public void goperiod(View v) {
        if (v.getId() == R.id.pdtID) {
            Intent goperiod = new Intent(MainActivity.this, periodic_time.class);
            startActivity(goperiod);
        }
    }

    public void govelocity(View v) {
        if (v.getId() == R.id.velocityID) {
            Intent govelocity = new Intent(MainActivity.this, velocity.class);
            startActivity(govelocity);
        }
    }

    public void goprism(View v) {
        if (v.getId() == R.id.prismID) {
            Intent goprism = new Intent(MainActivity.this, VolumeOblong.class);
            startActivity(goprism);
        }
    }

    public void pythagorasLaunch(View v) {
        if (v.getId() == R.id.pythagorasID) {
            Intent gopythagoras = new Intent(MainActivity.this, pythagoras_activity.class);
            startActivity(gopythagoras);
        }
    }

    public void operationHandle(View v, int optype) {
        if (Number1.length() == 0) {
            if (current_op != 0) {
                current_op = optype;
                Number1.setHint(String.valueOf(num1) + " " + opstrings[optype]);
            } else {
                Snackbar enternum = Snackbar.make(v, "Please enter a number", Snackbar.LENGTH_LONG);
                enternum.show();
            }
        } else {
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
