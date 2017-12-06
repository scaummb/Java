package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class testcase2 {
	public static void main(String [] args) throws IOException{
        String resource = "mybatis/configuration.xml";  
        Reader reader = Resources.getResourceAsReader(resource);  
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);  
        SqlSession session = sessionFactory.openSession();  
        try{
        	//获得 接口对象
        	UserImp usermapper = session.getMapper(UserImp.class);
        	User user = usermapper.getUserById(1);
        	System.out.println(user);
        }finally{
        	session.close();
        }
	}
}
