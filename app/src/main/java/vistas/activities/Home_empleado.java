package vistas.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import controladores.ReservaControlador;
import modelos.Cliente;
import controladores.Manejador;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class Home_empleado extends AppCompatActivity {

    boolean picked_date = false;
    String day;
    String month;
    String year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_empleado);
    }

    public void get_fecha(View view){
        DatePicker simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker_empleado);
        TextView textview = (TextView) findViewById(R.id.changable_text_canelar_empleado);
        day = Integer.toString(simpleDatePicker.getDayOfMonth());
        month = Integer.toString(simpleDatePicker.getMonth());
        year = Integer.toString(simpleDatePicker.getYear());
        String final_string = day + "/" + month + "/" + year;
        textview.setText(final_string);
        picked_date = true;
    }

    public void confirmar_reservacion(View view){
        if(picked_date){
            Manejador manejador = Manejador.getInstance();
            ReservaControlador RC = new ReservaControlador();
            Cliente cliente = RC.confirmar_Reserva(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
            if(cliente!=null){
                Intent i = new Intent(Home_empleado.this, Cancelar_cliente.class);
                i.putExtra("dia", day);
                i.putExtra("mes", month);
                i.putExtra("año", year);
                startActivity(i);
            }
            else
                Toast.makeText(this, "No existe reserva", Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(this, "No hay una fecha seleccionada", Toast.LENGTH_SHORT).show();
    }

    public void logout(View view){
        Manejador manejador = Manejador.getInstance();
        manejador.setSession(false);
        manejador.setLogged_persona(null);
        Intent i = new Intent(Home_empleado.this, login.class);
        startActivity(i);
    }
}
