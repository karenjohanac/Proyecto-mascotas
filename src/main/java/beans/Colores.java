package beans;


public class Colores {
    private int id_color;
    private String nom_color;

    public Colores(int id_color, String nom_color) {
        this.id_color = id_color;
        this.nom_color = nom_color;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public String getNom_color() {
        return nom_color;
    }

    public void setNom_color(String nom_color) {
        this.nom_color = nom_color;
    }

    @Override
    public String toString() {
        return "Colores{" + "id_color=" + id_color + ", nom_color=" + nom_color + '}';
    }
    
    
}
