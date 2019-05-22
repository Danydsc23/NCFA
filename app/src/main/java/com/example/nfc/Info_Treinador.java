package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Info_Treinador extends AppCompatActivity {
    ImageButton back;
    Button avisos;
    Button criarAviso;
    TextView username;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__treinador);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Info_Treinador.this,Treinador.class) ;
                startActivity(intent);
            }
        });
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Info_Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });

        avisos=findViewById(R.id.avisos);
        avisos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Info_Treinador.this,Ver_Info_Treinador.class) ;
                startActivity(intent);
            }
        });

        criarAviso=findViewById(R.id.create);
        criarAviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Info_Treinador.this,CriarAvisoTreinador.class) ;
                startActivity(intent);
            }
        });
        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);
    }


}
