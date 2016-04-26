package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Imagen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen3);
    }
    public void Comic22(View v){
        Intent comic22 = new Intent(this,Comic2.class);
        startActivity(comic22);

    }
}
