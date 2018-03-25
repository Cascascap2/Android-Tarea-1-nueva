package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void log_in(View view){
        TextView user_view = findViewById(R.id.user_input);
        TextView pass_view = findViewById(R.id.pass_input);

        Manejador manejador = new Manejador();
        String usuario =  user_view.getText().toString();
        String pass = pass_view.getText().toString();
        Resources res = getResources();
        String error_text = res.getString(R.string.error_login);
        TextView changable_text = findViewById(R.id.login_msg);

        if(manejador.confirmar_login(usuario, pass)){
            changable_text.setText("Ok, pa adentro");
        }
        else{
            changable_text.setText(error_text);
        }
    }

    public void go_to_register(View view){
        Intent i = new Intent(login.this, Registrar.class);
        startActivity(i);
    }

}
