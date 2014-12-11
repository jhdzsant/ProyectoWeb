<%-- 
    Document   : actualizarproductlines
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
            <input type="hidden" name="pagina" value="actualizarProductLines">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
             Actualizar <small>Por favor actualiza los datos</small>
  </h1>
            
             <div class="form-group">
                
                <label class="control-label col-xs-2" for="textDescription" >Linea de Producto:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="textDescription" placeholder="Ingrese Linea de Producto" name="textDescription" value="<%=request.getParameter("textDescription")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="textDescription" >Descripcion:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="textDescription" placeholder="Ingrese Descripcion" name="textDescription" value="<%=request.getParameter("textDescription")%>">
                        </div>
                <label class="control-label col-xs-2" for="htmlDescription" >Html:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="htmlDescription" placeholder="Ingrese Html" name="htmlDescription" value="<%=request.getParameter("htmlDescription")%>">
                    </div>
            </div>
            
             <div class="form-group" >
                <label class="control-label col-xs-2"for="image" >Imagen:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="image" placeholder="Ingrese Imagen" name="image" value="<%=request.getParameter("image")%>">
                    </div>
            </div>
         
             <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-3">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                    <a href="Controlador?paginaOrder=altaProductLine" class="btn btn-default" role="button">Consulta</a>
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
