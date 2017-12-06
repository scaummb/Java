package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class testcase {
	public static void main(String[] args) throws IOException {
        String resource = "mybatis/configuration.xml";  
        Reader reader = Resources.getResourceAsReader(resource);  
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);  
        SqlSession session = ssf.openSession();  
        try {  
            User user = (User) session.selectOne("User.selectUser", "1");  
            System.out.println(user);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            session.close();  
        } 
				
	}

}
