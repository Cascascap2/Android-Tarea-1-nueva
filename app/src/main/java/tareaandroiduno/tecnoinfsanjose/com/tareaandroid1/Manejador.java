package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;
import android.content.Context;
import android.widget.Toast;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Manejador{

    HashMap<String, Persona> Personas = new HashMap<String, Persona>();
    HashMap<Date, Cliente> Reservas = new HashMap<Date, Cliente>();
    private static Manejador instance = null;

    protected Manejador() {}

    public static Manejador getInstance() {
        if(instance == null) {
            instance = new Manejador();
        }
        return instance;
    }

    public boolean existe_persona(String usuario){
        if(this.Personas.containsKey(usuario)){
            return true;
        }
        else
            return false;
    }

    public boolean confirmar_login(String usuario, String pass){
        if (this.Personas.containsKey(usuario)){
            Persona p = this.Personas.get(usuario);
            String p_pass = p.getPassword();
            if (pass.equals(p_pass))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public void agregar_persona(Persona persona){
        this.Personas.put(persona.getLogin(), persona);
    }

    public void borrar_persona(Persona persona){
        this.Personas.remove(persona.getLogin());
    }

    public HashMap<String, Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(HashMap<String, Persona> personas) {
        Personas = personas;
    }

    public HashMap<Date, Cliente> getReservas() {
        return Reservas;
    }

    public void setReservas(HashMap<Date, Cliente> reservas) {
        Reservas = reservas;
    }

    public static void setInstance(Manejador instance) {
        Manejador.instance = instance;
    }
}
