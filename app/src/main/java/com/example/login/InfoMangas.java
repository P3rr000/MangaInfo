package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoMangas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomangas);
    }
    public void MostrarLista(View view) {
        Intent mostrarLista = new Intent(this, CardViewUno.class);
        startActivity(mostrarLista);
    }
}