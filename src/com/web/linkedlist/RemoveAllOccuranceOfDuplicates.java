package com.web.linkedlist;

public class RemoveAllOccuranceOfDuplicates {
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
//		Input : 23->28->28->35->49->49->53->53
//		Output : 23->35
		RemoveAllOccuranceOfDuplicates nt = new RemoveAllOccuranceOfDuplicates();
		nt.push(23);
		nt.push(28);
		nt.push(28);
		nt.push(35);
		nt.push(49);
		nt.push(49);
		nt.push(53);
		nt.push(53);
		nt.print(nt.head);
		System.out.println();
		nt.removeAllDuplicates();
	}
	
	public void removeAllDuplicates() 
	{ 
	      
	    // Create a dummy node that acts like a fake 
	    // head of list pointing to the original head 
	    Node dummy = new Node(0); 
	  
	    // Dummy node points to the original head 
	    dummy.next = head; 
	    Node prev = dummy; 
	    Node current = head; 
	  
	    while (current != null) 
	    { 
	        // Until the current and previous values 
	        // are same, keep updating current  
	        while (current.next != null && 
	               prev.next.data == current.next.data) 
	               current = current.next; 
	  
	        // If current has unique value i.e current 
	        // is not updated, Move the prev pointer 
	        // to next node 
	        if (prev.next == current) 
	            prev = prev.next; 
	  
	        // When current is updated to the last 
	        // duplicate value of that segment, make 
	        // prev the next of current*/ 
	        else
	            prev.next = current.next; 
	  
	        current = current.next; 
	    } 
	  
	    // Update original head to the next of dummy 
	    // node  
	    head = dummy.next; 
	} 
}
