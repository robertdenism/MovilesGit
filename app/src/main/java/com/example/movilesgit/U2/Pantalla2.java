package com.example.movilesgit.U2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.movilesgit.R;

public class Pantalla2 extends AppCompatActivity {

    TextView receptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        receptor= findViewById(R.id.receptor);
        Intent i = getIntent();
        receptor.setText(i.getStringExtra("NOMBRE"));
    }

}