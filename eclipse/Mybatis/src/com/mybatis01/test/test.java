package com.mybatis01.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis01.bean.Employee;

public class test {
	
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "com/conf/mybatis-config.xml";//ȫ�������ļ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	// 2����ȡsqlSessionʵ������ֱ��ִ���Ѿ�ӳ���sql���
	// sql��Ψһ��ʶ��statement Unique identifier matching the statement to use.
	// ִ��sqlҪ�õĲ�����parameter A parameter object to pass to the statement.
	public static void main(String[] args) throws IOException {
		System.out.println(111);
		List<Employee> list = new ArrayList<Employee>();
		SqlSessionFactory sqlSessionFactory =  getSqlSessionFactory();
		SqlSession Session = sqlSessionFactory.openSession();
		try{
			Employee employee = Session.selectOne("com.mybatis01.dao.EmployeeMapper.getEmpById",1);
			System.out.println(employee);
//			Session.insert("com.mybatis01.dao.EmployeeMapper.insertEmpById");
//			list = Session.selectOne("com.mybatis01.dao.EmployeeMapper.getAllById");
//			for(Employee e:list){
//				System.out.println(e);
//			}
		}finally{
			Session.close();
		}
//		
//		Employee employee = null;		
//		System.out.println("----------------------");
//		try{
//			SqlSessionFactory sqlSessionFactory2 = getSqlSessionFactory();
//			SqlSession session2 = sqlSessionFactory2.openSession();
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
