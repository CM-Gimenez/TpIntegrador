package com.example.tpintegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;


import com.example.tpintegrador.Conexion.MiBaseDeDatosHelper;
import com.example.tpintegrador.modelo.TipoAlojamiento;

import java.util.ArrayList;

public class  FormEditarAlojamientoActivity extends AppCompatActivity {
    EditText txtNombre, txtDescripcion, txtPrecio, txtCapacidad, txtLatitud, txtLongitud;
    Button btnGuardar, btnCancelar, btnCoordenadas;
    Spinner spTipoPropiedad;
    CheckBox chPoseeInternet;
    RadioGroup alquilada;
    MiBaseDeDatosHelper conexion;
    ArrayList<TipoAlojamiento> tipoAlojamientos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_alojamiento);
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtDescripcion = (EditText)findViewById(R.id.txtDescripcion);
        txtPrecio = (EditText)findViewById(R.id.precio);
        txtCapacidad = (EditText)findViewById(R.id.capacidad);
        btnGuardar =  (Button) findViewById(R.id.btnGuardarPropiedad);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnCoordenadas = (Button)findViewById(R.id.btnBuscarCoordenadas);
        spTipoPropiedad = (Spinner) findViewById(R.id.cmbTipoPropiedad);
        chPoseeInternet = (CheckBox) findViewById(R.id.poseeInternet);
        txtLatitud = (EditText) findViewById(R.id.txtLatitud);
        txtLongitud = (EditText) findViewById(R.id.txtLongitud);

        String latitudObtenida = getIntent().getStringExtra("latitud");
        txtLatitud.setText(latitudObtenida);
        String longitudObtenida = getIntent().getStringExtra("longitud");
        txtLongitud.setText(longitudObtenida);



        conexion = new MiBaseDeDatosHelper(this, 1 );

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase dat = conexion.getWritableDatabase();
                String nombre = txtNombre.getText().toString();
                String descripcion = txtDescripcion.getText().toString();
                double precio =Double.parseDouble(txtPrecio.getText().toString());
                String capacidad = txtCapacidad.getText().toString();
                String latitud =  txtLatitud.getText().toString();
                String longitud = txtLongitud.getText().toString();
                

            }
        });
        btnCoordenadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(FormEditarAlojamientoActivity.this,MapsActivity.class);
                startActivity(i1);
            }
        });
    }
}