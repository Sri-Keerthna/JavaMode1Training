package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("Username");
		String pwd=request.getParameter("Password");
		boolean result=LoginJava.authenticate(user, pwd);
		if(result==true) {
			HttpSession session=request.getSession(true);
			session.setAttribute("user", user);
			RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
			disp.forward(request, response);
		} else {
			PrintWriter out=response.getWriter();
			out.println("Sorry Invalid User Credentails...Please Re-Enter");
			RequestDispatcher disp=request.getRequestDispatcher("Login.html");
			disp.include(request, response);
		}
	}

}

