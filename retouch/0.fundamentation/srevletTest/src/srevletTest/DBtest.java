package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBtest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet()!!");
		PrintWriter out = response.getWriter();
		Connection conn = DB.getConn();
		Statement stmt = DB.getStatement(conn);
		ResultSet rs = DB.getResultSet(stmt, "SELECT * FROM classtable");
		out.println("<table border=1>");
		out.println("<tr><td>Contend:</td></tr>");
		try{
			while (rs.next()){
				out.println("<tr>");
				out.println("<td>" + rs.getString("name") + "</td>");
				out.println("</tr>");
			}			
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			DB.closeConn(conn);
			DB.closeRs(rs);
			DB.closeStatement(stmt);		
			System.out.println("allover..");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("in doPost()!!");
		doGet(req,resp);
	}

	@Override
	public void destroy() {
		System.out.println("destory()...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init()...");
	}
	
	
	
	

}
