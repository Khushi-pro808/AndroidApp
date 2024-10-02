package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Fourth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    EditText e1,e2;
    TextView t1;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1 = (Button) findViewById(R.id.button7);
        b2 = (Button) findViewById(R.id.button13);
        b3 = (Button) findViewById(R.id.button14);
        b4 = (Button) findViewById(R.id.button15);
        b5 = (Button) findViewById(R.id.button5);
        e1 = (EditText) findViewById(R.id.editTextText);
        e2 = (EditText) findViewById(R.id.editTextText2);
        t1 = (TextView) findViewById(R.id.textView);
        b1.setOnClickListener(view -> {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            Integer i1 = Integer.parseInt(s1);
            Integer i2 = Integer.parseInt(s2);
            int i3 = i1 + i2;
            String s3 = Integer.toString(i3);
            t1.setText(s3);
            Toast.makeText(Fourth.this, "Your Result Is"+s3, Toast.LENGTH_SHORT).show();
        });

        b2.setOnClickListener(view -> {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            Integer i1 = Integer.parseInt(s1);
            Integer i2 = Integer.parseInt(s2);
            int i3 = i1 - i2;
            String s3 = Integer.toString(i3);
            t1.setText(s3);
            Toast.makeText(Fourth.this, "The Result IS" + s3, Toast.LENGTH_SHORT).show();
        });

        b3.setOnClickListener(view -> {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            Integer i1 = Integer.parseInt(s1);
            Integer i2 = Integer.parseInt(s2);
            int i3 = i1 * i2;
            String s3 = Integer.toString(i3);
            t1.setText(s3);
            Toast.makeText(Fourth.this, "The Result IS" + s3, Toast.LENGTH_SHORT).show();
        });

        b4.setOnClickListener(view -> {
            String s1 = e1.getText().toString();
            String s2 = e2.getText().toString();
            Float i1 = Float.parseFloat(s1);
            Float i2 = Float.parseFloat(s2);
            float i3 = i1 / i2;
            String s3 = Float.toString(i3);
            t1.setText(s3);
            Toast.makeText(Fourth.this, "The Result IS" + s3, Toast.LENGTH_SHORT).show();
        });
        b5.setOnClickListener(view -> {
            Intent i=new Intent(Fourth.this,Second.class);
             startActivity(i);
             finish();
        });





    }



}
