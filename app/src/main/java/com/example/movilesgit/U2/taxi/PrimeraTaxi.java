package com.example.movilesgit.U2.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.movilesgit.R;


import java.util.Date;


public class PrimeraTaxi extends AppCompatActivity {


    Button botonIr, switchVuelta;
    EditText inNombre, inDireccion, inDni, horaIda, horaVuelta, fechaIda, fechaVuelta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_taxi);

        //instanciamos el spinner y lo conectamos con el layout y donde hemos guardado nuestro string
        Spinner spinner = (Spinner) findViewById(R.id.elSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudades_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //instanciamos boton ir y switch

        botonIr = findViewById(R.id.botonIr);
        switchVuelta = findViewById(R.id.switchVuelta);

        //instancimos EditText

        inNombre = findViewById(R.id.inNombre);
        inDireccion = findViewById(R.id.inDireccion);
        inDni = findViewById(R.id.inDni);

        horaIda = findViewById(R.id.horaIda);
        horaVuelta = findViewById(R.id.horaVuelta);

        fechaIda = findViewById(R.id.fechaIda);
        fechaVuelta = findViewById(R.id.fechaVuelta);

        boolean estadoSwitch = switchVuelta.isEnabled();

        botonIr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String seleccionCiudad = spinner.getSelectedItem().toString();
                        String seleccionDida = fechaIda.getText().toString();
                        String seleccionHida = horaIda.getText().toString();
                        String nombre = inNombre.getText().toString();
                        String direccion = inDireccion.getText().toString();
                        String dni = inDni.getText().toString();
                        if(estadoSwitch==true) {
                            String seleccionDVuelta = fechaVuelta.getText().toString();
                            String seleccionHvuelta = horaVuelta.getText().toString();
                        }
                    }
                }
        );



    }

}