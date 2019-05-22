package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Treinador extends AppCompatActivity {
    Button tre;
    ImageButton back;
    Button competicao;
    Button info;
    TextView username;
    Button logout;
    TreinadorUser mario;
    Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinador);


        tre=findViewById(R.id.tre);
        tre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinador.this,Treinos_Treinador.class) ;
                startActivity(intent);
            }
        });
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
        info=findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinador.this,Info_Treinador.class) ;
                startActivity(intent);
            }
        });
        competicao=findViewById(R.id.competicao);
        competicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinador.this,Competicao_Treinador.class) ;
                startActivity(intent);
            }
        });

        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);

    }
}
