package com.code.algorithm;

import java.util.Hashtable;


class Node {
	Node next = null;
	int data;
	public Node(int data){this.data = data;}
}

//链表的基本操作，自己封装了一个链表类，其名为MyLinkedList
class MyLinkedList{
	Node head = null;
	
	//插入数据
	public void addNode(int data){
		Node newNode = new Node(data);
		//可以理解：空链表，新建的作为head
		if(head == null){
			head = newNode;
			return ;
		}
		//可以理解：head作为当前节点，开始遍历，直达tmp.next == null
		Node tmp = head;
		while(tmp.next != null){
			tmp = tmp.next;
		}
		//可以理解：插入到最末尾
		tmp.next = newNode;
	}
	
	//计算链表的长度
	public int nodeLength(){
		Node tmp = head;
		int a = 0 ;
		while(tmp != null){
			a += 1;
			tmp = tmp.next;
		}
		return a;
	}
	
	//删除链表的节点
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
	
	//显示链表数据
	public void printList(){
		System.out.println("aaaaa");
		Node tmp = head;
		int a = 0 ;
		//注意比较条件
//		while(tmp.next != null){
		while(tmp != null){
			a += 1;
			System.out.println(a +" ： "+tmp.data);
			tmp = tmp.next;
		}
	}
	
	//链表排序
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
	//封装
	public void  deleteDuplicateData(){
		Node curNode = head;
		deleteData(curNode);
	}
	//删除重复，使用了hashtable，map接口的一个实现，特点是：
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
