package com.web.linkedlist;

public class GenericList<T> {
	Node head;
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data=data;
			this.next=null;
		}
	}
	
	public  void push(T data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=node;
		}
	}
	
	public void print(Node temp) {
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		GenericList<Integer> nt = new GenericList<>();
		nt.push(10);
		nt.push(15);
		nt.push(12);
		nt.push(13);
		nt.push(20);
		nt.push(14);
		nt.print(nt.head);
		System.out.println();
		GenericList<String> nt1 = new GenericList<>();
		nt1.push("a");
		nt1.push("b");
		nt1.push("d");
		nt1.push("hello");
		nt1.push("Avinash");
		nt1.push("Gaurav");
		nt1.print(nt1.head);
		System.out.println();
	}
}
