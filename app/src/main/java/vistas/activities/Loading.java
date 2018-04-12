package vistas.activities;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class Loading extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.loading);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                String home_type = getIntent().getStringExtra("home_type");
                if(home_type.equals("cliente")){
                    Intent mainIntent = new Intent(Loading.this, Home_cliente.class);
                    Loading.this.startActivity(mainIntent);
                    Loading.this.finish();
                }
                else if(home_type.equals("empleado")){
                    Intent mainIntent = new Intent(Loading.this, Home_empleado.class);
                    Loading.this.startActivity(mainIntent);
                    Loading.this.finish();
                }

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
