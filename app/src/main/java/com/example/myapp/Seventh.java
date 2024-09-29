package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Seventh extends AppCompatActivity {
    Button b1, b2, b3;
    BluetoothAdapter ba;


    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1.findViewById(R.id.button25);
        b2.findViewById(R.id.button26);
        b3.findViewById(R.id.button27);
        ba = BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(view -> {

        });
        b2.setOnClickListener(view -> {

        });


        b3.setOnClickListener(view -> {
            Intent i=new Intent(Seventh.this,Second.class);
            startActivity(i);
            finish();
        });


    }



}
