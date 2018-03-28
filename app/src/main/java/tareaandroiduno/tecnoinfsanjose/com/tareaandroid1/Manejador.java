package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;
import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Manejador{

    List<Persona> Personas = new ArrayList<Persona>();
    List<Reserva> Reservas = new ArrayList<Reserva>();

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

    //Returna null si la persona no existe
    public Persona get_persona(String usuario){
        Iterator it = this.Personas.iterator();
        Persona p;
        while(it.hasNext()){
            p = (Persona) it.next();
            if(p.getLogin().equals(usuario)){
                return p;
            }
        }
        return null;
    }

    public boolean confirmar_login(String usuario, String pass){
        Persona p = this.get_persona(usuario);
        if (p!=null){
            if (pass.equals(p.getPassword()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    public void agregar_Reserva(Reserva r){
        this.Reservas.add(r);
    }

    //Returna null si la reserva no existe.
    public Cliente confirmar_Reserva(int day, int month, int year){
        Iterator it = this.Reservas.iterator();
        Cliente c = null;
        Reserva r = null;
        while(it.hasNext()){
            r = (Reserva) it.next();
            if(r.getDay()==day && r.getMonth()==month && r.getYear()==year){
                return r.getCliente();
            }
        }
        return null;
    }

    public void borrar_reserva(int day, int month, int year){
        Iterator it = this.Reservas.iterator();
        Reserva r;
        while(it.hasNext()){
            r = (Reserva) it.next();
            if(r.getDay()==day && r.getMonth()==month && r.getYear()==year){
                this.Reservas.remove(r);
            }
        }
    }

    public void agregar_persona(Persona persona){
        this.Personas.add(persona);
    }

    public void borrar_persona(Persona persona){
        this.Personas.remove(persona);
    }

    public List<Persona> getPersonas() {
        return this.Personas;
    }

    public void setPersonas(List<Persona> personas) {
        Personas = personas;
    }

    public List<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        Reservas = reservas;
    }

    public static void setInstance(Manejador instance) {
        Manejador.instance = instance;
    }

    public boolean isSession() {
        return session;
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
