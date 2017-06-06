package com.example.hector.principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText usuario;
    EditText contraseña;
    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.txtusuario);
        contraseña = (EditText)findViewById(R.id.txtpass);
        ingresar = (Button)findViewById(R.id.entrar);
        ingresar.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        String nombre;
        nombre = usuario.getText().toString();

        String password;
        password = contraseña.getText().toString();



        if (nombre.equals("h")&& password.equals("1")){

            Intent siguiente = new Intent(this,Menu.class);
            startActivity(siguiente);

        } else{

        Toast.makeText(MainActivity.this,"usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
    }
    }
}
