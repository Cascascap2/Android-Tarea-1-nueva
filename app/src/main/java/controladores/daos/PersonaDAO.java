package controladores.daos;


import java.util.List;

import database.PersonaDB;
import modelos.Persona;

public class PersonaDAO {

    public void crearPersona(Persona p){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.add(p);
    }

    public void modificarCliente(Persona p){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.remove(p);
        personas.add(p);
    }

    public void borrarCliente(Persona p){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.remove(p);
    }

    public List<Persona> listarCliente(){
        PersonaDB PDB = PersonaDB.getInstance();
        return PDB.getPersonas();

    }

    public void buscarCliente(int id){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.get(id);
    }

}
