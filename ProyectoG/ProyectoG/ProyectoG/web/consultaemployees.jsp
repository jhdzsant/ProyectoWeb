<%-- 
    Document   : consultaEmployess
    Created on : 5/12/2014, 11:47:41 AM
    Author     : Julian
--%>

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
        <title>Consulta de Empleados</title>
        
    </head>
    <br>
    <br>
    <body>
        <jsp:include page="header.jsp" flush="true"/>
        <h1>Consulta de Empleados</h1>
        <% ArrayList lista = session.getAttribute("consultaEmployess") == null?null:(ArrayList)session.getAttribute("consultaEmployess"); %>
        <input type="hidden" name="pagina" value="consultaEmployess">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>employeeNumber</th>
          <th>lastName</th>
          <th>firstName</th>
          <th>extension</th>
          <th>email</th>
          <th>officeCode</th>
          <th>reportsTo</th>
          <th>jobTitle</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Employess emp = (Employess)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizaremployess.jsp?employeeNumber=<%=emp.getEmployeeNumber()%>&lastName=<%=emp.getLastName()%>&firstName=<%=emp.getFirstName()%>&extension=<%=emp.getExtension()%>&email=<%=emp.getEmail()%>&officeCode=<%=emp.getOfficeCode()%>&reportsTo=<%=emp.getReportsTo()%>&jobTitle=<%=emp.getJobTitle()%>"><%= emp.getEmployeeNumber()%></a>
          </td>
          <td><%=emp.getLastName()%></td>
          <td><%=emp.getFirstName() %></td>
          <td><%=emp.getExtension() %></td>
          <td><%=emp.getEmail() %></td>
          <td><%=emp.getOfficeCode() %></td>
          <td><%=emp.getReportsTo() %></td>
          <td><%=emp.getJobTitle() %></td>
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>