package com_two.xml.jdom;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class TestDemo {

	public static void main(String[] args) throws JDOMException, IOException {
		System.out.println("1111BEGIN..");
		//����һ��org.jdom.input.SAXBuilder����
		SAXBuilder sb = new SAXBuilder();
		//�����ĵ�����doc
		Document doc=sb.build(TestDemo.class.getClassLoader().getResourceAsStream("com_two//xml//jdom//test.xml"));
		//��ȡ��Ԫ��HD
		Element root=doc.getRootElement();
		//��ȡ��Ԫ�ص���������Ϊdisk����Ԫ��
		List list=root.getChildren("disk");
		//��������diskԪ��
		for(int i=0;i<list.size();i++){
			//ȡ�õ�i��diskԪ��
			Element element=(Element )list.get(i);
			//ȡ�õ�i��diskԪ�ص�����ֵ������������ַ�������name��
			String name=element.getAttributeValue("name");
			//ȡ��diskԪ�ص���Ԫ��capacityԪ�ص�����ֵ������������ַ�������capacity��
			String capacity=element.getChildText("capacity");
			//ȡ��diskԪ�ص���Ԫ��directoriesԪ�ص�����ֵ������������ַ�������directories��
			String directories=element.getChildText("directories");
			//ȡ��diskԪ�ص���Ԫ��files������ֵ������������ַ�������files��
			String files=element.getChildText("files");
			
			System.out.println("������Ϣ��");
			System.out.println("�����̷���"+name);
			System.out.println("����������"+capacity);
			System.out.println("Ŀ¼��Ŀ��"+directories);
			System.out.println("�ļ���Ŀ��"+files);
		}
		
	}

}
