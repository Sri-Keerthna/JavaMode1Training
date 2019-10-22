package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchStockServlet
 */
public class SearchStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStockServlet() {
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
		String stockid=request.getParameter("stockid");
		Stock objstock=StockBAL.searchStockBal(stockid);
		
		if(objstock!=null){
			out.println("Item Name "+objstock.getItemName()+"<br/>");
			out.println("Price "+objstock.getPrice()+"<br/>");
			out.println("Quantity Available "+objstock.getQuantityAvail()+"<br/>");
		}else{
			out.println("Stock ID Not Found");
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
