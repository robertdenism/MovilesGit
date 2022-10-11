package com.example.movilesgit.U2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.movilesgit.R;

public class PiedraPapelTijera extends AppCompatActivity {

    Button bPiedra, bPapel, bTijera, reiniciar;
    TextView tMensaje, puntoTu, puntoMa;

    int valor=0, cont1=0, cont2=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);

        bPapel.findViewById(R.id.bPiedra);
        bPiedra.findViewById(R.id.bPiedra);
        bTijera.findViewById(R.id.bTijera);

        reiniciar.findViewById(R.id.reiniciar);

        tMensaje.findViewById(R.id.tMensaje);
        puntoTu.findViewById(R.id.puntoTu);
        puntoMa.findViewById(R.id.puntoMa);

        bPiedra.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valor=1;
                        if(valor==Maquina()){
                            tMensaje.setText("empate");
                        }else if(valor>Maquina()){
                            tMensaje.setText("ganaMaquina");
                        }

                    }
                }
        );
        bPapel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valor=2;

                    }
                }
        );
        bTijera.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valor=3;

                    }
                }
        );
    }



    public void vs(){

    }
    public int Maquina() {
        int Maquina = (int) (Math.random()*3+1);
        return Maquina;
    }
}
