package com.web.linkedlist;

public class SwappingLinkedList {
	
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
		SwappingLinkedList nt = new SwappingLinkedList();
		nt.push(1);
		nt.push(2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(6);
		nt.push(7);
		nt.print(nt.head);
		System.out.println();
		Node newlyHead = nt.swappingList(nt.head);
		nt.print(newlyHead);
	}
	
	private Node swappingList(Node node) {
		Node prev=node;
		Node curr=prev.next;
		Node newlyHead=curr;
		while(true) {
			Node next=curr.next;
			curr.next=prev;
			if(next==null || next.next==null) {
				prev.next=next;
				return newlyHead;
			}
			
			prev.next=next.next;
			
			prev=next;
			curr=next.next;
		}
	}


}
