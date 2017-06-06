package com.example.hector.principal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.hector.principal.R.layout.activity_main2;
import static com.example.hector.principal.R.layout.activity_web;

public class Menu extends AppCompatActivity implements View.OnClickListener  {

    RadioGroup contenedor;
    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);

        contenedor = (RadioGroup)findViewById(R.id.grupo);
        ingresar = (Button)findViewById(R.id.boton);
        ingresar.setOnClickListener(this);



        contenedor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                String opcion = "";
                if (checkedId == R.id.runo) {
                    opcion = "1";


                }else if(checkedId == R.id.rdos) {
                    opcion = "2";

                }else if (checkedId == R.id.rtres) {
                    opcion = "3";

                }else if (checkedId == R.id.rcuatro){
                    opcion = "3";
                }
                Intent intent = new Intent(Menu.this,web.class);
                intent.putExtra("parametro",opcion);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent next = new Intent(this,Otro.class);
        startActivity(next);
    }

/*

    @Override
    public void onClick(View v) {

        Intent siguiente = new Intent(this,Otro.class);
        startActivity(siguiente);
    }

    */
}
