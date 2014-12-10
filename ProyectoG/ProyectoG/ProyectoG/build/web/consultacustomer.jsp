<%-- 
    Document   : consultacustomers
    Created on : 23/11/2014, 04:09:32 PM
    Author     : Julian Salinas
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
        <title>Consulta de Clientes</title>
       
    </head>
    <br>
    <br>
  
    <body>
         <jsp:include page="header.jsp" flush="true"/>
 
        
  
    
 
                    
       
   
       <%  ArrayList lista = session.getAttribute("consultaCustomer") == null?null:(ArrayList)session.getAttribute("consultaCustomer"); %>
        <input type="hidden" name="pagina" value="consultaCustomer">
        <section>       
                   

                            
                            
            <table class="table table-striped ">
                 <h1>Consulta de Clientes</h1>
      
      <tr>
          <th>ID de Cliente</th>
          <th>Nombre del Cliente</th>
          <th>Apellido del Contacto</th>
          <th>Nombre del Contacto</th>
          <th>Telefono:</th>
          <th>Dirección principal</th>
          <th>Dirección secundaria</th>
          <th>Ciudad</th>
          <th>Estado</th>
          <th>Codigo Postal</th>
          <th>Pais</th>
          <th>Clave de Vendedor</th>
          <th>Limite de Crédito</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          Customers cus = (Customers)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizarcustomers.jsp?customerNumber=<%=cus.getCustomerNumber()%>&customerName=<%=cus.getCustomerName()%>&contactLastName=<%=cus.getContactLastName()%>&contactFirstName=<%=cus.getContactFirstName()%>&phone=<%=cus.getPhone()%>&addressLine1=<%=cus.getAnddresLine1()%>&addressLine2=<%=cus.getAnddresLine2()%>&city=<%=cus.getCity()%>&state=<%=cus.getState()%>&postalCode=<%=cus.getPostalCode() %>&country=<%=cus.getCountry()%>&salesRepEmployeeNumber=<%=cus.getSalesRepEmployeeNumber()%>&creditLimit=<%=cus.getCreditLimit()%>"><%= cus.getCustomerNumber()%></a></td>
          <td><%=cus.getCustomerName()%></td>
          <td><%=cus.getContactLastName()%></td>
          <td><%=cus.getContactFirstName() %></td>
          <td><%=cus.getPhone() %></td>
          <td><%=cus.getAnddresLine1() %></td>
          <td><%=cus.getAnddresLine2() %></td>
          <td><%=cus.getCity() %></td>
          <td><%=cus.getState() %></td>
          <td><%=cus.getPostalCode() %></td>
          <td><%=cus.getCountry() %></td>
          <td><%=cus.getSalesRepEmployeeNumber() %></td>
          <td><%=cus.getCreditLimit() %></td>
  
      </tr>
      <%}%>
      
  </table>
  </div>
  </div>
                    </div>
        </section>
      
                    </div>
      
      
      
  
</body>
    
    <footer>
        <jsp:include page="footer.jsp" flush="true"/>
    </footer>
</html>
