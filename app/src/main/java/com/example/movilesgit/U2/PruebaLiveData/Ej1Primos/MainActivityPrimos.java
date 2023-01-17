package com.example.movilesgit.U2.PruebaLiveData.Ej1Primos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.movilesgit.R;

public class MainActivityPrimos extends AppCompatActivity {

    Button botonPrimos;
    TextView muestraPrimos;
    EditText inNumero1, inNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_primos);

        botonPrimos = findViewById(R.id.BotonPrimos);
        muestraPrimos = findViewById(R.id.muestraPrimos);
        inNumero1 = findViewById(R.id.inNumero1);
        inNumero2 = findViewById(R.id.inNumero2);


    }
}