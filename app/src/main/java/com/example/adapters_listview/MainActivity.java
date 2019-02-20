package com.example.adapters_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nombre, nacimiento;
    private RadioButton perro, gato, ave;
    private Button guardar, consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txt_nombre);
        nacimiento = findViewById(R.id.txt_nacimiento);
        perro  = findViewById(R.id.rb_perro);
        gato  = findViewById(R.id.rb_gato);
        ave  = findViewById(R.id.rb_ave);
        guardar = findViewById(R.id.bt_guardar);
        consultar = findViewById(R.id.bt_consultar);

        guardar.setOnClickListener(this);
        consultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Mascotas tmp = new Mascotas();
        boolean b = false;

        switch (v.getId()){
            case R.id.bt_guardar:
                tmp.setNombre(nombre.getText().toString());
                tmp.setFecha(nacimiento.getText().toString());
                if (perro.isChecked()){
                    tmp.setTipo("PERRO");
                }
                if (gato.isChecked()){
                    tmp.setTipo("GATO");
                }
                if (ave.isChecked()){
                    tmp.setTipo("AVE");
                }
                ((MascotasAPP)getApplication()).insertaMascotas(tmp);
                nombre.setText("");
                nacimiento.setText("");

                break;
            case R.id.bt_consultar:
                Intent intent = new Intent(this, ListActivity.class );
                startActivity(intent);
                break;
        }
    }
}
