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
        <title>Consulta de Pedidos</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Pedidos</h1>
        <% ArrayList lista = session.getAttribute("consultaOrders") == null?null:(ArrayList)session.getAttribute("consultaOrders"); %>
        <input type="hidden" name="pagina" value="consultaOrders">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>orderNumber</th>
          <th>orderDate</th>
          <th>requiredDate</th>
          <th>shippedDate</th>
          <th>status</th>
          <th>comments</th>
          <th>customerNumber</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Orders ord = (Orders)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizarorders.jsp?orderNumber=<%=ord.getOrderNumber()%>&orderDate=<%=ord.getOrderDate()%>&requiredDate=<%=ord.getRequiredDate()%>&shippedDate=<%=ord.getShippedDate()%>&status=<%=ord.getStatus()%>&comments=<%=ord.getComments()%>&customerNumber=<%=ord.getCustomerNumber()%>"><%= ord.getOrderNumber()%></a></td>
          <td><%=ord.getOrderDate()%></td>
          <td><%=ord.getRequiredDate() %></td>
          <td><%=ord.getShippedDate() %></td>
          <td><%=ord.getStatus() %></td>
          <td><%=ord.getComments() %></td>
          <td><%=ord.getCustomerNumber() %></td>
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
