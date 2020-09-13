package com.web.linkedlist;

public class QuickSortList {
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
		QuickSortList nt = new QuickSortList();
		nt.push(40);
		nt.push(20);
		nt.push(60);
		nt.push(10);
		nt.push(50);
		nt.push(30);
		nt.print(nt.head);
		System.out.println();
		Node end=nt.head;
		while(end.next!=null)
			end=end.next;
		
		nt.sort(nt.head, end);
		nt.print(nt.head);
	}
	
	// takes first and last node, 
	// but do not break any links in  
	// the whole linked list 
	Node paritionLast(Node start, Node end) 
	{ 
	    if(start == end ||  
	       start == null || end == null) 
	        return start; 
	  
	    Node pivot_prev = start; 
	    Node curr = start;  
	    int pivot = end.data;  
	      
	    // iterate till one before the end,  
	    // no need to iterate till the end  
	    // because end is pivot 
	    while(start != end ) 
	    { 
	        if(start.data < pivot) 
	        {  
	            // keep tracks of last modified item 
	            pivot_prev = curr;  
	            int temp = curr.data;  
	            curr.data = start.data;  
	            start.data = temp;  
	            curr = curr.next;  
	        } 
	        start = start.next;  
	    } 
	      
	    // swap the position of curr i.e. 
	    // next suitable index and pivot 
	    int temp = curr.data;  
	    curr.data = pivot;  
	    end.data = temp;  
	  
	    // return one previous to current 
	    // because current is now pointing to pivot 
	    return pivot_prev; 
	} 
	  
	void sort(Node start, Node end) 
	{ 
	    if(start == end ) 
	        return; 
	          
	    // split list and partion recurse 
	    Node pivot_prev = paritionLast(start, end); 
	    sort(start, pivot_prev); 
	      
	    // if pivot is picked and moved to the start, 
	    // that means start and pivot is same  
	    // so pick from next of pivot 
	    if( pivot_prev != null &&  
	        pivot_prev == start ) 
	        sort(pivot_prev.next, end); 
	          
	    // if pivot is in between of the list, 
	    // start from next of pivot,  
	    // since we have pivot_prev, so we move two nodes 
	    else if(pivot_prev != null &&  
	            pivot_prev.next != null) 
	        sort(pivot_prev.next.next, end); 
	} 
}
