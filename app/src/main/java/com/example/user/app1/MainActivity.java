package com.example.user.app1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Autor: Antonio José Lucana H.
    //
    //Fecha 17/04/2017
    //Tarea 1

    private Button btnConectar;

    private EditText etUser;
    private EditText etPass;

    private String user;
    private String pass;
    private Intent intent;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        MediaPlayer musica;
        musica = MediaPlayer.create(this, R.raw.legion);
        musica.setLooping(true);
        musica.isPlaying();
        musica.start();


        user = "antony@gmail.com";
        pass = "lucana";

        btnConectar = (Button) findViewById(R.id.btnLogin);
        btnSalir = (Button) findViewById(R.id.btnExit);

        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);


        btnConectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conectar();
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
        public void conectar() {
            if (etUser.getText().toString().equals("") ||
                    etPass.getText().toString().equals("")) {
                Toast.makeText(getApplicationContext(),
                        "Existen campos vacios.",
                        Toast.LENGTH_LONG).show();
            } else {
                if (etUser.getText().toString().equals(user) &&
                        etPass.getText().toString().equals(pass)) {
                    intent = new Intent(getApplicationContext(), Activity2.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Usuario o contrasenia incorrectos.",
                            Toast.LENGTH_LONG).show();
                }
            }
        }


    }





