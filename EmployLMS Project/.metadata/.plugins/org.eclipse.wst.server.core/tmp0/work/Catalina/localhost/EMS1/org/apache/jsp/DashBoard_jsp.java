/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-08-28 09:16:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hcl.ems.LeaveHistory;
import com.hcl.ems.EmployeeBaL;
import com.hcl.ems.Employee;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.hcl.ems.Employee");
    _jspx_imports_classes.add("com.hcl.ems.LeaveHistory");
    _jspx_imports_classes.add("com.hcl.ems.EmployeeBaL");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style >\r\n");
      out.write(".green { \r\n");
      out.write("        top: 200px; \r\n");
      out.write("        left: 15px; \r\n");
      out.write("        background-color: #8ebf00; \r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"MyDetails\" class=\"green\">\r\n");

	String emp_id =(String) session.getAttribute("EMP_ID");
	Employee obj = EmployeeBaL.showEmployeeBal(Integer.parseInt(emp_id));

      out.write("\r\n");
      out.write("<table bgcolor=\"yellow\" ><tr><td>\r\n");
      out.write("\tEmploy ID :</td><td>\r\n");
      out.write("\t");
      out.print(obj.getEmp_id() );
      out.write("</td><td></td><td>\r\n");
      out.write("\tMobile Number :</td><td>\t\r\n");
      out.write("\t");
      out.print(obj.getEmp_mob_no() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\tFull Name :</td><td>\r\n");
      out.write("\t");
      out.print(obj.getEmp_name() );
      out.write("</td><td></td><td>\r\n");
      out.write("\tDate Joined :</td><td>\r\n");
      out.write("\t");
      out.print(obj.getEmp_date_joined() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\tEmail Address :</td><td>\r\n");
      out.write("\t");
      out.print(obj.getEmp_email() );
      out.write("</td><td></td><td>\r\n");
      out.write("\tDepartment :</td><td>\r\n");
      out.write("\t");
      out.print(obj.getEmp_dpt_name() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr ><td colspan=\"4\"><center>\r\n");
      out.write("\tAvailable leave Balance :\r\n");
      out.write("\t");
      out.print(obj.getEmp_leave_balance() );
      out.write("</center></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"MyManager\" style=\"width: 500px\" >\r\n");
      out.write("\t");

	int emp_id1 = obj.getEmp_mgr_id();
	Employee obj1 = EmployeeBaL.showEmployeeBal(emp_id1);
	if (obj1.getEmp_name()==null) {
	
      out.write("<center >");
      out.print("No manager" );
      out.write("</center>\r\n");
      out.write("\t");

	} else {
	
      out.write(" <table bgcolor=\"cyan\"><tr><td>\r\n");
      out.write("\tManager Id :</td><td>\r\n");
      out.write("\t");
      out.print(obj1.getEmp_id() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\tFull Name :</td><td>\r\n");
      out.write("\t");
      out.print(obj1.getEmp_name() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\tEmail Address :</td><td>\r\n");
      out.write("\t");
      out.print(obj1.getEmp_email() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr><td>\r\n");
      out.write("\tMobile Number :</td><td>\r\n");
      out.write("\t");
      out.print(obj1.getEmp_mob_no() );
      out.write("</td></tr>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\t");

	LeaveHistory leave = EmployeeBaL.leaveBal(Integer.parseInt(emp_id));
	
      out.write("<table bgcolor=\"orange\"><tr><td>Leave ID</td><td>Number of Days</td><td>Start Date</td><td>End Date</td><td>LeaveType</td>\r\n");
      out.write("\t\t<td>Status</td><td>Reason</td><td>Applied On</td><td>Manager Comments</td></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");

	
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
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
