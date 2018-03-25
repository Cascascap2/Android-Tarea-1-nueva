package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

enum rol{CLIENTE, EMPLEADO};

public class Persona {
    private String login;
    private String password;
    private rol rol;

    public Persona(){}

    public Persona(String login, String pass, rol rol){
        this.login = login;
        this.password = pass;
        this.rol = rol;
    }

    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }

    public rol getRol(){
        return this.rol;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol) {
        this.rol = rol;
    }

    /*
    public void setRol(tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol) {
        this.rol = rol;
    }
    */
}
