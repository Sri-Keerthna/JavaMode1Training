package com.hcl.library;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
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
 * Servlet implementation class ReturnServlet
 */
public class ReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String username = (String) request.getAttribute("Username");
		RequestDispatcher rd1 = request.getRequestDispatcher("/Return");
		rd1.include(request, response);
				
		if(request.getParameterValues("bookid") != null)
		{
			String str[] = request.getParameterValues("bookid");
			try
			{
				Connection cp = DaoConnection.getConnection();
				for(String s : str)
				{
				String sql = "SELECT * FROM TranBook WHERE Username = ? ";
				PreparedStatement ps = cp.prepareStatement(sql,
				ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ps.setString(1,username);
				ResultSet rs =ps.executeQuery();
				String uname = null;
				Date fromdate;
				Date todate = new Date(session.getLastAccessedTime());
				
				if(rs.next()) 
				{
					uname = rs.getString("Username");
					fromdate = rs.getDate("Fromdate");
				
					if(username.equals(uname))
					{
						
						String sql1 = "DELETE FROM TranBook WHERE BookId = ? AND Username = ? " ;
						PreparedStatement ps1 = cp.prepareStatement(sql1);
						ps1.setString(1,s);
						ps1.setString(2,username);
						ps1.executeUpdate();
												
						String sql2 = " INSERT INTO TransReturn VALUES (?,?,?,?)" ;
						PreparedStatement ps2 = cp.prepareStatement(sql2);
						ps2.setString(1,username);
						ps2.setString(2,s);
						ps2.setDate(3,fromdate);
						ps2.setDate(4,todate);
						ps2.executeUpdate();
																		
						String sql3 = "SELECT TotalBooks FROM Books WHERE Id = ?";
						PreparedStatement ps3 = cp.prepareStatement(sql3);
						ps3.setString(1,s);
						ResultSet rs3 =ps3.executeQuery();
						rs3.next();
						String btotal = rs3.getString("TotalBooks");
						int bt = Integer.parseInt(btotal);
						bt = bt+1;
						
						String sql4 = "UPDATE Books SET TotalBooks = ? WHERE Id = ?" ;
						PreparedStatement ps4 = cp.prepareStatement(sql4);
						ps4.setInt(1,bt);
						ps4.setString(2,s);
						ps4.executeUpdate();
						
						out.write("<br/><br/>The book with Id ("+s+") is returned !...");	
					}
				}
				}				
			}
			catch(Exception e)
			{e.printStackTrace();}			
		}
		else
		{
			out.write("<br/><br/>Please select book to return ....... ");			
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
