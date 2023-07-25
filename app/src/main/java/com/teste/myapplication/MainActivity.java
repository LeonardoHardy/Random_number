package com.teste.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void sortearNumero(View view) {
        TextView texto = findViewById(R.id.exibirNumero);
        int numero = new Random().nextInt(61);

        texto.setText("N° " + numero);
    }
}