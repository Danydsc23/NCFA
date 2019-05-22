package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AtletaInit extends AppCompatActivity {
    private Button buttontr;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_init);

        buttontr = (Button) findViewById(R.id.button3);
        buttontr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAtletaTreinos();
            }
        });

        buttontr = (Button) findViewById(R.id.button7);
        buttontr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAtletaComp();
            }
        });

        buttontr = (Button) findViewById(R.id.button8);
        buttontr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openAtletaInfo();
            }
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaInit.this,MainActivity.class) ;
                startActivity(intent);
            }
        });
    };

    public void openAtletaTreinos() {
        Intent intent = new Intent(this, AtletaTreinos.class);
        startActivity(intent);
    }

    public void openAtletaComp() {
        Intent intent = new Intent(this, AtletaComp.class);
        startActivity(intent);
    }

    public void openAtletaInfo() {
        Intent intent = new Intent(this, AtletaInfo.class);
        startActivity(intent);
    }
}