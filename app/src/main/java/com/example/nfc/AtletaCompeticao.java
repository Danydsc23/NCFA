package com.example.nfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AtletaCompeticao extends AppCompactAtivity {
    private ImageButton back;
    private Button buttonpr;
    private Button buttoncal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_competicao);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaCompeticao.this,AtletaInit.class) ;
                startActivity(intent);
            }
        });

        buttonpr=findViewById(R.id.button5);
        buttonpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaCompeticao.this,AtletaCompeticaoPresence.class) ;
                startActivity(intent);
            }
        });

        buttoncal=findViewById(R.id.button6);
        buttoncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaCompeticao.this,AtletaCompeticaoCalendario.class) ;
                startActivity(intent);
            }
        });
    }
}
