package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mytextview;
    EditText myedittext;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myedittext= findViewById(R.id.editText);
        mytextview=findViewById(R.id.textView);
        myButton=findViewById(R.id.myButton);
        myButton.setOnClickListener(new MyButtonOnClickListner());
    }
    private class MyButtonOnClickListner implements View.OnClickListener{
        @Override
        public void onClick(View v){
            mytextview.setText(myedittext.getText());
        }
    }
}