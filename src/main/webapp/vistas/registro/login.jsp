<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <head>
        <jsp:include page="/index.html" flush="true" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../../css/estilos.css"/>
        <script src="../../js/index.js"></script><!<!-- intermediario entre el front y el controller  -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                                    <input 
                                        type="text" 
                                        class="form-control" 
                                        id="usuario" 
                                        placeholder="Usuario" 
                                        required>
                                </div>
                                <br>
                                <div class="form-group">
                                    <input 
                                        type="password" 
                                        class="form-control" 
                                        id="clave" 
                                        placeholder="Contraseña" 
                                        required>
                                </div>
                                <br>
                                <button 
                                    type="submit" 
                                    class="btn btn-primary btn-block" 
                                    id="btn_entrar">Entrar
                                </button>
                            </form>
                            <hr>
                        </div>
                    </div>
                    <a href="registro.jsp">¿Aún no tienes cuenta? Registrarme</a>
                    <div id="login-error" class="alert alert-danger d-none" role="alert">Usuario o contraseña incorrectos</div>
                </div>
            </div>
        </div>
    </body>
</html>