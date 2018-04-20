package database;


import java.util.ArrayList;
import java.util.List;

import modelos.Persona;

public class PersonaDB {

    private static PersonaDB instance = null;

    public static PersonaDB getInstance() {
        if(instance == null) {
            instance = new PersonaDB();
        }
        return instance;
    }

    private ArrayList<Persona> Personas = new ArrayList<Persona>();

    public ArrayList<Persona> getPersonas(){
        return this.Personas;
    }

}
