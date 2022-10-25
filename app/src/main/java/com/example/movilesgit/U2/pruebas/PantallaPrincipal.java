package com.example.movilesgit.U2.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.movilesgit.R;

public class PantallaPrincipal extends AppCompatActivity {


    EditText elNombre;
    Button botonEnvio, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        elNombre = findViewById(R.id.elNombre);
        botonEnvio = findViewById(R.id.botonEnvio);
        salir = findViewById(R.id.salir);



    }
}