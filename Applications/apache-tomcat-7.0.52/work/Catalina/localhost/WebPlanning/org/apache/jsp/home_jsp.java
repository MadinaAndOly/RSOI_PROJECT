/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-06-07 01:38:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <div class=\"navbar\">\n");
      out.write("        <div class=\"navbar-inner\">\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user != null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">Домой</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </c:if>\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                <ul class=\"nav pull-right\">\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </c:if>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"hero-unit\">\n");
      out.write("            <h1>Система планирования государственных программ</h1>\n");
      out.write("            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registered != null && user == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                <p>\n");
      out.write("                    <b>Регистрация успешно завершена, войдите в систему</b>.\n");
      out.write("                </p>\n");
      out.write("            </c:if>\n");
      out.write("        <p>\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registered == null && user == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                <a href=\"#regModal\" role=\"button\" class=\"btn btn-primary\"\n");
      out.write("                   data-toggle=\"modal\">Зарегистрироваться</a>\n");
      out.write("                </c:if>\n");
      out.write("            <form action=\"redirect\" method=\"post\">\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${registered == null && user == null}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("                    <a href=\"#loginModal\"\n");
      out.write("                       role=\"button\" class=\"btn\" data-toggle=\"modal\">Войти\n");
      out.write("                        в систему</a>\n");
      out.write("                    <input type=\"hidden\" value=\"index\" name=\"redirectTo\">\n");
      out.write("                </c:if>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"span5 offset2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"span3\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"regModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("             aria-labelledby=\"myRegLabel\" aria-hidden=\"true\">\n");
      out.write("            <form action=\"register\" method=\"post\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("                            aria-hidden=\"true\">×</button>\n");
      out.write("                    <h3 id=\"myRegLabel\">Регистрация</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>\n");
      out.write("                        <input  placeholder=\" Имя\" name=\"name\"> <span\n");
      out.write("                            class=\"label label-important\">Обязательно</span>\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        <input  placeholder=\" Фамилия\" name=\"lname\">\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        <input  placeholder=\" Отчество\" name=\"mname\">\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        <input placeholder=\" Логин\" name=\"login\"> <span\n");
      out.write("                            class=\"label label-important\">Обязательно</span>\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        <input  placeholder=\" Пароль\" name=\"pwd\"> <span\n");
      out.write("                            class=\"label label-important\">Обязательно</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Закрыть</button>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Регистрация\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"loginModal\" class=\"modal hide fade\" tabindex=\"-1\"\n");
      out.write("             role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <form action=\"authorize\" method=\"post\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("                            aria-hidden=\"true\">×</button>\n");
      out.write("                    <h3 id=\"myModalLabel\">Вход в систему</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>\n");
      out.write("                        <input placeholder=\" Логин\" name=\"login\"> <span\n");
      out.write("                            class=\"label label-important\">Обязательно</span>\n");
      out.write("                    </p>\n");
      out.write("                    <input placeholder=\" Пароль\" name=\"pwd\"> <span\n");
      out.write("                        class=\"label label-important\">Обязательно</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Закрыть</button>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Войти\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-transition.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-alert.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-modal.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-dropdown.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-scrollspy.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-tab.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-tooltip.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-popover.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-button.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-collapse.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-carousel.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-typeahead.js\"></script>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
