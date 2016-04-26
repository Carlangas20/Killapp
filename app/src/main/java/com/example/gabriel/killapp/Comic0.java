package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Comic0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic0);
    }

    public void Comic1(View v) {
        Intent comic1 = new Intent(this, Comic1.class);
        startActivity(comic1);

    }

    public void imagen1(View v) {
        Intent imagen1 = new Intent(this, Imagen1.class);
        startActivity(imagen1);


    }
}
