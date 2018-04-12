package controladores;


import java.util.Iterator;
import java.util.List;

import controladores.daos.ReservaDAO;
import database.ReservaDB;
import modelos.Cliente;
import modelos.Reserva;

public class ReservaControlador {

    //Returna null si la reserva no existe.
    public Cliente confirmar_Reserva(int day, int month, int year){
        ReservaDB RDB = new ReservaDB();
        Iterator it = RDB.getReservas().iterator();
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
        ReservaDB RDB = new ReservaDB();
        List<Reserva> reservas =  RDB.getReservas();
        Iterator it = reservas.iterator();
        Reserva r;
        while(it.hasNext()){
            r = (Reserva) it.next();
            if(r.getDay()==day && r.getMonth()==month && r.getYear()==year){
                reservas.remove(r);
                return;
            }
        }
    }

    public void crear_reserva(int dia, int mes, int año, Cliente cliente){
        ReservaDAO RDAO = new ReservaDAO();
        //checkeo de campos
        Reserva reserva = new Reserva(dia, mes, año, cliente);
        RDAO.agregar_Reserva(reserva);

    }

}
