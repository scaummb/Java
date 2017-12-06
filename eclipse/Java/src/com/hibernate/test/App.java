package com.hibernate.test;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public void testHello(){
		// ����
		Employee emp = new Employee();
//		emp.setWorkDate(null);
		
        // ��ȡ���������ļ��Ĺ��������
        Configuration config = new Configuration();
        config.configure();  // Ĭ�ϼ���src/hibenrate.cfg.xml�ļ�
        // ����session�Ĺ�������
        SessionFactory sf = config.buildSessionFactory();
        // ����session (����һ���Ự�������ݿ����ӵĻỰ)
        Session session = sf.openSession();
        // ��������
        Transaction tx = session.beginTransaction();
        //����-���ݿ�
        session.save(emp);
        // �ύ����
        tx.commit();
        // �ر�
        session.close();
        sf.close();
	}
}
