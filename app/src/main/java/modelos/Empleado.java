package modelos;


import modelos.Persona;
import modelos.rol;

public class Empleado extends Persona {

    public Empleado() {
    }

    public Empleado(String login, String password, rol rol,
                    String mail, String nombre, String apellido, String documento, String telefono,
                    String direccion, String ciudad){
        super(login, password, rol, mail, nombre, apellido, documento, telefono, direccion, ciudad);
    }


}
