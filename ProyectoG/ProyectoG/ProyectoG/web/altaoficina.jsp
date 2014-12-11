<%-- 
    Document   : altaoffice
    Created on : 23/11/2014, 10:28:47 PM
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
        <meta http-equiv="Co <title>Alta Office</title>ntent-Type" content="text/html; charset=UTF-8">
        <title>Alta Oficina</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
          
             
             
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaOffice">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
              Alta <small>Por favor llena el formulario de oficina</small>
  </h1>

            
            <div class="form-group">
                <label class="control-label col-xs-2" for="officeCode">Clave de oficina:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="officeCode" placeholder="Ingrese la Clave de la oficina" name="officeCode" required>
                    </div>
            </div>
             <div class="form-group" >
                <label class="control-label col-xs-2" for="city" >Ciudad:</label>
                    <div class="col-xs-3">                
                        <input type="text" class="form-control" id="city" placeholder="Ingrese Ciudad" name="city" required>
                    </div>
            </div>

            <div class="form-group" >
                <label class="control-label col-xs-2" for="phone" >Telefono:</label>
                    <div class="col-xs-3">                
                        <input type="text" class="form-control" id="phone" placeholder="Ingrese Telefono" name="phone" required>
                    </div>
            </div>
            
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="addressLine1" >Dirección principal:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="addressLine1" placeholder="Ingresa direccion" name="addressLine1" required>
                    </div>
                <label class="control-label col-xs-2" for="addressLine2" >Dirección secundaria:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="addressLine2" placeholder="Ingresa direccion 2 " name="addressLine2" required>
                    </div> 
            </div>
            
            
            <div class="form-group" >
                <label class="control-label col-xs-2" for="state" >Estado:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="state" placeholder="Ingrese Estado" name="state" required>
                    </div>
                <label class="control-label col-xs-2" for="country" >Pais:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="country" placeholder="Ingrese Estado" name="country" required>
                    </div>
            </div>
            
            
            <div class="form-group" >                
                <label  class="control-label col-xs-2" for="postalCode" >Codigo Postal:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="postalCode" placeholder="Ingresa Codigo Postal" name="postalCode" required>
                    </div> 
                <label class="control-label col-xs-2" for="territory" >Territorio:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="territory" placeholder="Ingresa pais" name="territory" required>
                    </div>
            </div>
            
      
            
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="ControladorG?pagina=consultaOffice" class="btn btn-default" role="button">Consulta</a>
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
