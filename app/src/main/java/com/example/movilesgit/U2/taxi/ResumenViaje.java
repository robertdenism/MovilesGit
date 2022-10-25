package com.example.movilesgit.U2.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.movilesgit.R;

public class ResumenViaje extends AppCompatActivity {

    TextView nombre, dni, ciudad, fIda, fVuelta, direccion, hIda, hVuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_viaje);

        nombre= findViewById(R.id.nombre);
       // dni= findViewById(R.id.dni);
       // ciudad= findViewById(R.id.ciudad);

        Intent i = getIntent();
       nombre.setText(i.getStringExtra("NOMBRE"));
       // dni.setText(i.getStringExtra("DNI"));
       // ciudad.setText(i.getStringExtra("CIUDAD"));




    }
}