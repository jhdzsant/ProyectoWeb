package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class altaordersdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.1.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script> \n");
      out.write("   \n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alta de Ordenes de Detalle.</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("             <h1>Alta  Ordenes de DEtalle</h1>\n");
      out.write("        <form role=\"form\" action=\"ControladorG\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"pagina\" value=\"altaOrdersDetails\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"orderNumber\" >ID de Orden</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"orderNumber\" placeholder=\"Ingrese el Id de Orden\" name=\"orderNumber\" required>\n");
      out.write("                </div>\n");
      out.write("                <div >\n");
      out.write("                    <label for=\"productCode\" >ID de producto</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"productCode\" placeholder=\"ID de Producto\" name=\"productCode\" required >\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label for=\"quantityOrdered\" >Cantidad a ordenar</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"quantityOrdered\" placeholder=\"Ingrese cantidad de pzs\" name=\"quantityOrdered\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label for=\"priceEach\" >Costo por pieza</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"priceEach\" placeholder=\"Ingrese costo individual\" name=\"priceEach\" required>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label for=\"orderLineNumber\" >ID Linea de Orden</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"orderLineNumber\" placeholder=\"Ingrese el ID de linea de orden\" name=\"orderLineNumber\" required>\n");
      out.write("            </div>\n");
      out.write("   </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("            <a href=\"customerServlet?pagina=consultaCustomer\" class=\"btn btn-default\" role=\"button\">Consulta</a>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    <footer>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
