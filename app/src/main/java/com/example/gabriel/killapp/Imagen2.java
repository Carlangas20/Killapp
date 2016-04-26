package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Imagen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen2);
    }
    public void Comic11(View v){
        Intent comic11 = new Intent(this,Comic1.class);
        startActivity(comic11);

    }
}
