
package beans;

import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Generos {
    private int id_genero;
    private String nom_genero;

    public Generos() {
    }

    
    public Generos(int id_genero, String nom_genero) {
        this.id_genero = id_genero;
        this.nom_genero = nom_genero;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getNom_genero() {
        return nom_genero;
    }

    public void setNom_genero(String nom_genero) {
        this.nom_genero = nom_genero;
    }

    @Override
    public String toString() {
        return "Generos{" + "id_genero=" + id_genero + ", nom_genero=" + nom_genero + '}';
    }
        
}
