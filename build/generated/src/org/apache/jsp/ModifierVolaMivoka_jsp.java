package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ModifierVolaMivoka_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navBar.jsp");
    _jspx_dependants.add("/Securite_page.jsp");
  }

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

      out.write('\n');
      out.write('\n');

    if(request.getParameter("submit")!=null)
    {
        String id=request.getParameter("id");
        String daty=request.getParameter("date");
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        String montant=request.getParameter("montant");
        String antony=request.getParameter("antony");
        
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/gestiondecaisse","root","");
        
        pst=con.prepareStatement("UPDATE volamivoaka SET anarana = ?, fanampinanarana = ?, daty = ?, maribola = ?, antony = ? WHERE id=?");
        pst.setString(1, nom);
        pst.setString(2, prenom);
        pst.setString(3, daty);
        pst.setString(4,montant);
        pst.setString(5,antony);
        pst.setString(6, id);   
        pst.executeUpdate();

 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Mise à jour succès\");\n");
      out.write("        location.href = \"formVolaMivoaka.jsp\";\n");
      out.write("    </script>\n");
      out.write("    <script src=\"Alert/src/sweetalert2.js\"></script>\n");
      out.write("    <script src=\"Alert/src/SweetAlert.js\"></script>\n");
      out.write("    \n");

    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Modifier dépense</title>\n");
      out.write("        <link href=\"bootstrap/._bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"TransformMajuscul.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"StylText.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"StyleContainer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>navbar</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"bootstrap/bootstrap.min.css\">\n");
      out.write("        <script src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/popper.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"menu.jsp\"><img src=\"image/acceuil.jpg\" width=\"20px\" title=\"Menue prinsipal\"></a>\n");
      out.write("  \n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"formVolaMiditra.jsp\" title=\"Revenu\">Revenu</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"formVolaMivoaka.jsp\" title=\"Dépense\">Dépense</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    Par mois\n");
      out.write("                </a>\n");
      out.write("                  <div class=\"dropdown-menu\">\n");
      out.write("                      <a class=\"dropdown-item\" href =\"formVolaMIditraParMoi.jsp\" title=\"Revenu\">Revenu</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"formeVolaMIvoakaParMoi.jsp\" title=\"Dépense\">Dépense</a>\n");
      out.write("                </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    Par ans\n");
      out.write("                </a>\n");
      out.write("                  <div class=\"dropdown-menu\">\n");
      out.write("                      <a class=\"dropdown-item\" href =\"formVolaMiditraParAns.jsp\" title=\"Revenu\">Revenu</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"formVolaMivoakaParAns.jsp\" title=\"Dépense\">Dépense</a>\n");
      out.write("                </div>\n");
      out.write("      </li>\n");
      out.write("     \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Courbesparans.jsp\" title=\"Statistique\">Statistique</a>\n");
      out.write("        <!-- <a class=\"nav-link\" href=\"#\">Link</a> -->\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    <img src=\"image/Add List_24px.png\" title=\"Plus\">\n");
      out.write("                </a>\n");
      out.write("                  <div class=\"dropdown-menu\">\n");
      out.write("                      <a class=\"dropdown-item\" href=\"SoldeMiditra&Mivok.jsp\" title=\"Soldes\">Soldes</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"apropot de developeur.jsp\" title=\"Rapports\">Autre</a>\n");
      out.write("                      <a class=\"dropdown-item\" href=\"Sedeconnecter.jsp\" title=\"Déconnexion\">Déconnexion</a>\n");
      out.write("                </div>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" name=\"\" id=\"myInput\" placeholder=\"Recherche...\" aria-label=\"Search\">\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("          <br><br><br><br>\n");
      out.write("         <div>\n");
      out.write("              <table width='100%'>\n");
      out.write("                  <tr>\n");
      out.write("                      <td><center><img class=\"logo\" src=\"image/logo_FLM.jpg\" width=\"70\" height=\"70\" aligne=\"left\"></center></td>\n");
      out.write("              <td><h1><center><div class=\"DIV\"><b>GESTION DE CAISSE FLM</b></div></center></h1></td>\n");
      out.write("                      <td><img class=\"logo\" src=\"image/logo_FLM.jpg\" width=\"70\" height=\"70\" aligne=\"left\"></td>\n");
      out.write("                  </tr>\n");
      out.write("              </table> \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("        $(\"#myInput\").on(\"keyup\", function() {\n");
      out.write("            var value = $(this).val().toLowerCase();\n");
      out.write("            $(\"#myTable tr\").filter(function() {\n");
      out.write("            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String login = "";
            if (session.getAttribute("login")!=null){
            login = session.getAttribute("login").toString();
        }
        else{
        response.sendRedirect("Login.jsp");
        }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <h1><u><center>Modifier Dépense</center></u></h1>\n");
      out.write("        <div class=\"body\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form method=\"Post\" action=\"#\">\n");
      out.write("                        ");

                            Connection con;
                            PreparedStatement pst;
                            ResultSet rs;
                            Class.forName("com.mysql.jdbc.Driver");
                            con=DriverManager.getConnection("jdbc:mysql://localhost/gestiondecaisse","root","");

                            String id=request.getParameter("id");
                            pst=con.prepareStatement("SELECT * FROM volamivoaka WHERE id=?");
                            pst.setString(1, id);
                            rs=pst.executeQuery();
                            while (rs.next()) 
                            {
                        
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <table width=\"600px\">\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                     <td><label class=\"form-lael\">Date : </label></td>\n");
      out.write("                                    <td><input type=\"Date\" name=\"date\" value=\"");
      out.print(rs.getString("daty") );
      out.write("\"  id=\"\" class=\"form-control\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                    <td><label class=\"form-lael\">Nom : </label></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"nom\" value=\"");
      out.print(rs.getString("anarana") );
      out.write("\" onkeyup=\"controlnom(this)\" placeholder=\"Nom\" class=\"form-control\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                    <td><label class=\"form-lael\">Prénom : </label></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"prenom\" value=\"");
      out.print(rs.getString("fanampinanarana") );
      out.write("\" placeholder=\"Prénom\" class=\"form-control\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                    <td><label class=\"form-lael\">Montant : </label></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"montant\" value=\"");
      out.print(rs.getString("maribola") );
      out.write("\" placeholder=\"Montant\" class=\"form-control\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                    <td><label class=\"form-lael\">Motif : </label></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"antony\" value=\"");
      out.print(rs.getString("antony") );
      out.write("\" placeholder=\"Motif\" class=\"form-control\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr height='100px'>\n");
      out.write("                                    <td colspan=\"2\"><center><input type=\"submit\"  name=\"submit\" value=\"MODIFIER\" class=\"btn btn-info\"></center></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </center>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"TransformMajuscul.js\" type=\"text/javascript\"></script>\n");
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
