package com.example.movilesgit.U2.PruebaLiveData.API;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.movilesgit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Calculadora extends AppCompatActivity {


    TextView inMuestra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        inMuestra = findViewById(R.id.muestrame);

        Call<Resultado> llamada = MatesAPI.getInstance().suma(7,8);
        llamada.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                Resultado res = response.body();
                inMuestra.setText(res.resultado);
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {

            }
        });

    }
}