package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Registrar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar);
    }

    public void siguiente(View vie){
        Manejador manejador = Manejador.getInstance();
        TextView changable_text_user = findViewById(R.id.changable_text_user);
        TextView changable_text_pass = findViewById(R.id.changable_text_pass);
        TextView changable_text_final = findViewById(R.id.changable_text_final);

        EditText usuario = findViewById(R.id.user_input);
        String usuario_text = usuario.getText().toString();

        if(manejador.get_persona(usuario_text)!=null && !usuario_text.equals("")){
            changable_text_user.setText(R.string.usuario_existe);
        }
        else{
            changable_text_user.setText("");
            EditText contraseña = findViewById(R.id.pass_input);
            String contraseña_text = contraseña.getText().toString();

            EditText repetir_contraseña = findViewById(R.id.repetir_pass_input);
            String repetir_contraseña_text = repetir_contraseña.getText().toString();

            if(contraseña_text.equals(repetir_contraseña_text) && !contraseña_text.equals("")){
                changable_text_pass.setText("");
                EditText correo = findViewById(R.id.correo_input);
                String correo_text = correo.getText().toString();

                EditText nombre = findViewById(R.id.nombre_input);
                String nombre_text = nombre.getText().toString();

                EditText apellido = findViewById(R.id.apellido_input);
                String apellido_text = apellido.getText().toString();

                EditText documento = findViewById(R.id.documento_input);
                String documento_text = documento.getText().toString();

                EditText telefono = findViewById(R.id.telefono_input);
                String telefono_text = telefono.getText().toString();

                EditText direccion = findViewById(R.id.direccion_input);
                String direccion_text = direccion.getText().toString();

                EditText ciudad = findViewById(R.id.ciudad_input);
                String ciudad_text = ciudad.getText().toString();

                tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol;
                RadioGroup radio_group = findViewById(R.id.radio_persona);
                int radio_button_checked_id = radio_group.getCheckedRadioButtonId();

                if(!nombre_text.equals("") && !correo_text.equals("") && radio_button_checked_id != -1){

                    Persona persona;
                    if(radio_button_checked_id == R.id.radio_cliente){
                        rol = tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol.CLIENTE;
                        persona = new Cliente(usuario_text, contraseña_text, rol, correo_text, nombre_text,
                                apellido_text, documento_text, telefono_text, direccion_text,
                                ciudad_text, null);
                    }
                    else{
                        rol = tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol.EMPLEADO;
                        persona = new Empleado(usuario_text, contraseña_text, rol, correo_text, nombre_text,
                                apellido_text, documento_text, telefono_text, direccion_text,
                                ciudad_text);
                    }
                    String rol_text = rol.toString();
                    manejador.agregar_persona(persona);
                    Toast.makeText(this, rol_text + " creado con exito", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Registrar.this, login.class);
                    startActivity(i);
                    finish();
                }
                else
                    changable_text_final.setText(R.string.missing_info_register);
            }
            else{
                changable_text_pass.setText(R.string.pass_dont_match);
            }
        }
    }


}
