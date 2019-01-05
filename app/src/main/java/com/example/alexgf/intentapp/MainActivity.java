package com.example.alexgf.intentapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE); //busca (y si no hay, lo crea) el archivo "datos"
        et1.setText(preferences.getString("mail", ""));     //busca "mail" dentro del archivo datos; si no lo encuentra, usa ""
    }

    //Metodo boton guardar
    public void savePreferences(View view){
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);  //crea el archivo datos
        SharedPreferences.Editor editor = preferences.edit();       //edita los datos del archivo creado
        editor.putString("mail", et1.getText().toString()); //agrega el dato mail con el valor del txt
        editor.commit();
        finish();
    }

    //Metodo boton siguiente
    public void nextActivity(View view){
        Intent nextActivity = new Intent(this, SecondActivity.class);   //se indica a que activida se quiere ir
        nextActivity.putExtra("nombre", et1.getText().toString());      //se pasa el parametro
        startActivity(nextActivity);        //se activa la otra actividad
    }
}
