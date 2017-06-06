package com.example.hector.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class WebOpciones extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_opciones);

        String resultado  = getIntent().getStringExtra("parametro");
        webView = (WebView)findViewById(R.id.webOp);

        if (resultado.equals("E1")) {
            webView.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-37.html");


        }else if(resultado.equals("E2")) {

            webView.loadUrl("http://www.uniremington.edu.co/manizales/784-tarifas-institucionales-2017.html");

        }else if (resultado.equals("E3")) {

            webView.loadUrl("http://www.uniremington.edu.co/manizales/782-homologaciones.html");

        }

    }
}
