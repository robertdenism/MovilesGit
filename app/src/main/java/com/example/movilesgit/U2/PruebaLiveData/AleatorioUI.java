package com.example.movilesgit.U2.PruebaLiveData;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.movilesgit.R;

public class AleatorioUI extends AppCompatActivity {

    Button idPulsar;
    TextView texto;

    LiveData<Integer> datoObservableSoloTocar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_live_data);

        idPulsar = findViewById(R.id.idPulsa);
        texto = findViewById(R.id.texto);

        AleatorioViewModel vm = new  ViewModelProvider(this).get(AleatorioViewModel.class);
        datoObservableSoloTocar = vm.getDatoAleatorio();
        datoObservableSoloTocar.observe(this,(dato)->{
            texto.setText(dato.toString());
        });

        idPulsar.setOnClickListener((v)->{
            texto.setText("...");
            vm.nuevoAleatorio();
        });

    }
}