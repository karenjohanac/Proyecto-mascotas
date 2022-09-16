package test;

import beans.Generos;
import beans.Personas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
        
public class OperacionesDB {
    public static void main(String[] args) {
        //listarGenero();
        listarPersonas();
    }
    
    // *** CRUD GENEROS ***
    public static void actualizarGenero(int id_genero,String nom_genero){
        DBConnection conn = new DBConnection();
        String sql = "UPDATE generos SET nom_genero = '" +nom_genero+ "'WHERE id_genero = "+id_genero;
        
        try {
            Statement stm = conn.getConnection().createStatement();
            stm.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            conn.desconectar();
        }
    }
    
    //prueba para hacer el select
    /*public List<Generos>consultarTodo(){
        DBConnection conn = new DBConnection();
        String sql = "SELECT * FROM generos";
        List<Generos> listarGeneros = new ArrayList<Generos>();
        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) { 
                Generos generos = new Generos();
                generos.setId_genero(rs.getInt("id_genero"));
                generos.setNom_genero(rs.getString("nom_genero"));
                //int id_genero = rs.getInt("id_genero");
                //String nom_genero = rs.getString("nom_genero");
                //Generos generos = new Generos(id_genero,nom_genero);
                listarGeneros.add(generos);
                
                //System.out.println(generos.toString());
            }
            stm.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            conn.desconectar();
        }
        return listarGeneros;
    }
    */
    
    public static void listarGenero(){
        DBConnection conn = new DBConnection();
        String sql = "SELECT * FROM generos";
        
        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                int id_genero = rs.getInt("id_genero");
                String nom_genero = rs.getString("nom_genero");
                Generos generos = new Generos(id_genero,nom_genero);
                System.out.println(generos.toString());
            }
            stm.executeQuery(sql);
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            conn.desconectar();
        }
    }
    
       
    
    
    
    // *** CRUD PERSONAS ***
    
    public static void insertarPersonas() {
        DBConnection conn = new DBConnection();
        String sql = "INSERT INTO `personas` ( `primer_nombre`, `segundo_nombre`, `primer_apellido`, \n"
                + "`segundo_apellido`, `telefono`, `direccion`, `correo`, `id_genero_fk`) \n"
                + "VALUES (primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,telefono,direccion, \n"
                + "correo,id_genero)";

        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                //int id_persona = rs.getInt("id_persona");
                
                String primer_nombre = rs.getString("primer_nombre");
                String segundo_nombre = rs.getString("segundo_nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String segundo_apellido = rs.getString("segundo_apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String nom_genero = rs.getString("nom_genero");
                Personas personas = new Personas(primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,telefono,direccion,correo,nom_genero);
                System.out.println(personas.toString());
            }
            stm.executeQuery(sql);
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            conn.desconectar();
        }
        
    }
    
    //prueba de otro listar personas 
    public ArrayList<Personas> leerPersonas(){
        ArrayList<Personas>personas = new ArrayList<Personas>();
        Personas personahallada;
        DBConnection conn = new DBConnection();
        conn.getConnection();
        
        String sql = "SELECT P.primer_nombre,P.segundo_nombre,P.primer_apellido,P.segundo_apellido,P.telefono,P.direccion,\n"
                + "P.correo,G.nom_genero\n"
                + "FROM personas P\n"
                + "INNER JOIN generos G ON id_persona = id_genero_fk";
                
        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                //int id_persona = rs.getInt("id_persona");
                String primer_nombre = rs.getString("primer_nombre");
                String segundo_nombre = rs.getString("segundo_nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String segundo_apellido = rs.getString("segundo_apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String nom_genero = rs.getString("nom_genero");
                Personas personas1 = new Personas(primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,telefono,direccion,correo,nom_genero);
                
                //se agrega al arraylist personas
                personas.add(personas1);
                
                System.out.println(personas.toString());
            }
            stm.executeQuery(sql);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            conn.desconectar();
        }
        return personas;
    }

    public static void listarPersonas(){
        DBConnection conn = new DBConnection();
        conn.getConnection();
        
        String sql = "SELECT P.primer_nombre,P.segundo_nombre,P.primer_apellido,P.segundo_apellido,P.telefono,P.direccion,\n"
                + "P.correo,G.nom_genero\n"
                + "FROM personas P\n"
                + "INNER JOIN generos G ON id_persona = id_genero_fk";
        
        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                //int id_persona = rs.getInt("id_persona");
                String primer_nombre = rs.getString("primer_nombre");
                String segundo_nombre = rs.getString("segundo_nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String segundo_apellido = rs.getString("segundo_apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String nom_genero = rs.getString("nom_genero");
                Personas personas = new Personas(primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,telefono,direccion,correo,nom_genero);
                System.out.println(personas.toString());
            }
            stm.executeQuery(sql);
                    
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally{
            conn.desconectar();
        }
    }
}
