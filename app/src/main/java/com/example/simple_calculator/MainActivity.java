package com.example.simple_calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, btDel, btAc,
            bt9, btDot, btMul, btAdd, btSub, btModulus, btDivide, btResult, btPlusMinus;

    private TextView tvResult;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    double in1 = 0.0, i2 = 0.0;
    private String replace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);

        btDot = findViewById(R.id.btDot);
        btMul = findViewById(R.id.btMul);
        btAdd = findViewById(R.id.btAdd);
        btSub = findViewById(R.id.btSub);
        btModulus = findViewById(R.id.btModulus);
        btDivide = findViewById(R.id.btDivide);
        btResult = findViewById(R.id.btResult);
        btPlusMinus = findViewById(R.id.btPlusMinus);
        btDel = findViewById(R.id.btDel);
        btAc = findViewById(R.id.btAc);
        tvResult = findViewById(R.id.tvResult);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","1");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "1");
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","2");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "2");
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","3");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "3");
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","4");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "4");
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","5");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "5");
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","6");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "6");
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","7");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "7");
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","8");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "8");
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                    replace = tvResult.getText().toString().replace("0","9");
                    tvResult.setText(replace);
                }else {
                    tvResult.setText(tvResult.getText() + "9");
                }
            }
        });
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0) {
                    tvResult.setText(tvResult.getText());
                    in1 = Double.parseDouble(String.valueOf(tvResult.getText()));
                    Add = true;
                    deci = false;
                    tvResult.setText(null);
                }
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0) {
                    tvResult.setText(tvResult.getText());
                    in1 = Double.parseDouble(String.valueOf(tvResult.getText()));
                    Sub = true;
                    deci = false;
                    tvResult.setText(null);
                }
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0) {
                    tvResult.setText(tvResult.getText());
                    in1 = Double.parseDouble(String.valueOf(tvResult.getText()));
                    Multiply = true;
                    deci = false;
                    tvResult.setText(null);
                }
            }
        });
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0) {
                    tvResult.setText(tvResult.getText());
                    in1 = Double.parseDouble(String.valueOf(tvResult.getText()));
                    Divide = true;
                    deci = false;
                    tvResult.setText(null);
                }
            }
        });
        btModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvResult.getText().length() != 0) {
                    tvResult.setText(tvResult.getText());
                    in1 = Double.parseDouble(String.valueOf(tvResult.getText()));
                    Remainder = true;
                    deci = false;
                    tvResult.setText(null);
                }
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    if (tvResult.getText().toString().equalsIgnoreCase("0")) {
                        tvResult.setText("0"+".");
                        deci = true;
                    }else {
                        tvResult.setText(".");
                        deci = true;
                    }

                }
            }
        });
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("0");
                in1 = 0.0;
                i2 = 0.0;
            }
        });
        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("0");
                in1 = 0.0;
                i2 = 0.0;
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    i2 = Double.parseDouble((tvResult.getText() + ""));
                }

                if (Add) {
                    tvResult.setText(in1 + i2 + "");
                    Add = false;
                }

                if (Sub) {
                    tvResult.setText(in1 - i2 + "");
                    Sub = false;
                }

                if (Multiply) {
                    tvResult.setText(in1 * i2 + "");
                    Multiply = false;
                }

                if (Divide) {
                    tvResult.setText(in1 / i2 + "");
                    Divide = false;
                }
                if (Remainder) {
                    tvResult.setText(in1 % i2 + "");
                    Remainder = false;
                }
            }
        });

    }

}