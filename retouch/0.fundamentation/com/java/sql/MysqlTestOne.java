package com.java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MysqlTestOne {
	/**
	 * @SuppressWarnings ��ע������ѡ���Ե�ȡ���ض�����Σ�������򷽷����еľ��档
	 * ���е��뷨�ǵ�����������ʱ�������������������ȷ�����������⣬ ���Ϳ������һ�� @SuppressWarnings ��ע����ʹ�������ٿ������档
	 * */
	@SuppressWarnings("resource")
	public static void main(String [] args) throws Exception{
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class. forName(driver);//����������Class.forName
			con = DriverManager.getConnection(url, user, password);//��������
			stmt = con.createStatement();//����statement����
			stmt.execute("create table classtable(classmateId int NOT NULL AUTO_INCREMENT ,"//ִ��SQL���
					+ "name char(20) NOT NULL,"
					+ "sex char(8) NOT NULL,"
					+ "birthdate int NOT NULL,"
					+ "address char(20) NOT NULL,"
					+ "phonenumber int NOT NULL,"
					+ "PRIMARY KEY (classmateId)"
					+ ")ENGINE=InnoDB;");
//			stmt.execute("select * from class ;");
//			stmt.execute("insert into Employee values(3,'James1 ',2)");
//			stmt.execute("insert int Employee values(2,'James2 ',26)");
			rs = stmt. executeQuery("select * from classtable");//��ȡResultSet
			while(rs.next()){
				System.out.println("Before**");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
			}
			stmt.execute("INSERT INTO classtable (classmateId,name,sex,birthdate,address,phonenumber)"
					+ "VALUES(1,'mmb','male',19941123,'maoming',123456),"
					+ "(2,'lhm','male',19941023,'guangdong',123616), "
					+ "(3,'hzt','female',19951193,'zhanjiang',1246456),"
					+ "(4,'Dhm','male',19941023,'guangdong',123616),"
					+ "(5,'DDm','male',19641023,'guangdong',123631);");
			//�ڴ�й¶
			rs = stmt. executeQuery("select * from classtable;");
			while(rs.next()){
				System.out.println("After**");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
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
