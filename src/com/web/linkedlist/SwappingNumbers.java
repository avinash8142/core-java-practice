package com.web.linkedlist;


public class SwappingNumbers {
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
		SwappingNumbers nt = new SwappingNumbers();
		nt.push(1);
		nt.push(2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(6);
		nt.push(7);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.pairWiseSwap(nt.head));
	}

	Node pairWiseSwap(Node node) 
    { 
  
        // Base Case: The list is empty or has only one node 
        if (node == null || node.next == null) { 
            return node; 
        } 
  
        // Store head of list after two nodes 
        Node remaing = node.next.next; 
  
        // Change head 
        Node newhead = node.next; 
  
        // Change next of second node 
        node.next.next = node; 
  
        // Recur for remaining list and change next of head 
        node.next = pairWiseSwap(remaing); 
  
        // Return new head of modified list 
        return newhead; 
    } 
}
