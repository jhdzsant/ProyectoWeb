
<%-- 
    Document   : altaorderdetails
    Created on : 27/11/2014, 09:06:36 PM
    Author     : Julian Salinas 
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
        <title>Alta Detalles de la Orden.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaOrderdetails">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
             Alta <small>Por favor llena los datos</small>
  </h1>
            
             <div class="form-group">
                <label class="control-label col-xs-2" for="orderNumber">Numero Orden:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="orderNumber" placeholder="Ingrese Numero Orden" name="orderNumber">
                    </div>
                <label class="control-label col-xs-2" for="productCode" >Codigo del Producto:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="productCode" placeholder="Ingrese Fecha Orden" name="productCode" >
                    </div>
            </div>
            
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="quantityOrdered" >Cantidad Ordenada:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="quantityOrdered" placeholder="Cantidad Ordenada" name="quantityOrdered" value="<%=request.getParameter("quantityOrdered")%>">
                        </div>
                <label class="control-label col-xs-2" for="priceEach" >Precio por Pieza:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="priceEach" placeholder="Ingrese Precio por Pieza" name="priceEach">
                    </div>
            </div>
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="orderLineNumber" >Numero de Linea de Orden:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="orderLineNumber" placeholder="Numero de Linea de Orden" name="orderLineNumber">
                    </div>
            </div>
                        
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="Controlador?paginaOrderdetails=consultaOrderdetails" class="btn btn-default" role="button">Consulta</a>
                </div>
            </div>
        </form>
            

        </div>
    </body>
    <br>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
