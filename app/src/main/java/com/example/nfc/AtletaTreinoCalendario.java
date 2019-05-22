package com.example.nfc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.Toast;

public class AtletaTreinoCalendario extends AppCompatActivity {
    private CalendarView mCalendarView;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_treino_calendario);

       mCalendarView = (CalendarView) findViewById(R.id.calendarView);

       mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

           @Override
           public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
               Toast.makeText(getBaseContext(), "Não tens treino marcado para hoje!", Toast.LENGTH_LONG).show();
           }
       });

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AtletaTreinoCalendario.this,AtletaTreino.class) ;
                startActivity(intent);
            }
        });

    }
}
