package test.spring01.bjsxt.service;

import spring01.bjsxt.model.User;
import spring01.bjsxt.service.UserService;
import spring01.bjsxt.spring.ClassPathXmlApplicationContext;
import spring01.bjsxt.spring.beanFactory;

public class UserServiceTest {
		
		public void testAdd() throws Exception {
			//first ,new one contextbean，在调用ClassPathXmlApplicationContext()方法时
			//就已经将beans.xml的<beans>全部获取并存放在Map里面了，ClassPathXmlApplicationContext()对外提供
			//getBean()方法获取我们想要的类。
			beanFactory applicationContext = new ClassPathXmlApplicationContext();
			//second ,we transfer an id to get a bean from"UserService"
			UserService service = (UserService) applicationContext.getBean("UserService");
			//third ,add a new user 
			User u = new User();
			u.setUsername("mmb");
			u.setPassword("123");
			//finally , service add a new user
			service.add(u);
	}

}
