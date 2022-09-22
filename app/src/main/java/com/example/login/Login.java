package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
    EditText user, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnLoging);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("Javier") && pass.getText().toString().equals("1234")){
                    //Intent intent = new Intent(MainActivity.this, Principal.class);
                    //startActivity(intent);
                    startActivity(new Intent(Login.this, InfoMangas.class));
                    Toast.makeText(Login.this, "Credenciales Correctas", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Login.this, "Credenciales Incorrectas", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}