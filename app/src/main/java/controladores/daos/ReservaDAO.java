package controladores.daos;


import java.util.List;

import database.ReservaDB;
import modelos.Reserva;

public class ReservaDAO {

    public void agregar_Reserva(Reserva r){
        ReservaDB RDB = new ReservaDB();
        List<Reserva> reservas = RDB.getReservas();
        reservas.add(r);
    }

    public List<Reserva> getReservas(){
        ReservaDB RDB = new ReservaDB();
        return RDB.getReservas();
    }
}
