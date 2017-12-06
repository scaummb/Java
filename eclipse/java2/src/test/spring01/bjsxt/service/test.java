package test.spring01.bjsxt.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spring01.bjsxt.model.User;
import spring01.bjsxt.service.UserService;
import spring01.bjsxt.spring.ClassPathXmlApplicationContext;
import spring01.bjsxt.spring.beanFactory;

public class test {
	@Test
	public void testAdd() throws Exception {
		try{
			//first ,new one contextbean
			beanFactory applicationContext = new ClassPathXmlApplicationContext();
			//second ,we transfer an id to get a bean from"UserService"
			UserService service = (UserService) applicationContext.getBean("UserService");
			//third ,add a new user 
			User u = new User();
			u.setUsername("mmb");
			u.setPassword("123");
			//finally , service add a new user
			service.add(u);
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
