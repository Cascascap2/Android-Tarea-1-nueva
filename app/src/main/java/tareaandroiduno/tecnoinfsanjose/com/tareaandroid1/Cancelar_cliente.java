package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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

    public void cancelar_reserva(View view){

        //LayoutInflater inflater = getLayoutInflater();
        //View toast_view = inflater.inflate(R.layout.confirm_screen, (ViewGroup) findViewById(R.id.repetir_pass_input));

        Manejador manejador = Manejador.getInstance();
        manejador.borrar_reserva(dia, mes, año);
        Toast.makeText(this, "Reserva cancelada", Toast.LENGTH_SHORT).show();
    }
}
