package com.example.tpintegrador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.tpintegrador.modelo.Propiedad;

public class ListaAlojamientoActivity extends AppCompatActivity {
    Propiedad porpiedad;

    RecyclerView listaAlojamiento;
    RecyclerView.Adapter miAdaptador;
    private RecyclerView.LayoutManager milayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alojamiento);
        listaAlojamiento= findViewById(R.id.lisAlojamiento);

        milayoutManager = new LinearLayoutManager(this);

        listaAlojamiento.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        listaAlojamiento.setHasFixedSize(true);
        listaAlojamiento.setLayoutManager(milayoutManager);
    }
}