package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class altaoficina_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script> \r\n");
      out.write("   \r\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Co <title>Alta Office</title>ntent-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Alta Oficina</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          \r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("        <form class=\"form-horizontal\" role=\"form\" action=\"ControladorG\" method=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"pagina\" value=\"altaOffice\">\r\n");
      out.write("            \r\n");
      out.write("              <h1 class=\"page-header\">\r\n");
      out.write("          <img src=\"img/soporte1.png\" width=\"73\" height=\"69\">\r\n");
      out.write("              Alta <small>Por favor llena el formulario de oficina</small>\r\n");
      out.write("  </h1>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"officeCode\">Clave de oficina:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"officeCode\" placeholder=\"Ingrese la Clave de la oficina\" name=\"officeCode\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"form-group\" >\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"city\" >Ciudad:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">                \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"city\" placeholder=\"Ingrese Ciudad\" name=\"city\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\" >\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"phone\" >Telefono:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">                \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"phone\" placeholder=\"Ingrese Telefono\" name=\"phone\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("             <div class=\"form-group\" >\r\n");
      out.write("                <label class=\"control-label col-xs-2\"for=\"addressLine1\" >Dirección principal:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"addressLine1\" placeholder=\"Ingresa direccion\" name=\"addressLine1\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"addressLine2\" >Dirección secundaria:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"addressLine2\" placeholder=\"Ingresa direccion 2 \" name=\"addressLine2\" required>\r\n");
      out.write("                    </div> \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\" >\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"state\" >Estado:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"state\" placeholder=\"Ingrese Estado\" name=\"state\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"country\" >Pais:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"country\" placeholder=\"Ingrese Estado\" name=\"country\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\" >                \r\n");
      out.write("                <label  class=\"control-label col-xs-2\" for=\"postalCode\" >Codigo Postal:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"postalCode\" placeholder=\"Ingresa Codigo Postal\" name=\"postalCode\" required>\r\n");
      out.write("                    </div> \r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"territory\" >Territorio:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"territory\" placeholder=\"Ingresa pais\" name=\"territory\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write("            \r\n");
      out.write("             <br>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-xs-offset-2 col-xs-3\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("                    <a href=\"ControladorG?pagina=consultaOffice\" class=\"btn btn-default\" role=\"button\">Consulta</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <br>\r\n");
      out.write("    <footer>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("</html>\r\n");
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
