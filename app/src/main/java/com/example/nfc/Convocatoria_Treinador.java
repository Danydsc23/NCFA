package com.example.nfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Convocatoria_Treinador extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    TreinadorUser user;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    Button send;
    Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocatoria__treinador);
        logOut=findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Convocatoria_Treinador.this,MainActivity.class) ;
                startActivity(intent);
            }
        });

        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);


        user=Users.usersTrein.get(LogIn.username);

        spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Competicoes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        send=findViewById(R.id.enviar);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((spinner.getSelectedItem().toString().equals("sub8-CompetiçaoX"))&&(checkBox.isChecked() || checkBox2.isChecked() || checkBox4.isChecked() || checkBox3.isChecked() || checkBox5.isChecked() || checkBox6.isChecked())) {
                    System.out.println(user.atletassub8.toString());
                    System.out.println(checkBox.getText().toString());
                    System.out.println(checkBox2.getText().toString());
                    System.out.println(checkBox3.getText().toString());
                    System.out.println(checkBox4.getText().toString());

                    if (user.atletassub8.get(0).equals(checkBox.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(0));
                    } else if (user.atletassub8.get(1).equals(checkBox2.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(1));

                    } else if (user.atletassub8.get(2).equals(checkBox3.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(2));

                    } else if (user.atletassub8.get(3).equals(checkBox4.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(3));

                    } else if (user.atletassub8.get(4).equals(checkBox5.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(4));

                    } else if (user.atletassub8.get(5).equals(checkBox6.getText().toString())) {
                        user.convocados.add(user.atletassub8.get(5));
                    }
                    Toast.makeText(Convocatoria_Treinador.this,"Convocou os seguintes atletas"+user.convocados.toString(),Toast.LENGTH_SHORT).show();

                }else if ((spinner.getSelectedItem().toString().equals("sub14-competiçaoY"))&&(checkBox.isChecked() || checkBox2.isChecked() || checkBox4.isChecked() || checkBox3.isChecked() || checkBox5.isChecked() || checkBox6.isChecked())) {
                    System.out.println(user.atletassub14.toString());
                    System.out.println(checkBox.getText().toString());
                    System.out.println(checkBox2.getText().toString());
                    System.out.println(checkBox3.getText().toString());
                    System.out.println(checkBox4.getText().toString());

                    if (user.atletassub14.get(0).equals(checkBox.getText().toString())&& !user.atletassub14.contains(checkBox.getText().toString())) {
                        user.convocados.add(checkBox.getText().toString());
                    } else if (user.atletassub14.get(1).equals(checkBox2.getText().toString())&& !user.atletassub14.contains(checkBox2.getText().toString())) {
                        user.convocados.add(checkBox2.getText().toString());

                    } else if (user.atletassub14.get(2).equals(checkBox3.getText().toString())&& !user.atletassub14.contains(checkBox3.getText().toString())) {
                        user.convocados.add(checkBox3.getText().toString());

                    } else if (user.atletassub14.get(3).equals(checkBox4.getText().toString())&& !user.atletassub14.contains(checkBox4.getText().toString())) {
                        user.convocados.add(checkBox4.getText().toString());

                    } else if (user.atletassub14.get(4).equals(checkBox5.getText().toString())&& !user.atletassub14.contains(checkBox5.getText().toString())) {
                        user.convocados.add(checkBox5.getText().toString());

                    } else if (user.atletassub14.get(5).equals(checkBox6.getText().toString())&& !user.atletassub14.contains(checkBox6.getText().toString())) {
                        user.convocados.add(checkBox6.getText().toString());
                    }
                    Toast.makeText(Convocatoria_Treinador.this,"Convocou os seguintes atletas"+user.convocados.toString(),Toast.LENGTH_SHORT).show();

                }else Toast.makeText(Convocatoria_Treinador.this,"Tem de convocar alguem",Toast.LENGTH_SHORT).show();
            }
        });






    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {

        if (parent.getItemAtPosition(position).equals("sub8-CompetiçaoX")) {
            Toast.makeText(this, "Convocatória para a CompetiçaoX dos sub8", Toast.LENGTH_SHORT).show();
            checkBox.setText(user.atletassub8.get(0));
            checkBox2.setText(user.atletassub8.get(1));
            checkBox3.setText(user.atletassub8.get(2));
            checkBox4.setText(user.atletassub8.get(3));
            checkBox5.setText(user.atletassub8.get(4));
            checkBox6.setText(user.atletassub8.get(5));

        } else if (parent.getItemAtPosition(position).equals("sub14-competiçaoY")) {
            Toast.makeText(this, "Convocatória para a CompetiçaoY dos sub14", Toast.LENGTH_SHORT).show();
            checkBox.setText(user.atletassub14.get(0));
            checkBox2.setText(user.atletassub14.get(1));
            checkBox3.setText(user.atletassub14.get(2));
            checkBox4.setText(user.atletassub14.get(3));
            checkBox5.setText(user.atletassub14.get(4));
            checkBox6.setText(user.atletassub14.get(5));

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
