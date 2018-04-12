package vistas.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import controladores.Manejador;
import controladores.ReservaControlador;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class Cancelar_cliente extends AppCompatActivity {

    int dia;
    int mes;
    int año;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cancelar_cliente);


        String day = getIntent().getStringExtra("dia");
        String month = getIntent().getStringExtra("mes");
        String year = getIntent().getStringExtra("año");
        TextView textView = findViewById(R.id.changable_text_cancelar_cliente);
        String fecha_string = day + "/" + month + "/" + year;
        textView.setText(fecha_string);
        dia = Integer.parseInt(day);
        mes = Integer.parseInt(month);
        año = Integer.parseInt(year);
    }

    public void confirm_yes(View view){
        setContentView(R.layout.cancelar_cliente);
        cancelar_reserva();
    }

    public void confirm_no(View view){
        setContentView(R.layout.cancelar_cliente);
    }

    public void cr(View view){
        LayoutInflater inflater = getLayoutInflater();
        View toast_view = inflater.inflate(R.layout.confirm_screen, null);
        setContentView(toast_view);
    }

    public void cancelar_reserva(){
        ReservaControlador RC = new ReservaControlador();
        RC.borrar_reserva(dia, mes, año);
        Toast.makeText(this, "Reserva cancelada", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Cancelar_cliente.this, Home_empleado.class);
        startActivity(i);
    }
}
