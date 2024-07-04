package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Autre_005fcompte_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inscription</title>\n");
      out.write("        <link href=\"bootstrap/._bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"StylText.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            div.body {\n");
      out.write("                    background :#ccccff; \n");
      out.write("                    width:50%;\n");
      out.write("                    height: 70%;\n");
      out.write("                    margin:30px auto;\n");
      out.write("                    border-radius:0.4em;\n");
      out.write("                    border:1px solid #191919;\n");
      out.write("                    overflow:hidden;\n");
      out.write("                    position:relative;\n");
      out.write("                    box-shadow: 0 5px 10px 5px rgba(0,0,0,0.2);\n");
      out.write("                  }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"body\">\n");
      out.write("            <h1><center>CREER UNE AUTRE COMPT</center></h1>\n");
      out.write("            <a href=\"Login.jsp\">Authentification</a>\n");
      out.write("            <form method=\"POST\" action=\"Autr_compte\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <table  align='TOP' width='500px'>\n");
      out.write("                        <tr  height='100px'>\n");
      out.write("                            <td><label class=\"form-lael\">Nom d'utilisateur : </label></td>\n");
      out.write("                            <td><input type=\"text\" name=\"username\" placeholder=\"Saississer la Nom d'utilisateur\" id=\"\" class=\"form-control\" autocomplete='off' required></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr  height='100px'>\n");
      out.write("                            <td><label class=\"form-lael\">Mot de passe : </label></td>\n");
      out.write("                            <td><input type=\"password\" name=\"password\" placeholder=\"Saisisser la Mot de passe\" class=\"form-control\" autocomplete='off' required></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr  height='100px'>\n");
      out.write("                            <td><label class=\"form-lael\">Confirmation de mot de passe : </label></td>\n");
      out.write("                            <td><input type=\"password\" name=\"conf_password\" placeholder=\"Confirmer la Mot de passe\" class=\"form-control\" autocomplete='off' required></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr  height='100px'>\n");
      out.write("                            <td colspan=\"2\"><center><input type=\"submit\" value=\"S'inscrire\" id=\"btn\"></center></td>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                    <br><br><br><br>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("       </div> \n");
      out.write("    </body>\n");
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
