package exceptions;


public class UsuarioException extends Exception {
    private String text;

    public UsuarioException(String texto){
        super();
        this.text = texto;
    }

    public String getText(){
        return text;
    }
}
