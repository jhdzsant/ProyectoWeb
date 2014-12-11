<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!Seccion de librerias>
<%@page import="java.util.*" %>
<%@page import="ConexionDB.*" %>
<%@page import="ctl.*" %>
<%@page import="DatosIngresa.*"%>

<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Oficinas</title>
        <jsp:include page="header.jsp" flush="true"/>
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Oficinas</h1>
        <% ArrayList lista = session.getAttribute("consultaOffice") == null?null:(ArrayList)session.getAttribute("consultaOffice"); %>
        <input type="hidden" name="pagina" value="consultaOffice">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>officeCode</th>
          <th>city</th>
          <th>phone</th>
          <th>addressLine1</th>
          <th>addressLine2</th>
          <th>state</th>
          <th>country</th>
          <th>postalCode</th>
          <th>territory</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Offices of = (Offices)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizaroffices.jsp?officeCode=<%=of.getOfficeCode()%>&city=<%=of.getCity()%>&phone=<%=of.getPhone()%>&addressLine1=<%=of.getAddressLine1()%>&addressLine2=<%=of.getAddressLine2()%>&state=<%=of.getState()%>&country=<%=of.getCountry()%>&postalCode=<%=of.getPostalCode() %>&territory=<%=of.getTerritory()%>"><%= of.getOfficeCode()%></a></td>
          <td><%=of.getCity() %></td>
          <td><%=of.getPhone() %></td>
          <td><%=of.getAddressLine1() %></td>
          <td><%=of.getAddressLine2() %></td>          
          <td><%=of.getState() %></td>
          <td><%=of.getCountry() %></td>
          <td><%=of.getPostalCode() %></td>
          <td><%=of.getTerritory() %></td>
  
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
