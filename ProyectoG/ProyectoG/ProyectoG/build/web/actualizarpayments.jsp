<%-- 
    Document   : actualizarpayments
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
        <title>Actualiza Pagos.</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
        <form class="form-horizontal" role="form" action="ControladorG" method="post">
            <input type="hidden" name="pagina" value="actualizarPayments">
            
              <h1 class="page-header">
          <img src="img/soporte1.png" width="73" height="69">
             Actualizar <small>Por favor actualiza los datos</small>
  </h1>
            
             <div class="form-group">
                <label class="control-label col-xs-2" for="customerNumber">Numero de Cliente:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="customerNumber" placeholder="Ingrese Numero de Cliente" name="customerNumber" value="<%=request.getParameter("customerNumber")%>">
                    </div>
                <label class="control-label col-xs-2" for="checkNumber" >Numero de Comprobacion:</label>
                    <div class="col-xs-3">  
                        <input type="text" class="form-control" id="checkNumber" placeholder="Ingrese Numero de Comprobacion" name="checkNumber" value="<%=request.getParameter("checkNumber")%>">
                    </div>
            </div>
            
            
            <div class="form-group" >
                   <label class="control-label col-xs-2" for="paymentDate" >Fecha de Pago:</label>
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="paymentDate" placeholder="Ingrese Fecha de Pago" name="paymentDate" value="<%=request.getParameter("paymentDate")%>">
                        </div>
                <label class="control-label col-xs-2" for="amount" >Monto:</label>
                    <div class="col-xs-3">
                        <input type="text" class="form-control" id="amount" placeholder="Ingrese Monto" name="amount" value="<%=request.getParameter("amount")%>">
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
                    <a href="Controlador?paginaOrder=altaPayment" class="btn btn-default" role="button">Consulta</a>
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
