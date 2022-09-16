
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page="/index.html" flush="true" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Perfil de la persona</h1>
        <%
            //scriplet
            //captura los parametros enviados en el registro en el objeto request
            String primer_nombre = request.getParameter("primer_nombre");
            String segundo_nombre = request.getParameter("segundo_nombre");
            String primer_apellido = request.getParameter("primer_apellido");
            String segundo_apellido = request.getParameter("segundo_apellido");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            String correo = request.getParameter("correo");
        %>
        
        <h1>Perfil</h1>
        <table cellspacing="3" cellpadding="3" border="1" >
            <tr>
                <td align="right"> Primer Nombre: </td>
                <td> <%= primer_nombre%> </td> 
            </tr> 
            <tr>
                <td align="right"> Segundo Nombre: </td> 
                <td> <%= segundo_nombre%> </td> 
            </tr>
            <tr>
                <td align="right"> Primer Apellido: </td> 
                <td> <%= primer_apellido%> </td> 
            </tr>
            
            <tr>
                <td align="right"> Segundo Apellido: </td> 
                <td> <%= segundo_apellido%> </td> 
            </tr>
            
            <tr>
                <td align="right"> Telefono: </td> 
                <td> <%= telefono%> </td> 
            </tr>
            
            <tr>
                <td align="right"> Direccion </td> 
                <td> <%= direccion%> </td> 
            </tr>
            
            <tr>
                <td align="right"> Correo </td> 
                <td> <%= correo%> </td> 
            </tr>
            
        </table>
        
    </body>
</html>
