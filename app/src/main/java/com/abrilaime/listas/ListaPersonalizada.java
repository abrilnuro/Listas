package com.abrilaime.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.abrilaime.listas.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonalizada extends AppCompatActivity {

    private ListView customList;
    private List<Persona> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);

        //referenciacion
        customList = (ListView)findViewById(R.id.custom_list);

        //crear la lista y llenarla
        personList = new ArrayList<Persona>();
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));
        personList.add(new Persona("Marco","34","Culiacan",android.R.drawable.ic_media_play));

        //crear instancia del adaptador
        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.item_custom_list, personList);

        //asignar el adaptador a la lista
        customList.setAdapter(adapter);


    }
}
