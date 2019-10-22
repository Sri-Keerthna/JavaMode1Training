package com.hcl.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookiesServlet
 */
public class AddCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		Cookie ckSri=new Cookie("Sri","64");
		ckSri.setMaxAge(1000*24*60*60);
		response.addCookie(ckSri);
		
		Cookie ckKeerthi=new Cookie("Keerthi","78");
		ckKeerthi.setMaxAge(1000*24*60*60);
		response.addCookie(ckKeerthi);
		
		Cookie ckDivya=new Cookie("Divya","55");
		ckDivya.setMaxAge(1000*24*60*60);
		response.addCookie(ckDivya);
		
		Cookie ckRenu=new Cookie("Renu","88");
		ckRenu.setMaxAge(1000*24*60*60);
		response.addCookie(ckRenu);
		
		Cookie ckSuganya=new Cookie("Suganya","34");
		ckSuganya.setMaxAge(1000*24*60*60);
		response.addCookie(ckSuganya);
		
		out.println("Cookie Created successfully<br/><br/>");
		out.println("<a href=ShowCookiesServlet>Show Cookies</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
