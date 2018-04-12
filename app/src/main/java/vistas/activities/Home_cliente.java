package vistas.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import controladores.Manejador;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class Home_cliente extends AppCompatActivity {

    boolean picked_date = false;
    String day;
    String month;
    String year;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_cliente);
    }

    public void get_fecha(View view){
        DatePicker simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
        TextView textview = (TextView) findViewById(R.id.changable_text_canelar_cliente);
        day = Integer.toString(simpleDatePicker.getDayOfMonth());
        month = Integer.toString(simpleDatePicker.getMonth());
        year = Integer.toString(simpleDatePicker.getYear());
        String final_string = day + "/" + month + "/" + year;
        textview.setText(final_string);
        picked_date = true;
    }

    public void move_to_confirmar_cliente(View view){
        if(picked_date){
            Intent i = new Intent(Home_cliente.this, Confirmar_cliente.class);
            i.putExtra("dia", day);
            i.putExtra("mes", month);
            i.putExtra("año", year);
            startActivity(i);
        }
    }

    public void logout(View view){
        Manejador manejador = Manejador.getInstance();
        manejador.setSession(false);
        manejador.setLogged_persona(null);
        Intent i = new Intent(Home_cliente.this, login.class);
        startActivity(i);
    }
}
