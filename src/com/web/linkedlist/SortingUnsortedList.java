package com.web.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SortingUnsortedList {
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
		SortingUnsortedList nt = new SortingUnsortedList();
		nt.push(9);
		nt.push(8);
		nt.push(7);
		nt.push(8);
		nt.push(7);
		nt.push(2);
		nt.push(1);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.sort(nt.head));
	}
	
//	O(n) using hashing
	private Node sort(Node node) {
		Node node1=node;
		Set<Integer> set=new HashSet<>();
		Node prev=null;
		while(node!=null) {
			if(set.contains(node.data)) {
				prev.next=node.next;
			}else {
				prev=node;
				set.add(node.data);
			}
			node=node.next;
		}
		return node1;
		
	}
}
