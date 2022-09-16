
package beans;
//import java.sql.Date;

public class Razas {
    private int id_raza;
    private String nom_raza;
    //ejemplo de fecha private Date fechanose;

    public Razas(int id_raza, String nom_raza) {
        this.id_raza = id_raza;
        this.nom_raza = nom_raza;
    }

    public int getId_raza() {
        return id_raza;
    }

    public void setId_raza(int id_raza) {
        this.id_raza = id_raza;
    }

    public String getNom_raza() {
        return nom_raza;
    }

    public void setNom_raza(String nom_raza) {
        this.nom_raza = nom_raza;
    }

    @Override
    public String toString() {
        return "Razas{" + "id_raza=" + id_raza + ", nom_raza=" + nom_raza + '}';
    }
    
    
}
