package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Comic2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic2);
    }
    public void FinLuna(View v){
        Intent finluna = new Intent(this,FinLuna.class);
        startActivity(finluna);

    }
    public void imagen3(View v){
        Intent imagen3 = new Intent(this,Imagen3.class);
        startActivity(imagen3);

    }
}
