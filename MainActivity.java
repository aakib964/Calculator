package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText  editTextTextn1=(EditText) findViewById(R.id.editTextTextn1);
        final EditText editTextTextn2=(EditText)findViewById(R.id.editTextTextn2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 =(Button) findViewById(R.id.button2);
        Button button3 =(Button) findViewById(R.id.button3);
        Button button4 =(Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a,b,c;
               a=Integer.parseInt(editTextTextn1.getText().toString());
               b=Integer.parseInt(editTextTextn2.getText().toString());
               c=a+b;
               textView3.setText(""+c);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(editTextTextn1.getText().toString());
                b=Integer.parseInt(editTextTextn2.getText().toString());
                c=a-b;
                textView3.setText(""+c);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(editTextTextn1.getText().toString());
                b=Integer.parseInt(editTextTextn2.getText().toString());
                c=a*b;
                textView3.setText(""+c);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                a=Integer.parseInt(editTextTextn1.getText().toString());
                b=Integer.parseInt(editTextTextn2.getText().toString());
                c=a/b;
                textView3.setText(""+c);
            }
        });

    }
}