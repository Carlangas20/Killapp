package com.example.gabriel.killapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Marte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marte);
    }
    public void Luna1(View v){
        Intent luna1 = new Intent(this,Luna.class);
        startActivity(luna1);

    }
}
