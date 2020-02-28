package com.example.sgsitsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,zero,decimal,equals,plus,minus,divide,multiply;
    private EditText result;
    private TextView calculation;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char EQUALS= '=';
    private double var1=Double.NaN;
    private double var2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        decimal=(Button)findViewById(R.id.decimal);
        equals=(Button)findViewById(R.id.equals);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        result=(EditText)findViewById(R.id.result);
        calculation=(TextView)findViewById(R.id.calculation);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation.setText(calculation.getText().toString()+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION= ADDITION;
                result.setText(String.valueOf(var1)+ "+");
                calculation.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(var1)+ "-");
                calculation.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(var1)+ "*");
                calculation.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(var1)+ "/");
                calculation.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION= EQUALS;
                result.setText(result.getText().toString()+String.valueOf(var2) + "=" + String.valueOf(var1));
                calculation.setText(null);
            }
        });


    }

    private void compute(){
        if (!Double.isNaN(var1)){
            var2=Double.parseDouble(calculation.getText().toString());
            switch (ACTION){
                case ADDITION:
                    var1=var1+var2;
                    break;
                case SUBTRACTION:
                    var1=var1-var2;
                    break;
                case MULTIPLICATION:
                    var1=var1*var2;
                    break;
                case DIVISION:
                    var1=var1/var2;
                    break;
                case EQUALS:
                    break;
            }
        }
        else{
            var1=Double.parseDouble(calculation.getText().toString());
        }
    }
}
