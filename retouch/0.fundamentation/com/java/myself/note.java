package com.java.myself;
/*
ע�͵����ã�
	A:����˵��������߳�����Ķ���
	B:���԰������ǵ��Գ���
*/
public class note {
	public static void main(String[] arg) {
		System.out.println("HelloWorld");		
		KeyWord key = new KeyWord();
		Name name = new Name();
		
		key.outputWord();
		
		name.return_allow = true;
		if (name.return_allow == true){
			String c = name.return_Name("tomorrow ");
			System.out.println(c);			
		}			
	}
}

/*
�ؼ��֣���Java���Ը����ض�����ĵ���

�ؼ��ֵ��ص㣺�ؼ��ֶ���Сд��

�ؼ���ע������
	A:goto��const��Ϊ�����ִ���,Ŀǰ����ʹ��
	B:����Editplus�����ĸ߼����±�,��Թؼ������������ɫ��ǣ��ǳ�ֱ��
*/
class KeyWord {
	public static void outputWord(){
		System.out.println("static"+" public "+"class"+"methon"+"private"
				+"string int float long double boolean char short '\n'");
	}
}
/*
��ʶ�������Ǹ���,�ӿ�,����,������������ʱʹ�õ��ַ�����(�ַ���)

��ɹ���
	A:Ӣ����ĸ��Сд
	B:����
	C:_��$

ע�����
	A:���������ֿ�ͷ
	B:������Java�еĹؼ���
	C:���ִ�Сд
		Student,student ������������

�������������򣺼���֪��
	A:�� ��ʵ�����ļ���,���ڽ����ͬ��������
		ȫ��Сд
		������com
		�༶��cn.itcast

	B:����߽ӿ�
		һ�����ʣ�����ĸ��д
			Student,Person,Teacher
		������ʣ�ÿ�����ʵ�����ĸ��д
			HelloWorld,MyName,NameDemo

	C:�������߱���
		һ�����ʣ�ȫ��Сд
			name,age,show()
		������ʣ��ӵڶ������ʿ�ʼ��ÿ����������ĸ��д
			myName,showAllStudentNames()

	D:����
		һ�����ʣ�ȫ����д
			AGE
		������ʣ�ÿ�����ʶ���д����_����
			STUDENT_MAX_AGE
*/
class  Name {
	boolean return_allow = false;
	public static String return_Name(String a){
		String b = a + "will be better.";
		return b;
	}
}
