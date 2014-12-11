
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!Seccion de librerias>
<%@page import="java.util.*" %>
<%@page import="productLineDAO.productLine" %>
<%@page import="ctl.productLineServlet" %>

<html>
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/jquery-2.1.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Lineas de Productos</title>
        <jsp:include page="componentes/header.jsp" flush="true"/>
    </head>
    <br>
    <br>
    <body>
        <h1>Consulta de Lineas de Productos</h1>
        <% ArrayList lista = session.getAttribute("consultaProductLine") == null?null:(ArrayList)session.getAttribute("consultaProductLine"); %>
        <input type="hidden" name="paginaProductLine" value="consultaProductLine">
        <section>       
            
  <table class="table table-condensed">
      <tr>
          <th>productLine</th>
          <th>textDescription</th>
          <th>htmlDescription</th>
          <th>image</th>
      </tr>
      
      <% for(int i=0;i<lista.size();i++){
          productLine proli = (productLine)lista.get(i); 
      %>
      <tr>
          
          <td><a href = "actualizarproductLine.jsp?productLine=<%=proli.getProductLine()%>&textDescription=<%=proli.getTextDescription()%>&htmlDescription=<%=proli.getHtmlDescription()%>&image=<%=proli.getImage()%>"><%= proli.getProductLine()%></a></td>
          <td><%=proli.getTextDescription()%></td>
          <td><%=proli.getHtmlDescription()%></td>
          <td><%=proli.getImage() %></td>  
      </tr>
      <%}%>
  </table>
        </section>
    </body>
    <footer>
        <jsp:include page="componentes/footer.jsp" flush="true"/>
    </footer>
</html>
