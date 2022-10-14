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


        puntoTu.setText("Tú "+ Integer.toString(cont1));
        puntoMa.setText("Ma "+Integer.toString(cont2));

       bPiedra.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        valor=1;
                        valorM = Maquina();
                        if(valor<valorM && valorM!=2){
                            tMensaje.setText("GANAS \n HAS SACADO PIEDRA \n"+ cual(valorM));
                            puntoTu.setText("Tú "+ Integer.toString(cont1++));
                        }else if(valor<valorM && valorM!=3) {
                            tMensaje.setText("PIERDES \n HAS SACADO PIEDRA \n "+cual(valorM));
                            puntoMa.setText("Ma "+Integer.toString(cont2++));
                        }else{
                            tMensaje.setText("EMPATE \n " +cual(valorM));
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
                            tMensaje.setText("PIERDES \n HAS SACADO PAPEL \n "+cual(valorM));
                            puntoMa.setText("Ma "+Integer.toString(cont2++));
                        }else if(valor<2){
                            tMensaje.setText("GANAS \n HAS SACADO PAPEL \n"+ cual(valorM));
                            puntoTu.setText("Tú "+ Integer.toString(cont1++));
                        }else{
                            tMensaje.setText("EMPATE \n " +cual(valorM));
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
                            tMensaje.setText("GANAS \n HAS SACADO TIJERA \n"+ cual(valorM));
                            puntoTu.setText("Tú "+ Integer.toString(cont1++));
                        }else if(valor>valorM && valorM!=2) {
                            tMensaje.setText("PIERDES \n HAS SACADO TIJERA \n "+cual(valorM));
                            puntoMa.setText("Ma "+Integer.toString(cont2++));
                        }else{
                            tMensaje.setText("EMPATE \n " +cual(valorM));
                        }

                    }
                }
        );

        reiniciar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        puntoTu.setText("Tú "+Integer.toString(cont1=0));
                        puntoMa.setText("M "+Integer.toString(cont2=0));
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
                    vuelta = " MAQUINA SACÓ TIJERA";
                    break;
            }
            return vuelta;
        }

    }

