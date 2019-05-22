package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AtletaInit extends AppCompatActivity {
    private Button buttontr;
    private Button buttoncomp;
    private Button buttoninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_init);

        buttontr=findViewById(R.id.button3);
        buttontr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaInit.this,AtletaTreino.class) ;
                startActivity(intent);
            }
        });

        buttoncomp=findViewById(R.id.button7);
        buttoncomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaInit.this,AtletaCompeticao.class) ;
                startActivity(intent);
            }
        });

        buttoninfo=findViewById(R.id.button8);
        buttoninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaInit.this,AtletaInformacao.class) ;
                startActivity(intent);
            }
        });
    };
}