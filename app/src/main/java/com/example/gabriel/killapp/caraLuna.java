package com.example.gabriel.killapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class caraLuna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_luna);
    }
    public void volverbruj(View v){
        Intent volver = new Intent(this,Brujula.class);
        startActivity(volver);

    }
}
