package com.abrilaime.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.abrilaime.listas.models.Persona;

public class ListaPersonalizada extends AppCompatActivity {

    private ListView customList;
    private Persona arrayPersona[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);

        //referenciacion
        customList = (ListView)findViewById(R.id.custom_list);

        //crear el arreglo y llenarlo
        arrayPersona = new Persona[]{
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email),
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email),
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email),
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email),
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email),
                new Persona("Abril", "22", "Culiacan", android.R.drawable.ic_dialog_email)
        };

        //crear instancia del adaptador
        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.item_custom_list,arrayPersona);

        //asignar el adaptador a la lista
        customList.setAdapter(adapter);


    }
}
