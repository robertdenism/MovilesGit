package com.example.movilesgit.primeras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.movilesgit.R;

public class ContadorGrande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contgrande);
    }

    public static class MainActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_botones);
        }
    }
}