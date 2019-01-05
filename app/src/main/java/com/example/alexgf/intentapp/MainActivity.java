package com.example.alexgf.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_name);

    }

    //Metodo boton siguiente
    public void nextActivity(View view){
        Intent nextActivity = new Intent(this, SecondActivity.class);   //se indica a que activida se quiere ir
        nextActivity.putExtra("nombre", et1.getText().toString());      //se pasa el parametro
        startActivity(nextActivity);        //se activa la otra actividad
    }
}
