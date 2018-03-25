package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


public class Cliente extends Persona{

    private String mail;
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private String direccion;
    private String ciudad;

    public Cliente(String mail, String nombre, String apellido, String documento, String telefono, String direccion, String ciudad) {
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Cliente(String login, String pass, tareaandroiduno.tecnoinfsanjose.com.tareaandroid1.rol rol, String mail, String nombre, String apellido, String documento, String telefono, String direccion, String ciudad) {
        super(login, pass, rol);
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
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
