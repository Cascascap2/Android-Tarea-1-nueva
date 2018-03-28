package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    public void confirmar_reserva(View view){
        Manejador manejador = Manejador.getInstance();
        Cliente c = manejador.confirmar_Reserva(dia, mes, año);
        if(c==null){
            Cliente cliente = (Cliente) manejador.getLogged_persona();
            Reserva r = new Reserva(dia, mes, año, cliente);
            manejador.agregar_Reserva(r);
            Toast.makeText(this, "Reserva creada con exito.", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Ya existe una reserva este dia", Toast.LENGTH_SHORT).show();
    }
}
