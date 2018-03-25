package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


public class Empleado extends Persona{

    public Empleado() {
    }

    public Empleado(String login, String password, tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol,
                    String mail, String nombre, String apellido, String documento, String telefono,
                    String direccion, String ciudad){
        super(login, password, rol, mail, nombre, apellido, documento, telefono, direccion, ciudad);
    }


}
