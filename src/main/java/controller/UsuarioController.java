
package controller;
import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import beans.Usuarios;
import connection.DBConnection;

//se comunica con con el back

public class UsuarioController implements IUsuarioController {

    @Override
    public String Login(String usuario, String clave) {
        Gson gson = new Gson();//El gson sirve para sincronisar el back con el front
        DBConnection conn = new DBConnection();
        String sql = "SELECT * FROM usuarios WHERE usuario = '"+usuario+"' and clave = '"+clave+"'";
        /*String sql = "SELECT u.usuario,u.clave,P.primer_nombre,P.segundo_nombre,P.primer_apellido,P.segundo_apellido,\n"
                + "P.telefono,P.direccion,P.correo\n"
                + "FROM usuarios U\n"
                + "INNER JOIN personas P on P.id_persona = U.id_persona_fk \n"
                + "WHERE U.usuario = '" + usuario + "' and U.clave = '" + clave + "'";*/
        try {
            Statement stm = conn.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                String primer_nombre = rs.getString("primer_nombre");
                String segundo_nombre = rs.getString("segundo_nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String segundo_apellido = rs.getString("segundo_apellido");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");

                Usuarios usuarios = new Usuarios(usuario, clave);
                return gson.toJson(usuarios);
            }
            stm.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            conn.desconectar();
        }
        return "falso";
    }

    @Override
    public String Registro(String primer_nombre,String segundo_nombre,String primer_apellido,String segundo_apellido,
           String telefono, String direccion, String correo, String nom_genero) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
