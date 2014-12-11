<%-- 
    Document   : altapayments
    Created on : 5/12/2014, 03:43:41 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script> 
   
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de Pagos.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Alta  Pagos</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaPayments">
            
            <div class="form-group" >
                <label for="customerNumber" >ID del Cliente</label>
                <input type="text" class="form-control" id="customerNumber" placeholder="Ingrese el Id del Cliente" name="customerNumber" required>
            </div>
            <div class="form-group" >
                <label for="checkNumber" >Numero de Verificacion</label>
                <input type="text" class="form-control" id="checkNumber" placeholder="Ingrese numero de verificacion" name="checkNumber" required >
            </div>
            <div class="form-group" >
                <label for="paymentDate" >Fecha de Pago</label>
                <input type="text" class="form-control" id="paymentDate" placeholder="Ingrese Fecha de Pago" name="paymentDate" required>
            </div>
            <div class="form-group" >
                <label for="amount" >Monto</label>
                <input type="text" class="form-control" id="amount" placeholder="Ingrese el monto total" name="amount" required>
            </div>
             
            <button type="submit" class="btn btn-primary">Guardar</button>
            <a href="ControladorG?pagina=consultaPayments" class="btn btn-default" role="button">Consulta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>