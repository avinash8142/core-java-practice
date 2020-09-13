package com.web.linkedlist;

public class PartitionListAroundValue {
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
		//		1->4->3->2->5->2->3
		//		x = 3
		//		Output: 1->2->2->3->3->4->5
		PartitionListAroundValue nt = new PartitionListAroundValue();
		nt.push(1);
		nt.push(4);
		nt.push(3);
		nt.push(2);
		nt.push(5);
		nt.push(2);
		nt.push(3);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.partitionListAroundValue(3));
	}
	
	private Node partitionListAroundValue(int k) {
		Node smallerHead=null,smallerLast=null;
		Node equalHead=null,equalLast=null;
		Node greaterHead=null,greaterLast=null;
		Node curr=head;
		while(curr!=null) {
			if(curr.data<k) {
				if(smallerHead==null) {
					smallerHead=curr;
					smallerLast=smallerHead;
				}else {
					smallerLast.next=curr;
					smallerLast=smallerLast.next;
				}
			}else if(curr.data==k) {
				if(equalHead==null) {
					equalHead=curr;
					equalLast=equalHead;
				}else {
					equalLast.next=curr;
					equalLast=equalLast.next;
				}
			}else {
				if(greaterHead==null) {
					greaterHead=curr;
					greaterLast=greaterHead;
				}else {
					greaterLast.next=curr;
					greaterLast=greaterLast.next;
				}
			}
			curr=curr.next;
		}
		if(greaterLast!=null) {
			greaterLast.next=null;
		}
		if(smallerLast!=null) {
			smallerLast.next=equalHead;
		}
		if(greaterHead!=null && equalLast!=null) {
			equalLast.next=greaterHead;
		}
		return smallerHead;
	}
}
