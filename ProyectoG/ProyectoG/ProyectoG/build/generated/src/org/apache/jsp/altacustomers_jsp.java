package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class altacustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Co <title>Alta del Cliente.</title>ntent-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alta Cliente</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          \n");
      out.write("             \n");
      out.write("             \n");
      out.write("        <form class=\"form-horizontal\" role=\"form\" action=\"ControladorG\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"pagina\" value=\"altaCustomers\">\n");
      out.write("            \n");
      out.write("              <h1 class=\"page-header\">\n");
      out.write("          <img src=\"img/soporte1.png\" width=\"73\" height=\"69\">\n");
      out.write("              Alta <small>Por favor llena el formulario</small>\n");
      out.write("  </h1>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"customerNumber\">ID de Cliente:</label>\n");
      out.write("                    <div class=\"col-xs-3\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"customerNumber\" placeholder=\"Ingrese ID del Cliente\" name=\"customerNumber\" required>\n");
      out.write("                    </div>\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"customerName\" >Nombre del Cliente:</label>\n");
      out.write("                    <div class=\"col-xs-3\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"customerName\" placeholder=\"Nombre del Cliente\" name=\"customerName\" required >\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                   <label class=\"control-label col-xs-2\" for=\"contactFirstName\" >Nombre del Contacto:</label>\n");
      out.write("                        <div class=\"col-xs-3\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"contactFirstName\" placeholder=\"Primer Nombre\" name=\"contactFirstName\" required>\n");
      out.write("                        </div>\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"contactLastName\" >Apellido del Contacto:</label>\n");
      out.write("                    <div class=\"col-xs-3\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"contactLastName\" placeholder=\"Apellido paterno\" name=\"contactLastName\" required>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"phone\" >Telefono:</label>\n");
      out.write("                    <div class=\"col-xs-3\">                \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"phone\" placeholder=\"Ingrese Telefono\" name=\"phone\" required>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <div class=\"form-group\" >\n");
      out.write("                <label class=\"control-label col-xs-2\"for=\"addressLine1\" >Dirección principal:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"addressLine1\" placeholder=\"Ingresa direccion\" name=\"addressLine1\" required>\n");
      out.write("                    </div>\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"addressLine2\" >Dirección secundaria:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"addressLine2\" placeholder=\"Ingresa direccion 2 \" name=\"addressLine2\" required>\n");
      out.write("                    </div> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"city\" >Ciudad:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"city\" placeholder=\"Ingresa ciudad\" name=\"city\" required>\n");
      out.write("                    </div>\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"state\" >Estado:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"state\" placeholder=\"Ingrese Estado\" name=\"state\" required>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" >                \n");
      out.write("                <label  class=\"control-label col-xs-2\" for=\"postalCode\" >Codigo Postal:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"postalCode\" placeholder=\"Ingresa Codigo Postal\" name=\"postalCode\" required>\n");
      out.write("                    </div> \n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"country\" >Pais:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"country\" placeholder=\"Ingresa pais\" name=\"country\" required>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"salesRepEmployeeNumber\" >Clave de Vendedor:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"addressLine1\" placeholder=\"Ingresa direccion\" name=\"salesRepEmployeeNumber\" required>\n");
      out.write("                    </div>\n");
      out.write("                <label class=\"control-label col-xs-2\" for=creditLimit >Limite de Crédito:</label>\n");
      out.write("                    <div class=\"col-xs-3\">  \n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"creditLimit\" placeholder=\"Ingrese Limite de Credito\" name=\"creditLimit\" required>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <br>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-xs-offset-2 col-xs-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("                    <a href=\"Controlador?paginaCustomer=altaCustomer\" class=\"btn btn-default\" role=\"button\">Consulta</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
