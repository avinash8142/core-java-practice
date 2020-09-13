package com.web.dll;

import com.web.dll.ReverseDll.Node;

public class InsertValueInDll {
	static Node head; 

	static class Node { 

		int data; 
		Node next, prev; 

		Node(int d) { 
			data = d; 
			next = prev = null; 
		} 
	} 


	/* UTILITY FUNCTIONS */
	/* Function to insert a node at the beginning of the Doubly Linked List */
	void push(int new_data) { 
		/* allocate node */
		Node new_node = new Node(new_data); 

		/* since we are adding at the beginning, 
		prev is always NULL */
		new_node.prev = null; 

		/* link the old list off the new node */
		new_node.next = head; 

		/* change prev of head node to new node */
		if (head != null) { 
			head.prev = new_node; 
		} 

		/* move the head to point to the new node */
		head = new_node; 
	} 

	/* Function to print nodes in a given doubly linked list 
	This function is same as printList() of singly linked list */
	void printList(Node node) { 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		InsertValueInDll list = new InsertValueInDll(); 
		 
		list.push(12);
		list.push(10);
		list.push(8); 
		list.push(5); 
		list.push(3); 

		System.out.println("Original linked list "); 
		list.printList(head); 
		System.out.println();
		System.out.println("result ");
		list.printList(list.insertValueInList(9));

	}
	
	private Node insertValueInList(int data) {
		Node curr=head;
		while(curr!=null){
			if(curr.data> data)
				break;
			curr=curr.next;
		}
		
		Node node =new Node(data);
		node.next=curr.prev.next;
		curr.prev.next=node;
		node.prev=curr.prev;
		curr.prev=node;
		return head;
		
		
		
	}
}
