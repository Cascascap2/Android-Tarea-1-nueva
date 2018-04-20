package vistas.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import controladores.PersonControlador;
import modelos.Persona;
import tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.R;

public class User_list extends AppCompatActivity {

    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_list);

        mListView = (ListView) findViewById(R.id.person_list_view);

        PersonControlador PC = new PersonControlador();
        final ArrayList<Persona> recipeList = PC.listarCliente();

        String[] listItems = new String[recipeList.size()];

        for(int i = 0; i < recipeList.size(); i++){
            Persona recipe = recipeList.get(i);
            listItems[i] = recipe.getNombre() + " " + recipe.getApellido();
            //listItems[i] = recipe.getApellido();
           }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);
    }
}
