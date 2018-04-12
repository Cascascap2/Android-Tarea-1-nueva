package vistas.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import controladores.ReservaControlador;
import modelos.Cliente;
import controladores.Manejador;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;
import modelos.Reserva;

public class Confirmar_cliente extends AppCompatActivity {

    int dia;
    int mes;
    int año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_cliente);

        String day = getIntent().getStringExtra("dia");
        String month = getIntent().getStringExtra("mes");
        String year = getIntent().getStringExtra("año");
        TextView textView = findViewById(R.id.changable_text_confirmar_cliente);
        String fecha_string = day + "/" + month + "/" + year;
        textView.setText(fecha_string);
        dia = Integer.parseInt(day);
        mes = Integer.parseInt(month);
        año = Integer.parseInt(year);
    }

    public void confirm_yes(View view){
        setContentView(R.layout.confirmar_cliente);
        confirmar_reserva();
    }

    public void confirm_no(View view){
        setContentView(R.layout.confirmar_cliente);
    }

    public void cr(View view){
        LayoutInflater inflater = getLayoutInflater();
        View toast_view = inflater.inflate(R.layout.confirm_screen, null);
        setContentView(toast_view);
    }

    public void confirmar_reserva(){
        ReservaControlador RC = new ReservaControlador();
        Manejador manejador = Manejador.getInstance();
        Cliente c = RC.confirmar_Reserva(dia, mes, año);
        if(c==null){
            Cliente cliente = (Cliente) manejador.getLogged_persona();
            RC.crear_reserva(dia, mes, año, cliente);
            Toast.makeText(this, "Reserva creada con exito.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Confirmar_cliente.this, Home_cliente.class);
            startActivity(i);
        }
        else
            Toast.makeText(this, "Ya existe una reserva este dia", Toast.LENGTH_SHORT).show();

    }
}
