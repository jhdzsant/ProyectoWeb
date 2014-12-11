<%-- 
    Document   : altaproducts
    Created on : 5/12/2014, 03:50:43 PM
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
        <title>Alta de Productos</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
             <h1>Alta de Productos</h1>
        <form role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaProducts">
            <div class="form-group" >
                <label for="productCode" >ID del Producto</label>
                <input type="text" class="form-control" id="productCode" placeholder="Ingrese ID del Producto" name="productCode" required>
            </div>
            <div class="form-group" >
                <label for="productName" >Nombre del Cliente</label>
                <input type="text" class="form-control" id="productName" placeholder="Nombre del Producto" name="productName" required >
            </div>
            <div class="form-group" >
                <label for="productLine" >Nombre del Producto de Linea</label>
                <input type="text" class="form-control" id="productLine" placeholder="Inrese el nombre del producto de Linea" name="productLine" required>
            </div>
            <div class="form-group" >
                <label for="productScale" >Scala del producto</label>
                <input type="text" class="form-control" id="productScale" placeholder="Ejemplo 1:10" name="productScale" required>
            </div>
            <div class="form-group" >
                <label for="productVendor" >Provedor del Producto</label>
                <input type="text" class="form-control" id="productVendor" placeholder="Ingrese Provedor" name="productVendor" required>
            </div>
             <div class="form-group" >
                <label for="addressLine1" >Descripcion</label>
                <input type="text" class="form-control" id="addressLine1" placeholder="Ingresa descripcion del Producto" name="productDescription" required>
            </div>
            <div class="form-group" >
                <label for="quantityInStock" >Cantidad en Stock</label>
                <input type="text" class="form-control" id="quantityInStock" placeholder="Cantidad en Stock " name="quantityInStock">
            </div> 
            <div class="form-group" >
                <label for="buyPrice" >Precio de Compra</label>
                <input type="text" class="form-control" id="buyPrice" placeholder="Ingrese precio de compra" name="buyPrice" required>
            </div>
            <div class="form-group" >
                <label for="MSRP" >MSRP</label>
                <input type="text" class="form-control" id="MSRP" placeholder="Ingrese MSRP" name="MSRP" required>
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
            <a href="ControladorG?pagina=consultaProducts" class="btn btn-default" role="button">Consulta</a>
            
        </form>
        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
