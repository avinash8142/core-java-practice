package com.web.linkedlist;

public class RotateList {
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
		RotateList nt = new RotateList();
		nt.push(10);
		nt.push(20);
		nt.push(30);
		nt.push(40);
		nt.push(50);
		nt.push(60);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.rotateList(nt.head, 4));
	}
	
	private Node rotateList(Node node, int k) {
		int count=0;
		Node curr=node;
		Node head=null;
		while(count<k-1 && curr!=null) {
			curr=curr.next;
			count++;
		}
		head=curr.next;
		curr.next=null;
		curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=node;
		return head;
	}
}
