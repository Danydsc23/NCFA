package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Competicao_Treinador extends AppCompatActivity {
    ImageButton back;
    Button calendario;
    TextView username;
    Button convocatoria;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competicao__treinador);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Competicao_Treinador.this,Treinador.class) ;
                startActivity(intent);
            }
        });
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Competicao_Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
        calendario=findViewById(R.id.calendario);
        calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Competicao_Treinador.this,Calendario_CompTreinador.class) ;
                startActivity(intent);
            }
        });
        convocatoria=findViewById(R.id.convocatoria);
        convocatoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Competicao_Treinador.this,Convocatoria_Treinador.class) ;
                startActivity(intent);
            }
        });


        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);
    }
}
