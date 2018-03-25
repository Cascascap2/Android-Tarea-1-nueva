package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import java.util.Date;

public class Reserva {

    private Date fecha;
    private Cliente cliente;

    public Reserva(){}

    public Reserva(Date fecha, Cliente cliente){

        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
