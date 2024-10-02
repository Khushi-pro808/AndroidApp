package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Eleventh extends AppCompatActivity {
    Button b1;
    ImageButton ib;
    CameraManager cm;
    private boolean flash=false;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        b1=(Button)findViewById(R.id.button29);
        ib = (ImageButton) findViewById(R.id.imageButton);
        cm = (CameraManager) getSystemService(CAMERA_SERVICE);
        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (flash == false) {
                    try {
                        String s1 = cm.getCameraIdList()[0];
                        cm.setTorchMode(s1, true);
                        flash = true;
                        ib.setImageResource(R.drawable.on);
                    } catch (CameraAccessException e) {

                    }
                }
                else
                {
                    try {
                        String s1 = cm.getCameraIdList()[0];
                        cm.setTorchMode(s1, false);
                        flash = false;
                        ib.setImageResource(R.drawable.off);

                    } catch (CameraAccessException a) {

                    }
                }

            }


        });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(Eleventh.this,Third.class);
               startActivity(i);
               finish();
           }
       });
    }

}