package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletMySQL extends HttpServlet{

	@SuppressWarnings("null")
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet()... hahaha");
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;		
		PrintWriter out = response.getWriter();		
		out.println("<table border=1>");
		out.println("<tr><td>Contend:</td></tr>");
		try{
			System.out.println("222 in doGet()... hahaha");
			Class. forName(driver);//加载驱动，Class.forName
			System.out.println("333 driver successfully... hahaha");
//			conn = DriverManager.getConnection(url, user, password);//建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=");
			System.out.println("444 connection successfully...hahaha");
			//内存泄露
//			rs = stmt.executeQuery("select * from classtable");
			rs = stmt.executeQuery("USE TEST");
			rs = stmt.executeQuery("select name from classtable");
			System.out.println("select name from classtable  :");
//			Collection c = new ArrayList();
			while(rs.next()){
				System.out.println("show result...kkkk");
				out.println("<tr>");
				out.println("<td>" + rs.getString("cont") + "</td>");
				out.println("</tr>");
				System.out.println("After**");
//				int a1 = rs.getInt(1);
//				String a2 = rs.getString(2);
//				String a3 = rs.getString(3);
//				int a4 =  rs.getInt(4);
//				String a5 = rs.getString(5);
//				int a6 =  rs.getInt(6);
//				System.out.println(a1+" "+a2 +" "+a3 +" "+a4+" "+a5+" "+a6);
//				c.add(a1);c.add(a2);c.add(a3);c.add(a4);c.add(a5);c.add(a6);
//				System.out.println(c);
//				Iterator it = c.iterator();
//				while(it.hasNext()){
//					out.println("<tr>");
//					out.print("<td>");
//					out.print(it.next());
//					out.print("</td>");
//					out.println("</tr>");
//				}
			}
		}catch(SQLException | ClassNotFoundException e1){
			e1. printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(SQLException e){
				System.out.println(e. getMessage());
			}
		}				
	}

	@Override
	public void destroy() {
        super.destroy();
        try{
            DriverManager.deregisterDriver(DriverManager.getDrivers().nextElement());
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	
	
	
}
