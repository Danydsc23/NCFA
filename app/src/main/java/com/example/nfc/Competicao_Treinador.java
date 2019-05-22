package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Competicao_Treinador extends AppCompatActivity {
    ImageButton back;
    Button calendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competicao__treinador);

        back=findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Competicao_Treinador.this,Treinos_Treinador.class) ;
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
    }
}
