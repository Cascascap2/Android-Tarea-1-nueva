package controladores;

import modelos.Persona;

public class Manejador{

    private static Manejador instance = null;
    private boolean session = false;
    private Persona logged_persona = null;

    protected Manejador() {}

    public static Manejador getInstance() {
        if(instance == null) {
            instance = new Manejador();
        }
        return instance;
    }

    public boolean confirmar_login(String usuario, String pass){
        PersonControlador PC = new PersonControlador();
        Persona p = PC.get_persona(usuario);
        if (p!=null){
            if (pass.equals(p.getPassword()))
                return true;
            else
                return false;
        }
        else
            return false;
    }


    public void setSession(boolean session) {
        this.session = session;
    }

    public Persona getLogged_persona() {
        return logged_persona;
    }

    public void setLogged_persona(Persona logged_persona) {
        this.logged_persona = logged_persona;
    }
}
