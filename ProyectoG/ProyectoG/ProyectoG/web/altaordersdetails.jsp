<%-- 
    Document   : altaorderdetails
    Created on : 5/12/2014, 03:37:02 PM
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
        <title>Alta de Ordenes de Detalle.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Alta  Ordenes de DEtalle</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaOrdersDetails">
            <div class="form-group">
                <div>
                    <label for="orderNumber" >ID de Orden</label>
                    <input type="text" class="form-control" id="orderNumber" placeholder="Ingrese el Id de Orden" name="orderNumber" required>
                </div>
                <div >
                    <label for="productCode" >ID de producto</label>
                    <input type="text" class="form-control" id="productCode" placeholder="ID de Producto" name="productCode" required >
                </div> 
            </div>
          
                <div class="form-group">
            </div>
            <div class="form-group" >
                <label for="quantityOrdered" >Cantidad a ordenar</label>
                <input type="text" class="form-control" id="quantityOrdered" placeholder="Ingrese cantidad de pzs" name="quantityOrdered" required>
            </div>
            <div class="form-group" >
                <label for="priceEach" >Costo por pieza</label>
                <input type="text" class="form-control" id="priceEach" placeholder="Ingrese costo individual" name="priceEach" required>
            </div>
           
            <div class="form-group" >
                <label for="orderLineNumber" >ID Linea de Orden</label>
                <input type="text" class="form-control" id="orderLineNumber" placeholder="Ingrese el ID de linea de orden" name="orderLineNumber" required>
            </div>
   </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
            <a href="customerServlet?pagina=consultaCustomer" class="btn btn-default" role="button">Consulta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>

