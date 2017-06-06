package com.example.hector.principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class web extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        String resultado  = getIntent().getStringExtra("parametro");

        webView = (WebView)findViewById(R.id.web);




        if (resultado.equals("1")) {

            webView.loadUrl("https://accounts.google.com/signin/v2/sl/pwd?continue=http%3A%2F%2Fmail.google.com%2Fa%2Funiremington.edu.co%2F&ltmpl=default&service=mail&sacu=1&hd=uniremington.edu.co&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        }else if(resultado.equals("2")) {

            webView.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");

        }else if (resultado.equals("3")) {

            webView.loadUrl("https://www.q10academico.com/login?ReturnUrl=%2F&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");

        }else if (resultado.equals("4")){

            webView.loadUrl("http://www.uniremingtonmanizales.edu.co/liquidacion/inicio.php");
        }



    }
}
