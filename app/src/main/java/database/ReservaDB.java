package database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modelos.Cliente;
import modelos.Reserva;

public class ReservaDB {

    private static ReservaDB instance = null;

    public static ReservaDB getInstance() {
        if(instance == null) {
            instance = new ReservaDB();
        }
        return instance;
    }

    private List<Reserva> Reservas = new ArrayList<Reserva>();

    public void agregar_Reserva(Reserva r){

        this.Reservas.add(r);
    }

    public List<Reserva> getReservas(){
        return this.Reservas;
    }


}
