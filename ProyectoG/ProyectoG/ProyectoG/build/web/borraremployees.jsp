<%-- 
    Document   : borraremployess
    Created on : 5/12/2014, 02:26:15 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script> 
   
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Empleado.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Eliminar Empleado</h1>
        <form role="form" action="customerServlet" method="post">
            <input type="hidden" name="pagina" value="borrarEmployees">
            <div class="form-group" >
                <label for="customerNumber" >ID del Empleado</label>
                <input type="text" class="form-control" id="customerNumber" placeholder="Ingrese ID del Empleado" name="employeeNumber" required>
            </div>
            <button type="submit" class="btn btn-primary">Eliminar</button>
            <a href="ControladorG?pagina=consultaCustomer" class="btn btn-default" role="button">Consulta</a>
            <a href="altaempleados.jsp" class="btn btn-default" role="button">Alta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>