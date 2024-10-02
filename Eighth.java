package com.example.myapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.hardware.Sensor;
        import android.hardware.SensorEvent;
        import android.hardware.SensorEventListener;
        import android.hardware.SensorManager;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class Eighth extends AppCompatActivity implements SensorEventListener  {
    Button b1;
    MediaPlayer mp;
    SensorManager sm;
    Sensor s;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        b1=(Button)findViewById(R.id.button19);
        mp=MediaPlayer.create(this,R.raw.bbb);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Eighth.this,Third.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        float x= sensorEvent.values[0];
        float y= sensorEvent.values[1];
        float z= sensorEvent.values[2];
        int x1=(int)x;
        int y1=(int)y;
        int z1=(int)z;
        if(x1!=0){
            mp.start();
        }
        else{
            mp.pause();
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}