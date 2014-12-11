package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actualizarproductlines_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Actualiza Oficina.</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <form class=\"form-horizontal\" role=\"form\" action=\"ControladorG\" method=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"pagina\" value=\"actualizarProductlines\">\r\n");
      out.write("            \r\n");
      out.write("              <h1 class=\"page-header\">\r\n");
      out.write("          <img src=\"img/soporte1.png\" width=\"73\" height=\"69\">\r\n");
      out.write("             Actualizar <small>Por favor actualiza los datos</small>\r\n");
      out.write("  </h1>\r\n");
      out.write("            \r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("                \r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"textDescription\" >Linea de Producto:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"textDescription\" placeholder=\"Ingrese Linea de Producto\" name=\"textDescription\" value=\"");
      out.print(request.getParameter("textDescription"));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\" >\r\n");
      out.write("                   <label class=\"control-label col-xs-2\" for=\"textDescription\" >Descripcion:</label>\r\n");
      out.write("                        <div class=\"col-xs-3\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"textDescription\" placeholder=\"Ingrese Descripcion\" name=\"textDescription\" value=\"");
      out.print(request.getParameter("textDescription"));
      out.write("\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                <label class=\"control-label col-xs-2\" for=\"htmlDescription\" >Html:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"htmlDescription\" placeholder=\"Ingrese Html\" name=\"htmlDescription\" value=\"");
      out.print(request.getParameter("htmlDescription"));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("             <div class=\"form-group\" >\r\n");
      out.write("                <label class=\"control-label col-xs-2\"for=\"image\" >Imagen:</label>\r\n");
      out.write("                    <div class=\"col-xs-3\">  \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"image\" placeholder=\"Ingrese Imagen\" name=\"image\" value=\"");
      out.print(request.getParameter("image"));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         \r\n");
      out.write("             <br>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-xs-offset-2 col-xs-3\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("                    <a href=\"ControladorG?pagina=consultaProductlines\" class=\"btn btn-default\" role=\"button\">Consulta</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
