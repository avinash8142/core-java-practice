package com.web.linkedlist;

public class SortAbsoluteValues {
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
//		0 -> 1 -> -2 -> 3 -> 4 -> 5 -> -5
		SortAbsoluteValues nt = new SortAbsoluteValues();
		nt.push(0);
		nt.push(1);
		nt.push(-2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(-5);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.sortAbsoluteValues(nt.head));
	}
	
	private Node sortAbsoluteValues(Node node) {
		Node curr=node;
		Node prev=null;
		while(curr!=null) {
			if(curr.data<0) {
				prev.next=prev.next.next;
				curr.next=node;
				node=curr;
				curr=prev;
			}else {
				prev=curr;
			}
			curr=curr.next;
		}
		
		return node;
	}
}
