package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AtletaTreinos extends AppCompatActivity {
    private Button buttonpre;
    private Button buttoncal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_treinos);

        buttonpre = (Button) findViewById(R.id.button5);
        buttonpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAtletaTreinoPresence();
            }
        });

        buttoncal = (Button) findViewById(R.id.button6);
        buttoncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAtletaTreinoCalendario();
            }
        });
    }

    public void openAtletaTreinoPresence() {
        Intent intent = new Intent(this, AtletaTreinoPresence.class);
        startActivity(intent);
    }

    public void openAtletaTreinoCalendario() {
        Intent intent = new Intent(this, AtletaTreinoCalendario.class);
        startActivity(intent);
    }


}