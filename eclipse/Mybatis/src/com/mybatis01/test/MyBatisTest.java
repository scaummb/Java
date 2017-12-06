package com.mybatis01.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis01.bean.Employee;
import com.mybatis01.dao.EmployeeMapper;


/**
 * 1���ӿ�ʽ���
 * 	ԭ����		Dao		====>  DaoImpl
 * 	mybatis��	Mapper	====>  xxMapper.xml
 * 2��SqlSession��������ݿ��һ�λỰ���������رգ�
 * 3��SqlSession��connectionһ�������Ƿ��̰߳�ȫ��ÿ��ʹ�ö�Ӧ��ȥ��ȡ�µĶ���
 * 4��mapper�ӿ�û��ʵ���࣬����mybatis��Ϊ����ӿ�����һ���������
 * 		�����ӿں�xml���а󶨣�
 * 		EmployeeMapper empMapper =	sqlSession.getMapper(EmployeeMapper.class);
 * 5��������Ҫ�������ļ���
 * 		mybatis��ȫ�������ļ����������ݿ����ӳ���Ϣ�������������Ϣ��...ϵͳ���л�����Ϣ
 * 		sqlӳ���ļ���������ÿһ��sql����ӳ����Ϣ��
 * 					��sql��ȡ������	
 * @author lfy
 *
 */
public class MyBatisTest {
	//�õ�һ��������
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "org/mybatis/example/mybatis-config.xml";//ȫ�������ļ�
		InputStream inputStream = null;
		try{
			inputStream = Resources.getResourceAsStream(resource);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	/**
	 * 1������xml�����ļ���ȫ�������ļ�������һ��SqlSessionFactory���� ������ԴһЩ���л�����Ϣ
	 * 2��sqlӳ���ļ���������ÿһ��sql���Լ�sql�ķ�װ����ȡ� 
	 * 3����sqlӳ���ļ�ע����ȫ�������ļ���
	 * 4��д���룺
	 * 		1������ȫ�������ļ��õ�SqlSessionFactory��
	 * 		2��ʹ��sqlSession��������ȡ��sqlSession����ʹ������ִ����ɾ�Ĳ�
	 * 			һ��sqlSession���Ǵ�������ݿ��һ�λỰ������ر�
	 * 		3��ʹ��sql��Ψһ��־������MyBatisִ���ĸ�sql��sql���Ǳ�����sqlӳ���ļ��еġ�
	 * 
	 * @throws IOException
	 */
	@Test
	public void test() throws IOException {

		// 2����ȡsqlSessionʵ������ֱ��ִ���Ѿ�ӳ���sql���
		// sql��Ψһ��ʶ��statement Unique identifier matching the statement to use.
		// ִ��sqlҪ�õĲ�����parameter A parameter object to pass to the statement.
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

		SqlSession Session = sqlSessionFactory.openSession();
		try {
			Employee employee = Session.selectOne("com.mybatis01.dao.EmployeeMapper.getEmpById", 1);
			System.out.println(employee);
		} finally {
			Session.close();
		}

	}

//	@Test
//	public void test01() throws IOException {
//		// 1����ȡsqlSessionFactory����
//		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
//		// 2����ȡsqlSession����
//		SqlSession openSession = sqlSessionFactory.openSession();
//		try {
//			// 3����ȡ�ӿڵ�ʵ�������
//			//��Ϊ�ӿ��Զ��Ĵ���һ��������󣬴������ȥִ����ɾ�Ĳ鷽��
//			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
//			Employee employee = mapper.getEmpById(1);
//			System.out.println(mapper.getClass());
//			System.out.println(employee);
//		} finally {
//			openSession.close();
//		}
//	}
	
	
}
