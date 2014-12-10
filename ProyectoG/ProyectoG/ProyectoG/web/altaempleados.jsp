<%-- 
    Document   : altaemployess
    Created on : 4/12/2014, 08:49:27 PM
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
        <meta http-equiv="Co <title>Alta del Cliente.</title>ntent-Type" content="text/html; charset=UTF-8">
        <title>Alta Empleados</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
          
             
             
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="altaEmployess">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
              Alta <small>Llenar datos del Empleado</small>
  </h1>

            
            <div class="form-group">
                <label class="control-label col-xs-2" for="EmployeeNumber">ID de empleado:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="EmployeeNumber" placeholder="Ingrese ID del Empleado" name="EmployeeNumber" required>
                    </div>
            </div>
            
           
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="FirstName" >Nombre:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="FirstName" placeholder="Ingrese el nombre:" name="FirstName" required>
                        </div>
                <label class="control-label col-xs-2" for="LastName" >Apellido:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="LastName" placeholder="Ingrese el Apellido:" name="LastName" required>
                    </div>
            </div>
                
            
            
            <div class="form-group" >
                <label class="control-label col-xs-2" for="Extension" >Extensión:</label>
                    <div class="col-xs-3">                
                        <input type="text" class="form-control" id="Extension" placeholder="Ingrese la extensión" name="Extension" required>
                    </div>
            </div>
            
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="Email" >Email:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="Email" placeholder="Ingresa Email" name="Email" required>
                    </div>
                <label class="control-label col-xs-2" for="ReportsTo" >Reportar a:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="ReportsTo" placeholder="Enviar informes a" name="ReportsTo" required>
                    </div> 
            </div>
            
            
            <div class="form-group" >
                <label class="control-label col-xs-2" for="JobTitle" >Puesto:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="JobTitle" placeholder="Ingresa tu puesto" name="JobTitle" required>
                    </div>
                 <label class="control-label col-xs-2" for="OfficeCode" >Clave de oficina:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="OfficeCode" placeholder="Ingresa la clave de la oficina" name="OfficeCode" required>
                    </div> 
              
            </div>
 
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="Controlador?paginaEmployess=altaEmployess" class="btn btn-default" role="button">Consulta</a>
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
