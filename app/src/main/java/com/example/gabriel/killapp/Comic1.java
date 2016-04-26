package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Comic1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic1);
    }
    public void Comic2(View v){
        Intent comic2 = new Intent(this,Comic2.class);
        startActivity(comic2);

    }
    public void imagen2(View v){
        Intent imagen2 = new Intent(this,Imagen2.class);
        startActivity(imagen2);

    }
}
