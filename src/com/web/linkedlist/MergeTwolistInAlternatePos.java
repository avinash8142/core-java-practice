package com.web.linkedlist;

public class MergeTwolistInAlternatePos {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(Node list,int data) {
		Node node=new Node(data);
		if(list==null) {
			list=node;
		}else {
			Node temp=list;
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
//		5->7->17->13->11
//		12->10->2->4->6
//		5->12->7->10->17->2->13->4->11->6 
		MergeTwolistInAlternatePos nt = new MergeTwolistInAlternatePos();
		Node head1 = nt.new Node(5);
		nt.push(head1,7);
		nt.push(head1,17);
		nt.push(head1,13);
		nt.push(head1,11);
		nt.print(head1);
		System.out.println();
		MergeTwolistInAlternatePos nt1 = new MergeTwolistInAlternatePos();
		Node head2 = nt.new Node(12);
		nt1.push(head2,10);
		nt1.push(head2,2);
		nt1.push(head2,4);
		nt1.push(head2,6);
		nt.print(head2);
		System.out.println();
		nt.print(nt.mergeTwoListInAlternatePosition(head1, head2));
	}
	
	private Node mergeTwoListInAlternatePosition(Node head1,Node head2) {
		Node prevList1=head1;
		Node currList1=head1.next;
		Node prevList2=head2;
		Node currList2=head2.next;
		Node newHead=head1;
		
		while(currList1!=null && currList2!=null) {
			prevList1.next=prevList2;
			prevList2.next=currList1;
			prevList1=currList1;
			currList1=currList1.next;
			prevList2=currList2;
			currList2=currList2.next;
		}
		prevList1.next=prevList2;
		prevList2.next=currList1;
		
		
		return newHead;
	}
}
