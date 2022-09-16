package controller;


//se comunica con el usuario

public interface IUsuarioController {
   public String Login(String ususario,String clave);
   
   public String Registro(String primer_nombre,String segundo_nombre,String primer_apellido,String segundo_apellido,
           String telefono, String direccion, String correo, String nom_genero);
   
}
