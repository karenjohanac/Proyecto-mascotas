package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UsuarioController;

@WebServlet(name = "ServletUsuarioLogin", urlPatterns = {"/ServletUsuarioLogin"})
public class ServletUsuarioLogin extends HttpServlet {

    private static final Long serialVersionUID = 1L;
    
    public ServletUsuarioLogin(){
        super();
    }


    //obtiene los parametros de usuario y contraseña
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioController usuarioc = new UsuarioController();
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        String result = usuarioc.Login(usuario, clave);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    // el doPost, obtiene el requerimiento y virifica que coincian los datos con la base de datos
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
