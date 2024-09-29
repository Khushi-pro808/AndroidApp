package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Sixth extends AppCompatActivity {
    Button b1,b2,b3;
    WifiManager wm;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        b1.findViewById(R.id.button20);
        b2.findViewById(R.id.button21);
        b3.findViewById(R.id.button21);
        b1.setOnClickListener(view -> {
            wm=(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wm.setWifiEnabled(true);
            Toast.makeText(Sixth.this, "WIFI ON", Toast.LENGTH_SHORT).show();
        });
        b2.setOnClickListener(view -> {
            wm=(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
            wm.setWifiEnabled(false);
            Toast.makeText(Sixth.this, "WIFI OFF", Toast.LENGTH_SHORT).show();
        });
        b3.setOnClickListener(view -> {
            Intent i=new Intent(Sixth.this,Second.class);
            startActivity(i);
            finish();
        });


    }


}
