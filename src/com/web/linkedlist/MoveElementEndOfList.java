package com.web.linkedlist;

public class MoveElementEndOfList {
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
		//		Input  : 1 -> 2 -> 2 -> 4 -> 3
		//      key = 2 
		//      Output : 1 -> 4 -> 3 -> 2 -> 2
		MoveElementEndOfList nt = new MoveElementEndOfList();
		nt.push(1);
		nt.push(2);
		nt.push(2);
		nt.push(4);
		nt.push(3);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.moveElement(2));
	}
	
	private Node moveElement(int k) {
		Node tail=head;
		while(tail.next!=null)
			tail=tail.next;
		
		Node curr=head;
		Node prev=null;
		Node tailLast=tail;
		while(curr!=tail) {
			if(curr.data==k) {
				prev.next=prev.next.next;
				tailLast.next=curr;
				tailLast=tailLast.next;
				curr=prev;
			}else {
				prev=curr;
			}
			curr=curr.next;
		}
		if(tailLast!=null) {
			tailLast.next=null;
		}
		return head;
	}
}
