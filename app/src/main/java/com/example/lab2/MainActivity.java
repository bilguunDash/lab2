package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1 = findViewById(R.id.input); //Андройд хөгжүүлэлтийн хувьд findViewById() ашиглан XML байршлын файлд тодорхойлсон ID-аар нь харагдацын лавлагааг олох нь нийтлэг практик юм.
        EditText input2 = findViewById(R.id.input2);

        Button button = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        TextView result = (TextView) findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int sum = num1 + num2;

                result.setText("Хариу : " + Integer.toString(sum));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int minus = num1 - num2;

                result.setText("Хариу : " + Integer.toString(minus));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int divide = num1 / num2;

                result.setText("Хариу : " + Integer.toString(divide));
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = input1.getText().toString();
                String text2 = input2.getText().toString();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);

                int multiply = num1 * num2;

                result.setText("Хариу : " + Integer.toString(multiply));
            }
        });

       btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Check which input field has focus
                    if (input1.hasFocus()) {
                        String text1 = input1.getText().toString();
                        input1.setText(text1 + "0");
                    } else if (input2.hasFocus()) {
                        String text2 = input2.getText().toString();
                        input2.setText(text2 + "0");
                    }
                }
            });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "1");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "2");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "3");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "4");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "5");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "6");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "7");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "8");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which input field has focus
                if (input1.hasFocus()) {
                    String text1 = input1.getText().toString();
                    input1.setText(text1 + "9");
                } else if (input2.hasFocus()) {
                    String text2 = input2.getText().toString();
                    input2.setText(text2 + "9");
                }
            }
        });


        }
    }
