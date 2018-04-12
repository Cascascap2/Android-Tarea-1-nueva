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

    private List<Persona> Personas = new ArrayList<Persona>();

    public List<Persona> getPersonas(){
        return this.Personas;
    }

}
