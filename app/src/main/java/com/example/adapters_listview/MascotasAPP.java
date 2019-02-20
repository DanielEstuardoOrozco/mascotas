package com.example.adapters_listview;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class MascotasAPP extends Application {
    private List<Mascotas> lista_mascotas;

    @Override
    public void onCreate() {
        super.onCreate();
        lista_mascotas = new ArrayList<Mascotas>();
    }

    public void insertaMascotas(Mascotas mascota){
        lista_mascotas.add(mascota);
    }

    public List<Mascotas> regresaMascotas(){
        return lista_mascotas;
    }

}
