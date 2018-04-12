package modelos;

;

public class Persona {
    private String login;
    private String password;
    private rol rol;
    private String mail;
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private String direccion;
    private String ciudad;

    public Persona(){}

    public Persona(String login, String password, modelos.rol rol,
                   String mail, String nombre, String apellido, String documento, String telefono,
                   String direccion, String ciudad){

        this.login = login;
        this.password = password;
        this.rol = rol;
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public modelos.rol getRol() {
        return rol;
    }

    public void setRol(modelos.rol rol) {
        this.rol = rol;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
