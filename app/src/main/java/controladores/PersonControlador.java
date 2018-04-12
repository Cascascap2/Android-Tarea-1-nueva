package controladores;


import java.util.Iterator;
import java.util.List;

import controladores.daos.PersonaDAO;
import database.PersonaDB;
import modelos.Cliente;
import modelos.Empleado;
import modelos.Persona;
import modelos.Reserva;
import modelos.rol;

public class PersonControlador {

    //Returna null si la persona no existe
    public Persona get_persona(String usuario){
        PersonaDB PDB = PersonaDB.getInstance();
        List<Persona> personas = PDB.getPersonas();
        Iterator it = personas.iterator();
        Persona p;
        while(it.hasNext()){
            p = (Persona) it.next();
            if(p.getLogin().equals(usuario)){
                return p;
            }
        }
        return null;
    }

    public void crearCliente(String login, String password, rol rol,
                             String mail, String nombre, String apellido, String documento, String telefono,
                             String direccion, String ciudad, Reserva reserva){

        //Control de campos

        Cliente cliente = new Cliente(login, password, rol, mail, nombre, apellido, documento, telefono, direccion, ciudad, reserva);
        PersonaDAO PDAO = new PersonaDAO();
        PDAO.crearPersona(cliente);
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

    public void crearEmpleado(String login, String password, rol rol,
                              String mail, String nombre, String apellido, String documento, String telefono,
                              String direccion, String ciudad){

        Empleado empleado = new Empleado(login, password, rol, mail, nombre, apellido, documento, telefono, direccion, ciudad);
        PersonaDAO PDAO = new PersonaDAO();
        PDAO.crearPersona(empleado);
    }

    public void modificarEmpleado(Persona p){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.remove(p);
        personas.add(p);
    }

    public void borrarEmplado(Persona p){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.remove(p);
    }

    public List<Persona> listarEmpleado(){
        PersonaDB PDB = PersonaDB.getInstance();
        return PDB.getPersonas();

    }

    public void buscarEmpleado(int id){
        PersonaDB PDB = PersonaDB.getInstance();
        List <Persona> personas = PDB.getPersonas();
        personas.get(id);
    }
}
