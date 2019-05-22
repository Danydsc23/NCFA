package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;


public  class create_account extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button done;
    Spinner spinner;
    CheckBox IDyes;
    CheckBox IDno;
    EditText ncfaIDtext;
    EditText username;
    EditText email;
    EditText number;
    EditText password;
    EditText repeatpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Type_Users, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        IDno=findViewById(R.id.checkno);
        IDyes=findViewById(R.id.checkyes);

        ncfaIDtext=findViewById((R.id.NCFAID));
        username=findViewById(R.id.username);
        email=findViewById(R.id.email);
        number=findViewById(R.id.numero);
        password=findViewById(R.id.pass);
        repeatpass=findViewById(R.id.rep_pass);

        done=findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!username.getText().toString().isEmpty()&&!password.getText().toString().isEmpty()&&!repeatpass.getText().toString().isEmpty()&&!email.getText().toString().isEmpty()&&!number.getText().toString().isEmpty()&&(IDyes.isChecked() || IDno.isChecked())){
                    // TREINADOR CHECKED
                    if(spinner.getSelectedItem().toString().equals("Treinador") && IDyes.isChecked() && Users.validCouchID(Integer.parseInt((ncfaIDtext.getText().toString())))) {
                        Users.addCouchUser(username.getText().toString(),password.getText().toString(),repeatpass.getText().toString(),Integer.parseInt(ncfaIDtext.getText().toString()));
                        Intent intent =new Intent(create_account.this,Treinador.class) ;
                        startActivity(intent);

                    }
                    // Atleta CHECKED
                    else if(spinner.getSelectedItem().toString().equals("Atleta")&& IDyes.isChecked() && Users.validAthleteID(Integer.parseInt(ncfaIDtext.getText().toString()))||Users.usersTrein.containsKey(username.getText().toString())) {
                        Users.addAtuser(username.getText().toString(),password.getText().toString(),repeatpass.getText().toString(),Integer.parseInt(ncfaIDtext.getText().toString()));
                        Intent intent =new Intent(create_account.this,AtletaInit.class) ;
                        startActivity(intent);
                    }

                    else if(spinner.getSelectedItem().toString().equals("Atleta")&& IDyes.isChecked() && !Users.validAthleteID(Integer.parseInt(ncfaIDtext.getText().toString()))||Users.usersAthl.containsKey(username.getText().toString())) {
                        Toast.makeText(create_account.this, "ID invalido", Toast.LENGTH_SHORT).show();
                    }
                    else if(spinner.getSelectedItem().toString().equals("Treinador")&& IDyes.isChecked() && !Users.validAthleteID(Integer.parseInt(ncfaIDtext.getText().toString()))) {
                        Toast.makeText(create_account.this, "ID invalido", Toast.LENGTH_SHORT).show();
                    }

                }else Toast.makeText(create_account.this, "Por favor preencha tudo", Toast.LENGTH_SHORT).show();
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
