/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-07-03 11:14:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class SoldeMiditra_0026Mivok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/RequetteTatitra.jsp", Long.valueOf(1720004761928L));
    _jspx_dependants.put("/navBar.jsp", Long.valueOf(1720004763209L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("      ");
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
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Connection con;
    PreparedStatement pst;
    
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/gestiondecaisse","root","");

    
    String Miditraisambolana="SELECT DATE_FORMAT(daty, '%M %Y') as date,SUM(maribola) AS totalmiditraparMoi FROM volamiditra GROUP BY date";
    String Mivoakaisambolana="SELECT DATE_FORMAT(daty, '%M %Y') as date,SUM(maribola) AS totalmiditraparMoi FROM volamivoaka GROUP BY date";
    String Miditraisataona="SELECT YEAR(daty) AS taona,SUM(maribola) AS totalmiditraparAns FROM volamiditra GROUP BY YEAR(daty)";
    String Mivoakaisataona="SELECT YEAR(daty) AS taona,SUM(maribola) AS totalmivoakaparAns FROM volamivoaka GROUP BY YEAR(daty)";
    String detail="SELECT YEAR(daty) AS taona,antony,MONTH(daty) AS volana,SUM(maribola) AS totalmiditraparAntony FROM volamiditra GROUP BY antony";
    //Solde miditra sy mivoaka
    String mivoaka="SELECT SUM(maribola) AS total FROM volamivoaka";
    String query="SELECT SUM(maribola) AS totalmiditra FROM volamiditra";
    Statement st=con.createStatement();

      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                  vola niditra :   \n");
      out.write("                </td>\n");
      out.write("                ");

                    rs1=st.executeQuery(query);
                    
                    while (rs1.next()) 
                    {
                
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"totalmiditra\" id=\"totalmiditra\" value=\"");
      out.print(rs1.getString("totalmiditra") );
      out.write("\" disabled>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Mivoaka : </td>\n");
      out.write("                ");

                   rs2=st.executeQuery(mivoaka);
                    while (rs2.next()) 
                    {
                
      out.write("\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"text\" name=\"totalmivoaka\" id=\"totalmivoaka\" value=\"");
      out.print(rs2.getString("total") );
      out.write("\" disabled>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");

            /*String x="4";
            int rs11 = (int) Integer.parseInt(x);
            String y="2";
            int rs22 = (int) Integer.parseInt(y);
            int resu = rs11 - rs22;
            out.println(resu);*/
        
      out.write("\n");
      out.write("        <p id=\"mes\"></p>\n");
      out.write("        <input type=\"button\"  id=\"btn\" onclick=\"resultat()\" value=\"Afficher la solde restant\">\n");
      out.write("        <script>\n");
      out.write("            function resultat(){\n");
      out.write("                var a1=document.getElementById(\"totalmiditra\").value;\n");
      out.write("                var a2=document.getElementById(\"totalmivoaka\").value;\n");
      out.write("                var totalmiditra = parseInt(a1);\n");
      out.write("                var totalmivoaka = parseInt(a2);\n");
      out.write("                var solde=totalmiditra-totalmivoaka;\n");
      out.write("                document.getElementById(\"mes\").innerHTML=\"Solde restnt : \"+solde;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("   \n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
