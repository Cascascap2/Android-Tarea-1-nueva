package vistas.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import controladores.Manejador;
import controladores.PersonControlador;
import modelos.Cliente;
import modelos.Empleado;
import modelos.Persona;
import modelos.rol;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void log_in(View view){
        Manejador manejador = Manejador.getInstance();

        TextView user_view = findViewById(R.id.user_input);
        TextView pass_view = findViewById(R.id.pass_input);

        String usuario =  user_view.getText().toString();
        String pass = pass_view.getText().toString();
        Resources res = getResources();
        String error_text = res.getString(R.string.error_login);
        TextView changable_text = findViewById(R.id.login_msg);

        if(manejador.confirmar_login(usuario, pass)){
            PersonControlador PC = new PersonControlador();
            Persona p = PC.get_persona(usuario);
            Intent i;
            if(p.getRol() == rol.CLIENTE){
                manejador.setSession(true);
                Cliente c = (Cliente) p;
                manejador.setLogged_persona(c);
                //i = new Intent(login.this, Home_cliente.class);
                i = new Intent(login.this, Loading.class);
                i.putExtra("home_type", "cliente");
                startActivity(i);
            }
            else{
                manejador.setSession(true);
                Empleado e = (Empleado) p;
                manejador.setLogged_persona(e);
                i = new Intent(login.this, Loading.class);
                i.putExtra("home_type", "empleado");
                //i = new Intent(login.this, Home_empleado.class);
                startActivity(i);
            }
        }
        else{
            changable_text.setText(error_text);
        }
    }

    public void go_to_register(View view){
        Intent i = new Intent(login.this, Registrar.class);
        startActivity(i);
    }

    public void list_users(View view){
        Intent i = new Intent(login.this, User_list.class);
        startActivity(i);
    }

}
