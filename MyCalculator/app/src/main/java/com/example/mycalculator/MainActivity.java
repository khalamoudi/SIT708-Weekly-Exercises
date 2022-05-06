package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {

        EditText et1 = (EditText) findViewById(R.id.number1);

        EditText et2 = (EditText) findViewById(R.id.number2);

        TextView tv1 = (TextView) findViewById(R.id.result);

        //TextView tv1 = (TextView) findViewById(R.id.result);

        int number1 = Integer.parseInt(et1.getText().toString());
        int number2 = Integer.parseInt(et2.getText().toString());
        int res = number1 + number2;
       // result.setText("Result = "+Integer.toString(res));
        tv1.setText("Result = "+Integer.toString(res));
    }


    public void Sub(View v) {

        EditText et1 = (EditText) findViewById(R.id.number1);

        EditText et2 = (EditText) findViewById(R.id.number2);

        TextView tv1 = (TextView) findViewById(R.id.result);

        //TextView tv1 = (TextView) findViewById(R.id.result);

        int number1 = Integer.parseInt(et1.getText().toString());
        int number2 = Integer.parseInt(et2.getText().toString());
        int res = number1 - number2;
        // result.setText("Result = "+Integer.toString(res));
        tv1.setText("Result = "+Integer.toString(res));
    }

    public void Mul(View v) {

        EditText et1 = (EditText) findViewById(R.id.number1);
        EditText et2 = (EditText) findViewById(R.id.number2);
        TextView tv1 = (TextView) findViewById(R.id.result);
        int number1 = Integer.parseInt(et1.getText().toString());
        int number2 = Integer.parseInt(et2.getText().toString());
        int res = number1 * number2;
        tv1.setText("Result = "+Integer.toString(res));
    }

    public void DIV(View v) {

        EditText et1 = (EditText) findViewById(R.id.number1);
        EditText et2 = (EditText) findViewById(R.id.number2);
        TextView tv1 = (TextView) findViewById(R.id.result);
        int number1 = Integer.parseInt(et1.getText().toString());
        int number2 = Integer.parseInt(et2.getText().toString());
        int res = number1 / number2;
        tv1.setText("Result = "+Integer.toString(res));
    }


}