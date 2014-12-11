<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!Seccion de librerias>
<%@page import="java.util.*" %>
<%@page import="DatosIngresa.*" %>
<%@page import="ctl.*" %>

<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Detalles de Pedidos</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Detalles de Pedidos</h1>
        <% ArrayList lista = session.getAttribute("consultaOrderdetails") == null?null:(ArrayList)session.getAttribute("consultaOrderdetails"); %>
        <input type="hidden" name="pagina" value="consultaOrderdetails">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>orderNumber</th>
          <th>productCode</th>
          <th>quantityOrdered</th>
          <th>priceEach</th>
          <th>orderLineNumber</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Orderdetails ordt = (Orderdetails)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizarorderdetails.jsp?orderNumber=<%=ordt.getOrderNumber()%>&productCode=<%=ordt.getProductCode()%>&quantityOrdered=<%=ordt.getQuantityOrdered()%>&priceEach=<%=ordt.getPriceEach()%>&orderLineNumber=<%=ordt.getOrderLineNumber()%>"><%= ordt.getOrderNumber()%></a></td>
          <td><%=ordt.getProductCode()%></td>
          <td><%=ordt.getQuantityOrdered() %></td>
          <td><%=ordt.getPriceEach() %></td>
          <td><%=ordt.getOrderLineNumber() %></td>
  
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
