package com.example.alexgf.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //método boton anterior
    public void backActivity(View view){
        Intent backActivity = new Intent(this, MainActivity.class);
        startActivity(backActivity);
    }
}
