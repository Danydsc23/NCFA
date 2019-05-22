package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Log_In extends AppCompatActivity {
    EditText username;
    EditText pass;
    Button done;
    ImageButton back;
    TreinadorUser exemplo;
    LogIn log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);


        username=findViewById(R.id.username);
        pass=findViewById(R.id.pass);

        LogIn.username=username.getText().toString();

        exemplo=Users.usersTrein.get(LogIn.username);
        exemplo.atletassub8.add("Afonso");
        exemplo.atletassub8.add("Antonio");
        exemplo.atletassub8.add("Ricardo");
        exemplo.atletassub8.add("Leonardo");
        exemplo.atletassub8.add("Gervasio");
        exemplo.atletassub8.add("Rui");


        exemplo.atletassub14.add("Jose");
        exemplo.atletassub14.add("Diogo");
        exemplo.atletassub14.add("Paulo");
        exemplo.atletassub14.add("Beronardo");
        exemplo.atletassub14.add("Diogo");
        exemplo.atletassub14.add("Gonçalo");

        exemplo.avisossub14.add(" Este é o primeiro aviso que vai aparecer");
        exemplo.avisossub14.add(" Este é o segund aviso que vai aparecer");
        exemplo.avisossub14.add(" Este é o terceiro aviso que vai aparecer");
        exemplo.avisossub14.add(" Este é o quarto aviso que vai aparecer");
        exemplo.avisossub14.add(" Este é o quinto aviso que vai aparecer");
        exemplo.avisossub14.add(" Este é o sexto aviso que vai aparecer so para ver se o scroll funciona como deve de ser ");

        exemplo.avisossub8.add(" Este é um aviso diferente so porque simr");
        exemplo.avisossub8.add(" GANDA SUB88888 CRLLLL");
        exemplo.avisossub8.add(" Este é o terceiro aviso que vai aparecer");
        exemplo.avisossub8.add(" Este é o quarto aviso que vai aparecer");
        exemplo.avisossub8.add(" Este é o quinto aviso que vai aparecer");
        exemplo.avisossub8.add(" Este é o sexto aviso que vai aparecer so para ver se o scroll funciona como deve de ser ");
        back=findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Log_In.this,MainActivity.class) ;
                startActivity(intent);
            }
        });

        done=findViewById(R.id.done);
        System.out.println(username.getText().toString());
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(username.getText().toString());
                if(Users.logUser(username.getText().toString(),pass.getText().toString())){
                    log=new LogIn(username.getText().toString());
                    TreinadorUser treinador=Users.usersTrein.get(username.getText().toString());
                    Atleta atleta=Users.usersAthl.get(username.getText().toString());

                    if(treinador.getPassword().equals(pass.getText().toString())) {
                        Intent intent = new Intent(Log_In.this, Treinador.class);
                        startActivity(intent);
                    }
                    else if(atleta.getPassword().equals(pass.getText().toString())){
                        Intent intent = new Intent(Log_In.this, AtletaInit.class);
                        startActivity(intent);
                    }
                }
                else Toast.makeText(Log_In.this, "Pass ou username errada", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
