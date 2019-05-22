package com.example.nfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Presencas_Treinador extends AppCompatActivity {
    ImageButton back;
    Button logOut;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presencas__treinador);
        back=findViewById(R.id.back);
        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Presencas_Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Presencas_Treinador.this,Treinos_Treinador.class) ;
                startActivity(intent);
            }
        });
    }
}
