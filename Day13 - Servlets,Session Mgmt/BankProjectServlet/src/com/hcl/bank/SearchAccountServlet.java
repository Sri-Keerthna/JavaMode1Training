package com.hcl.bank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountServlet
 */
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		int accountNo=Integer.parseInt(request.getParameter("accountNo"));
		Accounts objaccounts=AccountBAL.searchAccountBal(accountNo);
		
		if(objaccounts!=null){
			out.println("First Name "+objaccounts.getFirstName()+"<br/>");
			out.println("Last Name "+objaccounts.getLastName()+"<br/>");
			out.println("City "+objaccounts.getCity()+"<br/>");
			out.println("State"+objaccounts.getState()+"<br/>");
			out.println("Amount "+objaccounts.getAmount()+"<br/>");
			out.println("CheqFacil"+objaccounts.getCheqFacil()+"<br/>");
			out.println("Account Type "+objaccounts.getAccountType()+"<br/>");
		}else{
			out.println("Account No Not Found");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
