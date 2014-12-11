<%-- 
    Document   : consultapayments
    Created on : 5/12/2014, 03:44:15 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="DatosIngresa.*" %>
<%@page import="ctl.*" %>

<!DOCTYPE html>
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Pagos</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Pagos</h1>
        <% ArrayList lista = session.getAttribute("consultaPayments") == null?null:(ArrayList)session.getAttribute("consultaPayments"); %>
        <input type="hidden" name="pagina" value="consultaPayments">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>paytomerNumber</th>
          <th>checkNumber</th>
          <th>paymentDate</th>
          <th>amount</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Payments pay = (Payments)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizarpayments.jsp?paytomerNumber=<%=pay.getCustomerNumber()%>&checkNumber=<%=pay.getCheckNumber()%>&paymentDate=<%=pay.getPaymentDate()%>&amount=<%=pay.getAmount()%>"><%= pay.getCustomerNumber()%></a></td>
          <td><%=pay.getCheckNumber()%></td>
          <td><%=pay.getPaymentDate() %></td>
          <td><%=pay.getAmount() %></td>
  
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
