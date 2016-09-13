package com.abrilaime.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PerfilActivity extends AppCompatActivity {

    private TextView textNombre;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        textNombre = (TextView) findViewById(R.id.text_nombre);

        Intent intent = getIntent();
        nombre = intent.getStringExtra("nombre");

        textNombre.setText(nombre);

    }
}
