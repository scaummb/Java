package com.colection;
/*
 * Ϊʲô���ּ�����?
 * 		����������Զ���������ֶ����Զ������ʽ������Ϊ�˷���Զ������Ĳ�������ǰ����ѧ֪ʶ������ֻ�ܲ��ö�������ʵ�֡�
 * 		���ǣ���������ĳ������ǹ̶��ģ���Ӧ���˱仯���������ԣ�java���ṩ�˼����๩����ʹ�á�
 * 
 * ��������ص㣺
 * 		A:���ȿɱ�
 * 		B:ֻ�ܴ洢����
 * 		C:���Դ洢��ͬ���͵Ķ���
 * 
 * �����⣺����ͼ��ϵ�����?
 * 		A:���ϳ��ȿɱ䣻����ֻ�ܴ洢�����������ͣ����Ͽ��Դ洢��ͬ�������͵�Ԫ��
 * 		B:���鳤�ȹ̶���������Դ洢�����������ͣ�Ҳ���Դ洢�����������ͣ�����洢����ͬһ���������͵�Ԫ��
 * 
 * �������ǵĹ�������̫һ�������ԣ�java���ṩ�˶��ּ����๩����ʹ�á���Щ������ı���������ʵ�ǵײ�����ݽṹ��ͬ��
 * ���ݽṹ�����ݵĴ洢��ʽ��
 * 
 * Collection�Ĺ��ܣ�
 * A:��ӹ���
 * 		boolean add(Object obj):�����������һ��Ԫ��
 * 		boolean addAll(Collection c):����������Ӷ��Ԫ�ء�
 * B:��ȡ����
 * 		Iterator iterator():������
 * 		int size():���ϵ�Ԫ�ظ���������
 * C:ɾ������
 * 		void clear():��ռ��ϵ�����Ԫ��
 * 		boolean remove(Object obj):�Ӽ������Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ӽ������Ƴ����Ԫ��
 * D:�жϹ���
 * 		boolean contains(Object obj):�жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c):�жϼ������Ƿ����ָ���Ķ��Ԫ��
 * 		boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * E:����Ԫ��
 * 		boolean retainAll(Collection c)
 * F:ת����
 * 		Object[] toArray():�Ѽ���ת�ɶ�������
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
//		����ʵ�������� Collection
//		Collection c = new Collection();
		Collection v = new ArrayList();
		
		// boolean add(Object obj):�����������һ��Ԫ��
		//warnning:���Ͱ�ȫ������ add��Object������ԭʼ���� Collection��
		//Ӧ�ý���ͨ������ Collection<E> �����ò�����
		v.add("hello");
		v.add("world");
		v.add("java");
		
		System.out.println("size: "+v.size());
		System.out.println("v:"+v);
				
		// boolean remove(Object obj):�Ӽ������Ƴ�һ��Ԫ��
		v.remove("java");
		
		// boolean contains(Object obj):�жϼ������Ƿ����ָ����Ԫ��
		System.out.println("contains hello: " + v.contains("hello"));
		System.out.println("contains javaee: " + v.contains("javaee"));
		
		// void clear():��ռ��ϵ�����Ԫ��
		System.out.println("after clear..");
		v.clear();

		// boolean isEmpty():�жϼ����Ƿ�Ϊ��
		System.out.println("isEmpty : "+v.isEmpty());
		
		System.out.println("size: "+v.size());
		System.out.println("v:"+v);
	}

}
