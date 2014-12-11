<%-- 
    Document   : borrarorderdetails
    Created on : 5/12/2014, 03:40:44 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script> 
   
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar orden de Detalles.</title>
        <jsp:include page="componentes/header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Eliminar Empleado</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="borrarOrdersDetails">
            <div class="form-group" >
                <label for="orderNumber" >ID de la Orden Detallada</label>
                <input type="text" class="form-control" id="orderNumber" placeholder="Ingrese ID de la orden detallada" name="orderNumber" required>
            </div>
            <button type="submit" class="btn btn-primary">Eliminar</button>
            <a href="ControladorG?pagina=consultaOrderdetails" class="btn btn-default" role="button">Consulta</a>
            <a href="altaordersdetails.jsp" class="btn btn-default" role="button">Alta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>