package com.abrilaime.listas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abrilaime.listas.models.Persona;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by aimew on 18/09/2016.
 */
public class CustomListAdapter extends ArrayAdapter<Persona> implements ClickEvent{


    public CustomListAdapter(Context context, int resource, List<Persona> objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //obtener los datos del item en esta posicion
        Persona persona = getItem(position);

        //si no se ha creado nungun view
        if (convertView == null){

            //crear el inflater
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_custom_list, parent, false);
        }

        TextView textNombre = (TextView)convertView.findViewById(R.id.text_name);
        TextView textEdad = (TextView)convertView.findViewById(R.id.text_age);
        TextView textCiudad = (TextView)convertView.findViewById(R.id.text_city);
        ImageView image = (ImageView)convertView.findViewById(R.id.image_item);

        textNombre.setText(persona.getNombre());
        textEdad.setText(persona.getEdad());
        textCiudad.setText(persona.getCiudad());
        image.setImageResource(android.R.drawable.ic_dialog_email);

        return convertView;
    }

}
