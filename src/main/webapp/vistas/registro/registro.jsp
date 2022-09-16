

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="test.OperacionesDB"%>

<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/index.html" flush="true" />
        <link rel="stylesheet" href="../../css/estilos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="../../js/index.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    </head>
    <body>

        <div class="container py-3">
            <div class="card my-5">
                <div class="card-body">
                    <div class="row m-3">
                        <div class="col-md-6 bg-login-image"></div>
                        <div class="col-md-6">
                            <h1 class="h4 text-gray-900 my-3">Bienvenido a Find your pets</h1>

                            <form id="form-login">

                                <div class="form-group"> 
                                    <label for="primer_nombre">Primer Nombre</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="primer_nombre" 
                                        name="primer_nombre"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="segundo_nombre">Segundo Nombre</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="segundo_nombre" 
                                        name="segundo_nombre"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="primer_apellido">Primer Apellido</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="primer_apellido" 
                                        name="primer_apellido"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="segundo_apellido">Segundo Apellido</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="segundo_apellido" 
                                        name="segundo_apellido"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="telefono">Telefono</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="telefono" 
                                        name="telefono"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="direccion">Direccion</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="direccion" 
                                        name="direccion"/><br>
                                </div>


                                <div class="form-group">
                                    <label for="correo">Correo:</label><br>
                                    <input 
                                        class="form-control" 
                                        type="text" 
                                        id="correo" 
                                        name="correo"/><br><br>
                                </div>


                                <div class="form-group">
                                    <label for="genero">Genero</label>
                                    <select id="nom_genero" name="nom_genero">
                                        <%
                                            OperacionesDB operacion = new OperacionesDB();
                                            //select from generos metodo  listarGenero()                                   
                                        %>
                                    </select><br><br>
                                </div>


                                <input type="submit" id="Enviar"/>
                            </form>
                            <hr>
                        </div>
                    </div>
                    <a href="registro.jsp">¿Ya tienes una cuenta?Inicia sesion.</a>
                    <div id="login-error" class="alert alert-danger d-none" role="alert">Error al ingresar.</div>
                </div>
            </div>
        </div>
    </body>
</html>
