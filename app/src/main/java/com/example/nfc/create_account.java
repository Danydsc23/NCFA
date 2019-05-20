package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;


public  class create_account extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button done;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Type_Users, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        done=findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinner.getSelectedItem().toString().equals("Treinador")) {
                    Intent intent =new Intent(create_account.this,Treinador.class) ;
                    startActivity(intent);
                }
                else if(spinner.getSelectedItem().toString().equals("Atleta")) {
                    Intent intent =new Intent(create_account.this,AtletaInit.class) ;
                    startActivity(intent);
                }

            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        String text=parent.getItemAtPosition(position).toString();

        if (parent.getItemAtPosition(position).equals("Escolha")){
            Toast.makeText(parent.getContext() ,"Favor de preencher" ,Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
