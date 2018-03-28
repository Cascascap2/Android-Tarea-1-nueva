package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import java.util.Date;

public class Reserva {

    private int day;
    private int month;
    private int year;
    private Cliente cliente;

    public Reserva(){}

    public Reserva(int day, int month, int year, Cliente cliente) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.cliente = cliente;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
