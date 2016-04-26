package com.example.gabriel.killapp;

/**
 * Created by Gabriel on 25-04-2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements SensorEventListener {
    private TextView tv;
    private SensorManager sManager;
    private ImageView img;
    ImageView iMv;
    EditText eDt;
    Button bTn;
    ImageButton imglu;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        imglu = (ImageButton) findViewById(R.id.imageButtonLu);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.ejx);
        sManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        img = (ImageView) findViewById(R.id.imageView);
        java.util.GregorianCalendar d = new java.util.GregorianCalendar();

        int hours = d.get(java.util.Calendar.HOUR_OF_DAY);
        hours+=1;
        int minutes = d.get(java.util.Calendar.MINUTE);
        int minutes2 =minutes;
        if(minutes <=30 && minutes >15){
            minutes=30;
        }else if(minutes >30){
            hours=hours+1;
        }else{
            minutes=0;
        }
        iMv = (ImageView) findViewById(R.id.arrow);
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        sManager.registerListener(this, sManager.getDefaultSensor(Sensor.TYPE_ORIENTATION),SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    protected void onStop()
    {
        sManager.unregisterListener(this);
        super.onStop();
    }
    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1)
    {
    }
    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE)
        {
            return;
        }
        float x=event.values[0];
        float y=event.values[1];
        float z=event.values[2];
        float grados;//= (float) ((x*180)/Math.PI);
        float xaux= (float) (Math.rint(x*100)/100);
        x=xaux;
        float yaux=(float)(Math.rint(y*100)/100);
        y=yaux;
        float zaux= (float) (Math.rint(z*100)/100);
        z=zaux;
        rotateimage(x);
        if (x>30){
            imglu.setVisibility(View.VISIBLE);
        }
        tv.setText(
                "Grados "+ x + ""+"\n" +
                        "Orientacion X :"+ x +"\n"+
                        "Orientacion Y :" + y + "\n" +
                        "Orientacion Z :" + z);
    }

    public void IrBruj(View v){
        Intent volver = new Intent(this,Brujula.class);
        startActivity(volver);

    }


    private void rotateimage(float degrees){

        if(degrees >= 0 && degrees <= 360){
            this.iMv.setRotation(degrees);
        }else{
            Toast.makeText(getApplicationContext(), "Grados Errados", Toast.LENGTH_SHORT).show();
        }
    }}