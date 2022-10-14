package com.example.movilesgit.U2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.movilesgit.R;

import java.util.Random;

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
                        if(valor<valorM && valorM!=2){
                            tMensaje.setText("Ganas "+ cual(valorM));
                        }else if(valor<valorM && valorM!=3) {
                            tMensaje.setText("Gana la maquina "+ cual(valorM));
                        }else{
                            tMensaje.setText("empate "+ cual(valorM));
                        }

                    }
                }
        );


        bPapel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valor=2;
                        valorM = Maquina();
                        if(valorM>2){
                            tMensaje.setText("Pierdes "+ cual(valorM));
                        }else if(valor<2){
                            tMensaje.setText("Has Ganado "+ cual(valorM) );
                        }else{
                            tMensaje.setText("Empate"+ cual(valorM));
                        }

                    }
                }
        );
        bTijera.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        valor=3;
                        valorM = Maquina();
                        if(valor>valorM && valorM!=1){
                            tMensaje.setText("Ganas ");
                            puntoTu.setText(Integer.toString(cont1++));
                        }else if(valor>valorM && valorM!=2) {
                            tMensaje.setText("Gana la maquina ");
                            puntoMa.setText(Integer.toString(cont2++));
                        }else{
                            tMensaje.setText("empate ");
                        }

                    }
                }
        );

        reiniciar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        puntoTu.setText(Integer.toString(cont1=0));
                        puntoMa.setText(Integer.toString(cont2=0));
                    }
                }
        );
    }




        public int Maquina() {
            int M = (int) (Math.random() * 3 + 1);
            return M;
        }

        public String cual(int v){
                String vuelta = "";
            switch (v){
                case 1:
                    vuelta = " MAQUINA SACÓ PIEDRA";
                    break;
                case 2:
                    vuelta = " MAQUINA SACÓ PAPEL";
                    break;
                case 3:
                    vuelta = " MAQUINA SACÓ PIEDRA";
                    break;
            }
            return vuelta;
        }




    }

