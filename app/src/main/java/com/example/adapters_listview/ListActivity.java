package com.example.adapters_listview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    private ListView lista;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lista = findViewById(R.id.l_lista);
        lista.setAdapter(new MascotasAdapter(this,  ((MascotasAPP)getApplication()).regresaMascotas()));
    }
}
