package com.web.linkedlist;

import com.web.linkedlist.SwapTwoNumbersList.Node;

public class DeleteMAfterNNode {
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
		DeleteMAfterNNode nt = new DeleteMAfterNNode();
		nt.push(1);
		nt.push(2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(6);
		nt.push(7);
		nt.push(8);
		nt.print(nt.head);
		System.out.println();
	}
}
