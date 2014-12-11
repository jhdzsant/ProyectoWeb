<%-- 
    Document   : borrarpayments
    Created on : 5/12/2014, 03:45:16 PM
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
        <title>Eliminar Pagos</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Eliminar Pagos</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="borrarPayments">
            <div class="form-group" >
                <label for="customerNumber" >ID del Pago</label>
                <input type="text" class="form-control" id="checkNumber" placeholder="Ingrese ID del Pago()" name="checkNumber" required>
            </div>
            <button type="submit" class="btn btn-primary">Eliminar</button>
            <a href="ControladorG?pagina=consultaPayments" class="btn btn-default" role="button">Consulta</a>
            <a href="altapayments.jsp" class="btn btn-default" role="button">Alta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
