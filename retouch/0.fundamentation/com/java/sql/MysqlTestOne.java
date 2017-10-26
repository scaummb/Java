package com.java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MysqlTestOne {
	public static void main(String [] args) throws Exception{
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class. forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			stmt.execute("insert into Employee values(3,'James1 ',2)");
			stmt.execute("insert int Employee values(2,'James2 ',26)");
			rs = stmt. executeQuery("select * from Emplyee");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}

		}
		catch(SQLException e1){
			e1. printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			}catch(SQLException e){
				System.out.println(e. getMessage());
			}
		}
	}
}
