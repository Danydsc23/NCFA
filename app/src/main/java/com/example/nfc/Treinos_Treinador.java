package com.example.nfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Treinos_Treinador extends AppCompatActivity  {
    ImageButton back;
    Button presencas;
    TextView username;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treinos__treinador);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinos_Treinador.this,Treinador.class) ;
                startActivity(intent);
            }
        });
        presencas=findViewById(R.id.presencas);
        presencas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinos_Treinador.this,Presencas_Treinador.class) ;
                startActivity(intent);
            }
        });
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Treinos_Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);


    }


}
