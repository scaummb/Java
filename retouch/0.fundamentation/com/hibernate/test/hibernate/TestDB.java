package com.hibernate.test.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.test.Employee;

public class TestDB {

	public static void main(String[] args) {
//		Configuration config = new Configuration().configure("\\com\\hibernate\\test\\hibernatehibernate.cfg.xml");
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory(); 
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee e = new Employee();
		e.setName("mmb");
		e.setAge(23);
//		e.setId(90918);
		try{
			session.save(e);  //保存到持久类对象
			tx.commit();	//提交到数据库
			//从数据库查找刚刚保存的数据
			Query q = session.createSQLQuery("select * from Employee").addEntity(Employee.class);
			List <Employee> rs = q.list();
			for(int i = 0; i < rs.size(); i++){
				Employee e1 = rs.get(i);
				System.out.println("id: "+ e1.getId()+" name: "+ e1.getName()+ " age: "+ e1.getAge());
			}
			session.close();
		}catch(Exception e1){
			e1.printStackTrace();
			tx.rollback();
		}
		
	}

}
