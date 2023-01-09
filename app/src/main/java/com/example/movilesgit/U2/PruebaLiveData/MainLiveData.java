package com.example.movilesgit.U2.PruebaLiveData;



import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.movilesgit.R;

public class MainLiveData extends AppCompatActivity {

    private static final double MAX_VALUE=100;

    Button idPulsa;
    TextView texto;

    MutableLiveData<Integer> datoObservable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main_live_data);

        idPulsa = findViewById(R.id.idPulsa);
        texto = findViewById(R.id.texto);

        datoObservable = new MutableLiveData<Integer>( 0);

        datoObservable.observe(this, dato -> {
            texto.setText(dato.toString());
        });

        idPulsa.setOnClickListener(view ->{
            datoObservable.postValue(new Integer((int)(Math.random()*MAX_VALUE)));
        });
    }
}