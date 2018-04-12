package modelos;


public class Sesion {

    private static Sesion instance = null;
    private Persona persona;
    private boolean logueada;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isLogueada() {
        return logueada;
    }

    public void setLogueada(boolean logueada) {
        this.logueada = logueada;
    }

    protected Sesion() {}

    public static Sesion getInstance() {
        if(instance == null) {
            instance = new Sesion();
        }
        return instance;
    }
}