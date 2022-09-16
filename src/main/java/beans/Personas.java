package beans;

import java.util.List;

public class Personas {
   private int id_persona;
   private String primer_nombre;
   private String segundo_nombre;
   private String primer_apellido;
   private String segundo_apellido;
   private String telefono;
   private String direccion;
   private String correo;
   private String nom_genero;

    public Personas() {
    }

    public Personas(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String telefono, String direccion, String correo, String nom_genero) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.nom_genero = nom_genero;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNom_genero() {
        return nom_genero;
    }

    public void setNom_genero(String nom_genero) {
        this.nom_genero = nom_genero;
    }

    @Override
    public String toString() {
        return "Personas{ primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", nom_genero=" + nom_genero + '}';
    }

     
}
