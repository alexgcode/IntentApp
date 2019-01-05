package com.example.alexgf.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView)findViewById(R.id.txt1_act2);

        String name = getIntent().getStringExtra("nombre");
        tv1.setText("Hola " + name);
    }

    //método boton anterior
    public void backActivity(View view){
        Intent backActivity = new Intent(this, MainActivity.class);
        startActivity(backActivity);
    }
}
