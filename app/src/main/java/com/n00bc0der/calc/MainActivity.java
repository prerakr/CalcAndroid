package com.n00bc0der.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result, currnum, number1, number2, op;
    Button one,two,three,four,five,six,seven,eight,nine,zero, add,sub, multi, div, clr, equals;
    long num1, num2, currentnum = 0;
    int counter, operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        currnum= (TextView) findViewById(R.id.currnum);
        number1 = (TextView) findViewById(R.id.number1);
        number2 = (TextView) findViewById(R.id.number2);
        op = (TextView) findViewById(R.id.op);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine= (Button) findViewById(R.id.nine);
        zero= (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        multi = (Button) findViewById(R.id.multi);
        div = (Button) findViewById(R.id.div);
        clr = (Button) findViewById(R.id.clr);
        equals = (Button) findViewById(R.id.equals);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    if(counter==0){
                    num1 = currentnum;
                    Number n1 = num1;
                    number1.setText(n1.toString());
                        op.setText("+");
                    currentnum = 0;
                    counter = 1;
                    operator = 1;}
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    if(counter==0){
                        num1 = currentnum;
                        Number n1 = num1;
                        number1.setText(n1.toString());
                        op.setText("-");
                        currentnum = 0;
                        counter = 1;
                        operator = 2;}
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    if(counter==0){
                        num1 = currentnum;
                        Number n1 = num1;
                        number1.setText(n1.toString());
                        op.setText("*");
                        currentnum = 0;
                        counter = 1;
                        operator = 3;}
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    if(counter==0){
                        num1 = currentnum;
                        Number n1 = num1;
                        number1.setText(n1.toString());
                        op.setText("/");
                        currentnum = 0;
                        counter = 1;
                        operator = 4;}
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        clr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{

                        num1=0;
                        num2=0;
                        number1.setText("num1");
                        number2.setText("num2");
                        currnum.setText("currentnumber");
                        result.setText("Result");
                        currentnum = 0;
                        counter = 0;
                        operator = 0;
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });


        equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    if(counter!=0) {
                        num2 = currentnum;
                        Number n2 = num2;
                        number2.setText(n2.toString());
                        currentnum = 0;
                        switch(operator){
                            case 1:
                                Number r1 = num1 + num2;
                                result.setText(r1.toString());
                                break;
                            case 2:
                                Number r2 = num1 - num2;
                                result.setText(r2.toString());
                                break;
                            case 3:
                                Number r3 = num1 * num2;
                                result.setText(r3.toString());
                                break;
                            case 4:
                                Number r4 = (float)num1 / num2;
                                result.setText(r4.toString());
                                break;



                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 1;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 2;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 3;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 4;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 5;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 6;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 7;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 8;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 9;
                    Number n = currentnum;
                    currnum.setText(n.toString());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    currentnum = (currentnum*10) + 0;
                    Number n = currentnum;
                    currnum.setText(n.toString());



                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
    }
}
