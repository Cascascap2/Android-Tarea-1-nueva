package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


public class Cliente extends Persona{

    Reserva reserva;

    public Cliente(){}

    public Cliente(String login, String password, tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol,
                   String mail, String nombre, String apellido, String documento, String telefono,
                   String direccion, String ciudad, Reserva reserva) {
        super(login, password, rol, mail, nombre, apellido, documento, telefono, direccion, ciudad);
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
