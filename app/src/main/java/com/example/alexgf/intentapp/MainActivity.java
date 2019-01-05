package com.example.alexgf.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo boton siguiente
    public void nextActivity(View view){
        Intent nextActivity = new Intent(this, SecondActivity.class);
        startActivity(nextActivity);
    }
}
