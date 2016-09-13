package com.abrilaime.listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaSencillaActivity extends AppCompatActivity{

    private ListView listaSencilla;
    private String[] arrayString;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sencilla);

        listaSencilla = (ListView)findViewById(R.id.simple_list);

        arrayString = new String[]{"Abril", "Mariana", "Jose", "Marcos", "Maria", "Luis"};

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayString);

        listaSencilla.setAdapter(adapter);

        listaSencilla.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String item = arrayString[i].toString();

                Intent intent = new Intent(ListaSencillaActivity.this, PerfilActivity.class);
                intent.putExtra("nombre", item);
                intent.putExtra("array", arrayString);
                startActivity(intent);

            }
        });
    }

}
