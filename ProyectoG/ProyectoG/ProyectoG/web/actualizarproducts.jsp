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
        <title>Actualiza Oficina.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
 
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="actualizarProducts">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
             Actualizar <small>Por favor actualiza los datos</small>
  </h1>
            
             <div class="form-group">
                <label class="control-label col-xs-2" for="productCode">Codigo de Producto:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="productCode" placeholder="Ingrese Codigo de Producto" name="productCode" value="<%=request.getParameter("productCode")%>">
                    </div>
                <label class="control-label col-xs-2" for="productLine" >Linea de Producto:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="productLine" placeholder="Ingrese Linea de Producto" name="productLine" value="<%=request.getParameter("productLine")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="productScale" >Escala de Producto:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="productScale" placeholder="Ingrese Escala de Producto" name="productScale" value="<%=request.getParameter("productScale")%>">
                        </div>
                <label class="control-label col-xs-2" for="productVendor" >Vendedor de Producto:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="productVendor" placeholder="Ingrese Vendedor de Producto" name="productVendor" value="<%=request.getParameter("productVendor")%>">
                    </div>
            </div>
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="productDescription" >Descripcion:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="productDescription" placeholder="Ingrese Descripcion" name="productDescription" value="<%=request.getParameter("productDescription")%>">
                    </div>
            </div>
          <th>MSRP</th>
            
            <div class="form-group" >
                <label class="control-label col-xs-2" for="quantityInStock" >Cantidad en Stock:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="quantityInStock" placeholder="Ingrese Cantidad en Stock" name="quantityInStock" value="<%=request.getParameter("quantityInStock")%>">
                    </div>
                <label class="control-label col-xs-2" for="buyPrice" >Precio Compra:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="buyPrice" placeholder="Ingrese Precio Compra" name="buyPrice" value="<%=request.getParameter("buyPrice")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >                
                <label  class="control-label col-xs-2" for="MSRP" >MSRP:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="MSRP" placeholder="Ingresa MSRP" name="MSRP" value="<%=request.getParameter("MSRP")%>">
                    </div> 
            </div>
            
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="Controlador?paginaOrder=altaProduct" class="btn btn-default" role="button">Consulta</a>
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
