package com.web.linkedlist;

import com.web.linkedlist.SwapTwoNumbersList.Node;

public class ReverseListInGroup {
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
		ReverseListInGroup nt = new ReverseListInGroup();
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
		nt.print(nt.reverse(nt.head, 3));
	}
	
	private Node reverse(Node head,int k) {
		Node current = head; 
	       Node next = null; 
	       Node prev = null; 
	         
	       int count = 0; 
	  
	       /* Reverse first k nodes of linked list */
	       while (count < k && current != null)  
	       { 
	           next = current.next; 
	           current.next = prev; 
	           prev = current; 
	           current = next; 
	           count++; 
	       } 
	  
	       /* next is now a pointer to (k+1)th node  
	          Recursively call for the list starting from current. 
	          And make rest of the list as next of first node */
	       if (next != null)  
	          head.next = reverse(next, k); 
	  
	       // prev is now head of input list 
	       return prev; 
	}
}
