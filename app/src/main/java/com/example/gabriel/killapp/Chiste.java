package com.example.gabriel.killapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Chiste extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiste);



        ImageView imageView42=(ImageView) findViewById(R.id.imageView42);
        imageView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flecha = new Intent(Chiste.this,MainActivity.class);
                startActivity(flecha);
            }
        });


    }

}