package com.example.gabriel.killapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Essteban on 23-04-2016.
 */
public class database extends SQLiteOpenHelper {
    private final static String NAME = "moon";
    private final static String TAG = database.class.getSimpleName();


    public database(Context context) {
        super(context,NAME,null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE database (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , hora int, " +
                "min int,latitud_direccion String, longitud_direccion String, latitud double, longitud double, velocidad double, grados double);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean Insertar(int hora, int min, String latitud_d, String longitud_d, double latitud, double longitud, double velocidad, double grados) {
        try {
            ContentValues values = new ContentValues();
            values.put("hora", hora);
            values.put("min", min);
            values.put("latitud_direccion", latitud_d);
            values.put("longitud_direccion", longitud_d);
            values.put("latitud", latitud);
            values.put("longitud", longitud);
            values.put("velocidad", velocidad);
            values.put("grados",grados);
            this.getWritableDatabase().insert("database", null, values);
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public String mostrar(int horadb, int mindb) {

        //String[] columna = {"hora","min", "latitud_d","longitud_d", "latitud", "longitud"};
        int gethora = 0;
        int getmin = 0;
        String getlatitud_d = "";
        String getlongitud_d = "";
        double getlatitud = 0;
        double getlongitud = 0;
        double getvelocidad = 0;
        double getgrados=0;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select grados from database"+" where hora="+horadb+" and min="+mindb+"", null);

        for (c.moveToFirst(); c.isAfterLast(); c.moveToNext()) {
        }
        if (c.moveToFirst()) {

            int hora,min,latitud_d,longitud_d,latitud,longitud,velocidad,distancia,grados;

            grados=c.getColumnIndex("grados");
            //hora = c.getColumnIndex("hora");
            //min = c.getColumnIndex("min");
            //latitud_d = c.getColumnIndex("latitud_direccion");
            //longitud_d = c.getColumnIndex("longitud_direccion");


            //latitud = c.getColumnIndex("latitud");
            //longitud = c.getColumnIndex("longitud");
            //velocidad = c.getColumnIndex("velocidad");
            //gethora = c.getInt(hora);
            //getmin = c.getInt(min);
            //getlatitud_d = c.getString(latitud_d);
            //getlongitud_d = c.getString(longitud_d);
            //getlatitud = c.getDouble(latitud);
            //getlongitud = c.getDouble(longitud);
            //getvelocidad = c.getDouble(velocidad);
               getgrados=c.getDouble(grados);
        }
        //"Hora:"+" "+gethora +"\n" + "Min:"+" "+getmin +"\n"+"Latitud:"+" "+ getlatitud +"\n"+"Longitud:"+" "+ getlongitud;
        return "\n"+getgrados+"";
    }



}