package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Brujula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brujula);
    }
    public void Astronauta(View v){
        Intent astronauta = new Intent(this,Astronauta.class);
        startActivity(astronauta);

    }
    public void Crater(View v){
        Intent crater = new Intent(this,Crater.class);
        startActivity(crater);

    }
    public void caralu(View v){
        Intent cara = new Intent(this,caraLuna.class);
        startActivity(cara);

    }
}
