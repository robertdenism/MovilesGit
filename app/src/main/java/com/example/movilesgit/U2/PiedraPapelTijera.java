package com.example.movilesgit.U2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.movilesgit.R;

public class PiedraPapelTijera extends AppCompatActivity {

    ImageButton bPiedra, bPapel, bTijera;
    Button reiniciar;
    TextView tMensaje, puntoTu, puntoMa;

    int valor = 0, valorM = 0, cont1 = 0, cont2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);

        bPiedra=(ImageButton)findViewById(R.id.bPiedra);
        bPapel=(ImageButton) findViewById(R.id.bPapel);
        bTijera=(ImageButton)findViewById(R.id.bTijera);

        reiniciar=findViewById(R.id.reiniciar);

        tMensaje=findViewById(R.id.tMensaje);
        puntoTu=findViewById(R.id.puntoTu);
        puntoMa=findViewById(R.id.puntoMa);


       bPiedra.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        valor=1;
                        valorM = Maquina();
                        if(valor<valorM && valor!=2){
                            tMensaje.setText("Ganas");
                        }else if(valor<valorM && valor!=3) {
                            tMensaje.setText("Gana la maquina");
                        }else{
                            tMensaje.setText("empate");
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


        public int Maquina() {
            int Maquina = (int) (Math.random() * 3 + 1);
            return Maquina;
        }
    }

