package com.web.linkedlist;

public class MoveLastToFirst {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(int data) {
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
		MoveLastToFirst nt = new MoveLastToFirst();
		nt.push(10);
		nt.push(15);
		nt.push(12);
		nt.push(13);
		nt.push(20);
		nt.push(14);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.moveLastToFirst(nt.head));
	}
	
	private Node moveLastToFirst(Node node) {
		Node temp=node;
		Node prev=null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		temp.next=node;
		node=temp;
		return node;
		
	}
}
