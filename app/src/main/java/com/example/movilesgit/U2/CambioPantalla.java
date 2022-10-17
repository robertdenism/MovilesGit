package com.example.movilesgit.U2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.movilesgit.R;

public class CambioPantalla extends AppCompatActivity {

    Button botonIntro;
    EditText introNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_pantalla);

        botonIntro = findViewById(R.id.botonIntro);
        introNombre = findViewById(R.id.introNombre);

        botonIntro.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nombre();

                    }
                }
        );


    }

    private void lanzar(){
        Intent intento = new Intent(this, Pantalla2.class);
        intento.putExtra("CLAVE", "VALOR");
        intento.putExtra("NOMBRE", "ROBERT");
        startActivity(intento);

    }

    private void nombre(){
        Intent intento = new Intent(this, Pantalla2.class);
        intento.putExtra("NOMBRE", introNombre.getText().toString());
        startActivity(intento);

    }

}