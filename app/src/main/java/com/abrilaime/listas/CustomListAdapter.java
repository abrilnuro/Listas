package com.abrilaime.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abrilaime.listas.models.Persona;

import java.util.List;

/**
 * Created by aimew on 18/09/2016.
 */
public class CustomListAdapter extends ArrayAdapter<Persona> {

    private Persona personList[];
    private Context context;
    int layoutResourceItemId;

    public CustomListAdapter(Context context, int layoutResourceItemId, Persona personList[]){
        super(context, layoutResourceItemId, personList);

        this.context = context;
        this.layoutResourceItemId = layoutResourceItemId;
        this.personList = personList;
    }


    //clase interna
    static class customListHolder {
        TextView textNombre;
        TextView textEdad;
        TextView textCiudad;
        ImageView image;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        customListHolder holder = null;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_custom_list, parent, false);

            holder = new customListHolder();
            holder.textNombre = (TextView) view.findViewById(R.id.text_nombre);
            holder.textEdad = (TextView) view.findViewById(R.id.text_age);
            holder.textCiudad = (TextView) view.findViewById(R.id.text_city);
            holder.image = (ImageView) view.findViewById(R.id.image_item);

            view.setTag(holder);
        }else{
            holder = (customListHolder)view.getTag();
        }

        Persona persona = personList[position];
        holder.textNombre.setText(persona.getNombre());
        holder.textEdad.setText(persona.getEdad());
        holder.textCiudad.setText(persona.getCiudad());

        return view;
    }
}
