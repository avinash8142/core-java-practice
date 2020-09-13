package com.web.linkedlist;

public class MidNodeHeadOfList {
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
		MidNodeHeadOfList nt = new MidNodeHeadOfList();
		nt.push(10);
		nt.push(15);
		nt.push(12);
		nt.push(13);
		nt.push(20);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.midHeadOfList(nt.head));
	}
	
	private Node midHeadOfList(Node temp) {
		Node fast=temp;
		Node slow=temp;
		Node prevSlow=null;
		while(slow!=null && fast.next!=null) {
			fast=fast.next.next;
			prevSlow=slow;
			slow=slow.next;
		}
		prevSlow.next=prevSlow.next.next;
		slow.next=temp;
		temp=slow;
		return temp;
	}	

}
