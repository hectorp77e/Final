package com.example.hector.principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Otro extends AppCompatActivity implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    ImageView imageView;
    ToggleButton toggleButton;
    Spinner spinner,spEstudiantes,spAspirantes;
    String[] ArrayEstudiantes = new String[]{"Calendario Academico","Tarifas Institucionales","Homologaciones"};
    String[] ArrayOpciones = new String[]{"Desplegar Enlaces","Ocultar Enlaces"};
    String[] ArrayAspirantes = new String[]{"Oferta Academica","Requisitos de Inscripcion","Formas de Pago"};
    String[] vacio = new  String[]{};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro);

        imageView = (ImageView)findViewById(R.id.img);
        spinner = (Spinner) findViewById(R.id.spinner);
        spEstudiantes = (Spinner) findViewById(R.id.spEstudiante);
        toggleButton = (ToggleButton) findViewById(R.id.tgbEstudiantes);



        toggleButton.setOnCheckedChangeListener(Otro.this);
        spinner.setOnItemSelectedListener(Otro.this);
        spEstudiantes.setOnItemSelectedListener(Otro.this);



        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ArrayOpciones);
        spinner.setAdapter(adapter);



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        switch (parent.getId())
        {
            case R.id.spinner:
                int seleccionado = spinner.getSelectedItemPosition();
                if (seleccionado == 0){
                    ArrayAdapter adEstudiante = new ArrayAdapter<String>(Otro.this, android.R.layout.simple_spinner_item, ArrayEstudiantes);
                    spEstudiantes.setAdapter(adEstudiante);
                }else{
                    ArrayAdapter adEstudiante = new ArrayAdapter<String>(Otro.this, android.R.layout.simple_spinner_item, vacio);
                    spEstudiantes.setAdapter(adEstudiante);
                }
        }


        spEstudiantes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String resultado = "";

                if (position == 0) resultado = "E1";
                else if (position == 1) resultado = "E2";
                else if (position == 2) resultado = "E3";

                Intent intent = new Intent(Otro.this,WebOpciones.class);
                intent.putExtra("parametro",resultado);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (toggleButton.isChecked())
        {
            imageView.setImageResource(R.drawable.im1);
        }else
        {
            imageView.setImageResource(R.drawable.logo);
        }

    }
}

