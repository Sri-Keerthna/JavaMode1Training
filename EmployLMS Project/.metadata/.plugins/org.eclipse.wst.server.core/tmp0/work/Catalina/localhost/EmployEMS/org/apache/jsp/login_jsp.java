/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-08-28 12:05:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.hcl.beans.DaoConnection;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.hcl.beans.DaoConnection");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("function cancel(){\r\n");
      out.write("\tdocument.getElementById('user').value=\"\";\r\n");
      out.write("\tdocument.getElementById('password').value=\"\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form>\r\n");
      out.write("<h1><b>Login Screen</b></h1>\r\n");
      out.write("<center>\r\n");
      out.write("Employee ID \r\n");
      out.write("<input type=\"text\" name=\"EMP_ID\"/><br/><br/>\r\n");
      out.write("Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<input type=\"password\" name=\"secretCode\"/><br/><br/><br/>\r\n");
      out.write("<input type=\"submit\" value=\"Login\"/>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<input type=\"submit\" value=\"Cancel\"/>\r\n");
      out.write("</form>\r\n");

		String EMP_ID = (String)request.getParameter("EMP_ID");
		String password = (String)request.getParameter("secretCode");
		session.setAttribute("EMP_ID", EMP_ID);
	if(request.getParameter("EMP_ID") != null) {
		Connection con = DaoConnection.getConnection();
		String cmd = "Select SecretCode from EmployLogin where EMP_ID = ?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(EMP_ID));
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			if(rs.getString("secretCode").equals(password)){
				
      out.write(' ');
      if (true) {
        _jspx_page_context.forward("MyDetails.jsp");
        return;
      }
      out.write(' ');
 
			} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t <a style=\"color:red\">Wrong Password</a>\r\n");
      out.write("\t\t\t");
}
		}else {
      out.write("\r\n");
      out.write("\t\t <a style=\"color:red\">Employ does exist not </a>\r\n");
      out.write("\t");
  }
	}
	
      out.write("\r\n");
      out.write("\t</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
