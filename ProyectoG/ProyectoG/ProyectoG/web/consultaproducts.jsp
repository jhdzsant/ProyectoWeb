<<<<<<< HEAD
=======

>>>>>>> origin/master
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!Seccion de librerias>
<%@page import="java.util.*" %>
<<<<<<< HEAD
<%@page import="DatosIngresa.*" %>
<%@page import="ctl.*" %>
=======
<%@page import="DatosIngresa.*" %>
<%@page import="ctl.*" %>

>>>>>>> origin/master
<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Productos</title>
<<<<<<< HEAD
        <jsp:include page="header.jsp" flush="true"/>
=======
        <jsp:include page="componentes/header.jsp" flush="true"/>
>>>>>>> origin/master
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Productos</h1>
        <% ArrayList lista = session.getAttribute("consultaProduct") == null?null:(ArrayList)session.getAttribute("consultaProduct"); %>
<<<<<<< HEAD
        <input type="hidden" name="pagina" value="consultaProducts">
=======
        <input type="hidden" name="paginaProduct" value="consultaProduct">
>>>>>>> origin/master
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>productCode</th>
          <th>productName</th>
          <th>productLine</th>
          <th>productScale</th>
          <th>productVendor</th>
          <th>productDescription</th>
          <th>quantityInStock</th>
          <th>buyPrice</th>
          <th>MSRP</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
<<<<<<< HEAD
          Products prod = (Products)lista.get(i); 
      %>
      <tr>
          <td><a href = "actualizarproducts.jsp?productCode=<%=prod.getProductCode()%>&productName=<%=prod.getProductName()%>&productLine=<%=prod.getProductLine()%>&productScale=<%=prod.getProductScale()%>&productVendor=<%=prod.getProductVendor()%>&productDescription=<%=prod.getProductDescription()%>&quantityInStock=<%=prod.getQuantityInStock()%>&buyPrice=<%=prod.getBuyPrice()%>&MSRP=<%=prod.getMSRP()%>"><%= prod.getProductCode()%></a></td>
=======
          product prod = (product)lista.get(i); 
      %>
      <tr>
          <td><a href = "actualizarproduct.jsp?productCode=<%=prod.getProductCode()%>&productName=<%=prod.getProductName()%>&productLine=<%=prod.getProductLine()%>&productScale=<%=prod.getProductScale()%>&productVendor=<%=prod.getProductVendor()%>&productDescription=<%=prod.getProductDescription()%>&quantityInStock=<%=prod.getQuantityInStock()%>&buyPrice=<%=prod.getBuyPrice()%>&MSRP=<%=prod.getMSRP()%>"><%= prod.getProductCode()%></a></td>
>>>>>>> origin/master
          <td><%=prod.getProductName()%></td>
          <td><%=prod.getProductLine()%></td>
          <td><%=prod.getProductScale() %></td>
          <td><%=prod.getProductVendor() %></td>
          <td><%=prod.getProductDescription() %></td>
          <td><%=prod.getQuantityInStock() %></td>
          <td><%=prod.getBuyPrice() %></td>
          <td><%=prod.getMSRP() %></td>  
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
<<<<<<< HEAD
        <jsp:include page="footer.jsp" flush="true"/>
=======
        <jsp:include page="componentes/footer.jsp" flush="true"/>
>>>>>>> origin/master
    </footer>
</html>