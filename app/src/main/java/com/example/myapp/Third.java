package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button4);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button6);
        b5=(Button)findViewById(R.id.button17);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Third.this,Eighth.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Third.this,Nineth.class);
                startActivity(k);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Third.this,Tenth.class);
                startActivity(l);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent n = new Intent(Third.this, Eleventh.class);
                startActivity(n);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Second.class);
                startActivity(j);
                finish();
            }
        });
    }

}