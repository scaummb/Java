package com.datastruct.chainlist;

class Node{
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
}
class MyLinkedList{
	Node head = null;
	/*向链表插入数据
	 * @param d:插入的内容
	 * */
	public void addNode(int d){
		Node newNode = new Node(d);
		if (head == null){
			head = newNode;
			return;
		}
		Node tmp = head;
		while (tmp.next != null){
			tmp = tmp.next;
		}
		//add node to end
		tmp.next = newNode;
	}
	
	/**
	 * @param index :删除第index个节点
	 * @param return: 成功返回turn，失败返回false
	 * */
	public Boolean deletNode(int index){
		if (index < 1 || index > length()){
			return false;
		}
		//delet the first param in the chainlist
		if(index == 1){
			head = head.next;
			return true;
		}
		int i = 2;
		Node preNode = head;
		Node curNode  = preNode.next;
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
	
	/**
	 * @return : 返回结点的长度
	 * */
	public int length(){
		int length = 0;
		Node tmp = head;
		while(tmp != null ){
			length ++;
			tmp = tmp.next;
		}
		return length;
	}
	
	/**
	 * 对链表进行排序
	 * 返回排序后的头结点
	 * */
	public Node orderList(){
		Node nextNode = null;
		int temp = 0;
		Node curNode = head;
		while(curNode.next != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(curNode.data > nextNode.data){
					temp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode =  nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;		
	}
	public void printList(){
		Node tmp = head;
		while (tmp != null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
}

public class ChainListTest {
	public static void main(String [] args){
		System.out.println("Begin..");
	}

}
