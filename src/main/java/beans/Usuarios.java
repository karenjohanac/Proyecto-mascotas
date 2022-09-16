package beans;


public class Usuarios {
    private int id_usuario;
    private String usuario;
    private String clave;

    
    public Usuarios(int id_usuario, String usuario, String clave) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Usuarios(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id_usuario=" + id_usuario + ", usuario=" + usuario + ", clave=" + clave + '}';
    }
    
}
