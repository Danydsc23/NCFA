package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class CriarAvisoTreinador extends AppCompatActivity {
    CheckBox sub14;
    CheckBox sub8;
    EditText aviso;
    Button criaraviso;
    TreinadorUser mario;
    TextView username;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState)   {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_aviso_treinador);
        sub14=findViewById(R.id.sub14);
        sub8=findViewById(R.id.sub8);
        aviso=findViewById(R.id.aviso);
        criaraviso=findViewById(R.id.enviar);

        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CriarAvisoTreinador.this,Treinador.class) ;
                startActivity(intent);
            }
        });

        mario=Users.usersTrein.get("Mario");

        System.out.println(mario.avisossub8.toString());

        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);

        criaraviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub8.isChecked()&& sub14.isChecked() || (!sub8.isChecked()&& !sub14.isChecked()))Toast.makeText( CriarAvisoTreinador.this,"Escolha apenas um escalao ",Toast.LENGTH_LONG).show();
                else if(aviso.getText().toString().equals("")) Toast.makeText( CriarAvisoTreinador.this,"Escreva um aviso por favor",Toast.LENGTH_LONG).show();
                else{
                    if(sub8.isChecked()) {
                        mario.avisossub8.add(aviso.getText().toString());
                        System.out.println(mario.avisossub8.toString());

                        Intent intent = new Intent(CriarAvisoTreinador.this, Info_Treinador.class);
                        startActivity(intent);
                        Toast.makeText(CriarAvisoTreinador.this, "Aviso enviado com sucesso ", Toast.LENGTH_LONG).show();
                    }
                    else if(sub14.isChecked()){
                        mario.avisossub14.add(aviso.getText().toString());
                        Intent intent = new Intent(CriarAvisoTreinador.this, Info_Treinador.class);
                        startActivity(intent);
                        Toast.makeText(CriarAvisoTreinador.this, "Aviso enviado com sucesso ", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


    }
}
