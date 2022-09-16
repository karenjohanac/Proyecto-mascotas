package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    Connection connection;
    static String bd = "mascotas";
    static String port = "3306";
    static String login = "root";
    static String password = "123456";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url,this.login,this.password);//metodo DriverManager para conexion
            System.out.println("Conexión establecida...");
        } catch (Exception ex) {
            System.out.println("Error en conexion. "+ex.getMessage());
        }
    }

    
    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }
    
}
