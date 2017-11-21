package com.code.algorithm;

import java.util.Hashtable;


class Node {
	Node next = null;
	int data;
	public Node(int data){this.data = data;}
}

//����Ļ����������Լ���װ��һ�������࣬����ΪMyLinkedList
class MyLinkedList{
	Node head = null;
	
	//��������
	public void addNode(int data){
		Node newNode = new Node(data);
		//������⣺�������½�����Ϊhead
		if(head == null){
			head = newNode;
			return ;
		}
		//������⣺head��Ϊ��ǰ�ڵ㣬��ʼ������ֱ��tmp.next == null
		Node tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		//������⣺���뵽��ĩβ
		tmp.next = newNode;
	}
	
	//��������ĳ���
	public int nodeLength(){
		Node tmp = head;
		int a = 0 ;
		while(tmp != null){
			a += 1;
			tmp = tmp.next;
		}
		return a;
	}
	
	//ɾ������Ľڵ�
	public boolean deleteNode(int index){
		Node tmp = head;
		while (index<1 || index > nodeLength()){
			return false;
		}
		if(index == 1){
			head = head.next;
			return true;
		}
		int i = 2;
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode != null){
			if(i == index){
				preNode.next = curNode.next;
				return true;
			}
			preNode = curNode;
			curNode = curNode.next;
			i++;
		}
		return true;
	}
	
	//��ʾ��������
	public void printList(){
		System.out.println("aaaaa");
		Node tmp = head;
		int a = 0 ;
		//ע��Ƚ�����
//		while(tmp.next != null){
		while(tmp != null){
			a += 1;
			System.out.println(a +" �� "+tmp.data);
			tmp = tmp.next;
		}
	}
	
	//��������
	public Node orderList(){
		Node nextNode = null;
		int temp = 0;
		Node curNode = head;
		while(curNode != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(curNode.data > nextNode.data){
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}
	//��װ
	public void  deleteDuplicateData(){
		Node curNode = head;
		deleteData(curNode);
	}
	//ɾ���ظ���ʹ����hashtable��map�ӿڵ�һ��ʵ�֣��ص��ǣ�
	public void deleteData(Node head){
		Hashtable <Integer,Integer> table = new Hashtable<Integer,Integer>();
		Node tmp = head;
		Node pre = null;
		while(tmp != null){
			if(table.containsKey(tmp. data)){
				pre.next = tmp.next;
			}else{
				table.put(tmp. data, 1);
				pre = tmp;
			}
			tmp = tmp. next;
		}
	}
}


public class NodeDeleteData {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addNode(88);
		list.addNode(8);
		list.addNode(888);
		list.addNode(88888);
		list.addNode(888);
		list.addNode(8);
		list.addNode(8435);
		list.addNode(8435);
		list.printList();
//		System.out.println("list.toString():" + list.toString());
		System.out.println("------------");
		list.deleteNode(4);
		list.orderList();
		list.printList();		
		System.out.println("------------");
		list.deleteDuplicateData();
		list.printList();
	}

}
