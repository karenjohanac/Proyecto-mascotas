$(document).ready(function () {

    $("#form-login").submit(function (event) {  //Esta llamando al form login de la clase login.jsp

        event.preventDefault();
        autenticarUsuario();
    });

});

function autenticarUsuario() {

    let usuario = $("#usuario").val();
    let clave = $("#clave").val();

    //requerimiento de ajax : hace la peticion al servlet
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioLogin",
        data: $.param({
            usuario: usuario,
            clave: clave
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                //ejecuta el id login error del login
                console.log("no hace nada :()");
                $("#login-error").addClass("d-none");
                let usuario = parsedResult['usuario'];
                document.location.href = "home.html?usuario=" + usuario;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}

