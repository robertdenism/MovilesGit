package com.example.movilesgit.U2.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.movilesgit.R;
import com.example.movilesgit.U2.Pantalla2;


import java.util.Date;


public class PrimeraTaxi extends AppCompatActivity {


    Button botonIr, switchVuelta;
    EditText inNombre, inDireccion, inDni, horaIda, horaVuelta, fechaIda, fechaVuelta;
    Spinner elSpinner ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_taxi);

        //instanciamos el spinner y lo conectamos con el layout y donde hemos guardado nuestro string
        elSpinner = (Spinner) findViewById(R.id.elSpinner);
       ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.ciudades_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        elSpinner.setAdapter(adapter);

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

                        nombre();
                    }
                }

        );



    }
    private void nombre(){
        String seleccionCiudad = elSpinner.getSelectedItem().toString();
        String seleccionDida = fechaIda.getText().toString();
        String seleccionHida = horaIda.getText().toString();
        String nombre = inNombre.getText().toString();
        String direccion = inDireccion.getText().toString();
        String dni = inDni.getText().toString();
        String seleccionDVuelta = fechaVuelta.getText().toString();
        String seleccionHvuelta = horaVuelta.getText().toString();

        Intent intento = new Intent(this, ResumenViaje.class);
        intento.putExtra("CIUDAD", seleccionCiudad);
        intento.putExtra("DIA IDA", seleccionDida);
        intento.putExtra("HORA IDA", seleccionHida);
        intento.putExtra("NOMBRE", nombre);
        intento.putExtra("DIRECCION", direccion);
        intento.putExtra("DNI", dni);
        intento.putExtra("DIA VUELTA", seleccionDVuelta);
        intento.putExtra("HORA VUELTA", seleccionHvuelta);


        startActivity(intento);

    }


}