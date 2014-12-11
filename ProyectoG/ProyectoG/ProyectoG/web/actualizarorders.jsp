<%-- 
    Document   : actualizarcustomer
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
        <title>Actualiza Order.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
 
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="actualizarOrders">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
             Actualizar <small>Por favor actualiza los datos</small>
  </h1>
            
             <div class="form-group">
                <label class="control-label col-xs-2" for="orderNumber">Numero Orden:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="orderNumber" placeholder="Ingrese Numero Orden" name="orderNumber" value="<%=request.getParameter("orderNumber")%>">
                    </div>
                <label class="control-label col-xs-2" for="orderDate" >Fecha Orden:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="orderDate" placeholder="Ingrese Fecha Orden" name="orderDate" value="<%=request.getParameter("orderDate")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="requiredDate" >Fecha Requerida:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="requiredDate" placeholder="Ingrese Fecha Requerida" name="requiredDate" value="<%=request.getParameter("requiredDate")%>">
                        </div>
                <label class="control-label col-xs-2" for="shippedDate" >Fecha Envio:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="shippedDate" placeholder="Ingrese Fecha Envio" name="shippedDate" value="<%=request.getParameter("shippedDate")%>">
                    </div>
            </div>
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="status" >Estatus:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="status" placeholder="Ingrese status" name="status" value="<%=request.getParameter("status")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >
                <label class="control-label col-xs-2" for="comments" >Comentarios:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="comments" placeholder="Ingrese Pais" name="comments" value="<%=request.getParameter("comments")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >                
                <label  class="control-label col-xs-2" for="customerNumber" >Numero Cliente:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="customerNumber" placeholder="Ingresa Codigo Postal" name="customerNumber" value="<%=request.getParameter("customerNumber")%>">
                    </div> 
            </div>
            
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="ControladorG?pagina=consultaOrders" class="btn btn-default" role="button">Consulta</a>
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
