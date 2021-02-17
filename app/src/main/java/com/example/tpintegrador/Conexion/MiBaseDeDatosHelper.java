package com.example.tpintegrador.Conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MiBaseDeDatosHelper extends SQLiteOpenHelper {

    private static final String NOMBRE_BD = "Alojamientos";
    private static final String CREAR_TABLA_PROPIEDAD = "CREATE TABLE propiedad(_id integer primary key autoincrement, nombre text, descripcion text, precio_dia real, posee_internet integer, capacidad integer, latitud integer, longitud integer, tipo_propiedad text )";


    public MiBaseDeDatosHelper(Context context, Integer VERSION) {
        super(context, NOMBRE_BD, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_PROPIEDAD);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void guardar() {
    }
}
