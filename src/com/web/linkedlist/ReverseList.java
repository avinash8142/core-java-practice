package com.web.linkedlist;

public class ReverseList {
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
		ReverseList nt = new ReverseList();
		nt.push(1);
		nt.push(2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(6);
		nt.print(nt.head);
		System.out.println();
		/*
		 * nt.print(nt.reverseList(nt.head)); System.out.println();
		 */
//		nt.print(nt.reverseRecursive(nt.head));
		
//		nt.print(nt.reverse2(nt.head, null));
		nt.reverse3(nt.head);
		
	}
//	Method 1
	private Node reverseList(Node node) {
		Node prev=null;
		Node curr=node;
		Node next=node.next;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
//	Method 2
	private Node reverseRecursive(Node head) {
		 if (head == null || head.next == null)  
	            return head;  
	  
	        /* reverse the rest list and put  
	        the first element at the end */
	        Node rest = reverseRecursive(head.next);  
	        head.next.next = head;  
	  
	        /* tricky step -- see the diagram */
	        head.next = null;  
	  
	        /* fix the head pointer */
	        return rest; 
	}
//	Method 3
	private Node reverse2(Node curr,Node prev) {
		if(curr.next==null) {
			head=curr;
			curr.next=prev;
			return head;
		}
		
		Node temp=curr.next;
		curr.next=prev;
		reverse2(temp, curr);
		return head;
	}
	
//	Method 4
	private void reverse3(Node node) {
		if(node==null)
			return;
		reverse3(node.next);
		System.out.print(node.data+" ");
	}
}
