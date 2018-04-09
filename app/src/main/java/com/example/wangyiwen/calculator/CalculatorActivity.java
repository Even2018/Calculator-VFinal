package com.example.wangyiwen.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class CalculatorActivity extends Activity {


    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;

    private Button dot;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private Button percent;
    private Button minus;

    private Button equal;
    private EditText led;
    private Button sin;
    private Button cos;
    private Button tens;
    private Button twos;
    private Button eights;

    String num1 = "";
    String num2 = "";
    double num3 = 0;
    String result = "";
    String sign = "+";
    int mark = 0;
    boolean f = true;
    boolean e = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clear);
        led = (EditText) findViewById(R.id.led);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        percent = (Button) findViewById(R.id.percent);
        minus = (Button) findViewById(R.id.minus);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tens = (Button) findViewById(R.id.tens);
        twos = (Button) findViewById(R.id.twos);
        eights = (Button) findViewById(R.id.eights);


        zero.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "0";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "0";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "0";
                    led.setText(num2);
                }
            }
        });
        one.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "1";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "1";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "1";
                    led.setText(num2);
                }
            }
        });
        two.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "2";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "2";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "2";
                    led.setText(num2);
                }
            }
        });
        three.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "3";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "3";
                    led.setText( num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "3";
                    led.setText(num2);
                }
            }
        });
        four.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "4";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "4";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "4";
                    led.setText( num2);
                }
            }
        });
        five.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "5";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "5";
                    led.setText( num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "5";
                    led.setText( num2);
                }
            }
        });
        six.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "6";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "6";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "6";
                    led.setText( num2);
                }
            }
        });
        seven.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "7";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "7";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "7";
                    led.setText(num2);
                }
            }
        });
        eight.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "8";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "8";
                    led.setText( num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "8";
                    led.setText( num2);
                }
            }
        });
        nine.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    num1 = num1 + "9";
                    led.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + "9";
                    led.setText(num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + "9";
                    led.setText( num2);
                }
            }
        });

        add.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (f) {
                    sign = "+";
                    mark++;
                    f = false;
                    e = true;
                }
            }
        });
        sub.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (f) {
                    sign = "-";
                    mark++;
                    f = false;
                    e = true;
                }
            }
        });
        mul.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (f) {
                    sign = "*";
                    mark++;
                    f = false;
                    e = true;
                }
            }
        });
        div.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (f) {
                    sign = "÷";
                    mark++;
                    f = false;
                    e = true;
                }
            }
        });

        dot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (e) {
                    if (mark == 0) {
                        num1 = num1 + ".";
                        led.setText(num1);
                    } else if (mark == 1) {
                        num2 = num2 + ".";
                        led.setText(num2);
                    } else {
                        num1 = String.valueOf(num3);
                        num2 = num2 + ".";
                        led.setText(num2);
                    }
                    e = false;
                }
            }
        });

        percent.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                   if (mark == 0) {
                       double x = 100;
                       double y = Double.parseDouble(num1);
                       double z = y / x;
                       num1 = String.valueOf(z);
                       led.setText(num1);
                   } else if (mark == 1) {
                       double x = 100;
                       double y = Double.parseDouble(num2);
                       double z = y / x;
                       num2 = String.valueOf(z);
                       led.setText(num2);
                   }

            }
        });

       minus.setOnClickListener(new OnClickListener() {
           public void onClick(View v) {
               if (mark == 0) {
                   double x = 0;
                   double y = Double.parseDouble(num1);
                  double z = x - y;
                   num1 = String.valueOf(z);
                   led.setText(num1);
               }else if (mark == 1) {
                   double x = 0;
                   double y = Double.parseDouble(num2);
                   double z = x - y;
                   num2 = String.valueOf(z);
                   led.setText(num2);
               }

           }
       });

        sin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    double y = Double.parseDouble(num1);

                    y = Math.sin(y);
                    num1 = String.valueOf(y);
                    led.setText(num1);
                }else if (mark == 1) {
                    double y = Double.parseDouble(num2);

                    y = Math.sin(y);
                    num2 = String.valueOf(y);
                    led.setText(num2);
                }

            }
        });

       cos.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    double y = Double.parseDouble(num1);
                     y = Math.cos(y);
                    num1 = String.valueOf(y);
                    led.setText(num1);
                }else if (mark == 1) {
                    double y = Double.parseDouble(num2);
                    y = Math.cos(y);
                    num2 = String.valueOf(y);
                    led.setText(num2);
                }

            }
        });

        twos.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    int y = Integer.parseInt(num1);
                    num1 =Integer.toBinaryString(y);

                    led.setText(num1);
                }else if (mark == 1) {
                    int y = Integer.parseInt(num2);
                    num2 =Integer.toBinaryString(y);


                    led.setText(num2);
                }

            }
        });

        tens.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {

                    led.setText(num1);
                } else if (mark == 1) {

                    led.setText(num2);
                }

            }
        });

        eights.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (mark == 0) {
                    int y = Integer.parseInt(num1);
                    num1 =Integer.toHexString(y);

                    led.setText(num1);
                }else if (mark == 1) {
                    int y = Integer.parseInt(num2);
                    num2 =Integer.toHexString(y);

                    led.setText(num2);
                }

            }
        });



        equal.setOnClickListener(new OnClickListener() { // 等于时发生的运算
            public void onClick(View v) {
                f = true;
                e = true;
                if (sign.equals("+")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x + y;
                    result = String.valueOf(num3);

                    led.setText( result);
                    num2 = "";
                } else if (sign.equals("-")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x - y;
                    result = String.valueOf(num3);

                    led.setText(result);
                    num2 = "";
                } else if (sign.equals("*")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x * y;
                    result = String.valueOf(num3);

                    led.setText(result);
                    num2 = "";
                } else if (sign.equals("÷")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x / y;
                    result = String.valueOf(num3);

                    led.setText( result);
                    num2 = "";
                }
            }
        });
        clear.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                num1 = "";
                num2 = "";
                num3 = 0;
                mark = 0;
                sign = "";
                led.setText("0");
                f = true;
                e = true;
            }
        });

    }

}
