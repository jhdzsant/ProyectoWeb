
<%-- 
    Document   : borrarproducts
    Created on : 5/12/2014, 04:04:21 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="DatosIngresa.*" %>
<%@page import="ctl.*" %>
<!DOCTYPE html>
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script> 
   
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Producto.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Eliminar Producto</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="borrarProducts">
            <div class="form-group" >
                <label for="productCode" >Codigo del Producto</label>
                <input type="text" class="form-control" id="productCode" placeholder="Ingrese ID del Cliente" name="productCode" required>
            </div>
            <button type="submit" class="btn btn-primary">Eliminar</button>
            <a href="ControladorG?pagina=consultaProducts" class="btn btn-default" role="button">Consulta</a>
            <a href="altaproducts.jsp" class="btn btn-default" role="button">Alta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
