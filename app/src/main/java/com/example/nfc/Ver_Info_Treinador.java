package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class Ver_Info_Treinador extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ListView caixaAvisos;
    ImageButton back;
    Spinner spinner;
    TreinadorUser userTreinador;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver__info__treinador);
        Users.addRandomUsers();
        caixaAvisos=findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner1);

        userTreinador =Users.usersTrein.get(LogIn.username);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Escaloes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Ver_Info_Treinador.this,Info_Treinador.class) ;
                startActivity(intent);
            }
        });
        username=findViewById(R.id.username);
        username.setText("Ola  "+LogIn.username);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (adapterView.getItemAtPosition(i).equals("sub14")){
            Toast.makeText(adapterView.getContext() ,"Esta nos sub14" ,Toast.LENGTH_SHORT).show();
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Ver_Info_Treinador.this,android.R.layout.simple_list_item_1,userTreinador.avisossub14);
            caixaAvisos.setAdapter(adapter);

        } else if (adapterView.getItemAtPosition(i).equals("sub8")){
            Toast.makeText(adapterView.getContext() ,"Esta nos sub8" ,Toast.LENGTH_SHORT).show();
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(Ver_Info_Treinador.this,android.R.layout.simple_list_item_1,userTreinador.avisossub8);
            caixaAvisos.setAdapter(adapter);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
