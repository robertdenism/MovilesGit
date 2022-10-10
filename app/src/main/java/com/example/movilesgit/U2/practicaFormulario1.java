package com.example.movilesgit.U2;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.movilesgit.R;

public class practicaFormulario1 extends AppCompatActivity {

    TextView textNombre, textTelefono, textCorreo, textDatosIn;
    EditText inputNombre, inputTelefono, inputCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario1);

        textNombre= findViewById(R.id.textNombre);
        textCorreo= findViewById(R.id.inputCorreo);
        textTelefono= findViewById(R.id.textTelefono);
        textDatosIn = findViewById(R.id.textDatosIn);

        inputNombre = findViewById(R.id.inputNombre);
        inputCorreo = findViewById(R.id.inputCorreo);
        inputTelefono = findViewById(R.id.inputTelefono);

        TextView.OnEditorActionListenernew variable = new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent keyEvent) {
                if(actionId == EditorInfo.IME_ACTION_GO){
                    textDatosIn.setText(inputNombre.getText());
                    textDatosIn.setTextColor(Color.RED);
                }

                return false;
            }
        };
        inputCorreo.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_GO){
                    textDatosIn.setText(inputCorreo.getText());
                    textDatosIn.setTextColor(Color.RED);
                }

                return false;
            }
        });



    }


}