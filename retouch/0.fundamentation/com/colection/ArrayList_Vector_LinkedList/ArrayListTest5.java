package com.colection.ArrayList_Vector_LinkedList;

import java.util.ArrayList;

/*
 * �����Ĵ�����
 * ��������
 * 		��������Τ������
 * ��¥��
 * 		�ֱ���������������ؿ���
 * ˮ䰴�
 * 		���ɣ�³������ӣ�¬���壬����������
 * ���μ�
 * 		�׹Ǿ���������㣬����գ�ţħ�����캢��
 * 
 * �ҹ����Ĵ�������ÿ���������кܶ�����Խ�ɫ��
 */
public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<String> sgyy = new ArrayList<String>();
		sgyy.add("����");
		sgyy.add("��Τ");
		sgyy.add("����");
		
		ArrayList<String> hlm = new ArrayList<String>();
		hlm.add("�ֱ���");
		hlm.add("������");
		hlm.add("������");
		hlm.add("�ؿ���");
		
		// ˮ䰴�С����
		ArrayList<String> shz = new ArrayList<String>();
		shz.add("����");
		shz.add("³����");
		shz.add("����");
		shz.add("¬����");
		shz.add("����");
		shz.add("����");

		// ���μ�С����
		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("�׹Ǿ�");
		xyj.add("�������");
		xyj.add("�����");
		xyj.add("ţħ��");
		xyj.add("�캢��");
		
		ArrayList<ArrayList<String>> sdmz = new ArrayList<ArrayList<String>>();
		sdmz.add(hlm);
		sdmz.add(xyj);
		sdmz.add(shz);
		sdmz.add(sgyy);
		
		for(int i = 0; i<sdmz.size();i++){
			System.out.println("__________");
			ArrayList<String> temp = sdmz.get(i);
			for(int k = 0; k<temp.size();k++){
				System.out.println(temp.get(k));
			}
		}
		
		// ��������
		for (ArrayList<String> array : sdmz) {
			for (String s : array) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
	}

}
