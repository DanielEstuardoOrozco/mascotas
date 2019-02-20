package com.example.adapters_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MascotasAdapter extends ArrayAdapter<Mascotas> {
    private List<Mascotas> lista;
    private Context context;
    private int layout;

    public MascotasAdapter(@NonNull Context context, @NonNull List<Mascotas> objects) {
        super(context, R.layout.item_list ,objects);
            this.lista = objects;
            this.context = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null){
            LayoutInflater li = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.item_list, null);
        }
        if (lista.get(position) != null){
            TextView nombre, nacimiento;
            ImageView imagen;
            imagen = v.findViewById(R.id.iv_imagen);
            if (lista.get(position).getTipo() == "AVE"){ imagen.setImageResource(R.drawable.ave); }
            if (lista.get(position).getTipo() == "PERRO"){ imagen.setImageResource(R.drawable.perro); }
            if (lista.get(position).getTipo() == "GATO"){ imagen.setImageResource(R.drawable.gato); }

            nombre = v.findViewById(R.id.lb_nombre);
            nacimiento = v.findViewById(R.id.lb_nacimiento);
            nombre.setText(lista.get(position).getNombre());
            nacimiento.setText(lista.get(position).getFecha());
        }
        return v;
    }
}
