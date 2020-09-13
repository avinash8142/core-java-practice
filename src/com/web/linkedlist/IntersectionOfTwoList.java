package com.web.linkedlist;

public class IntersectionOfTwoList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node push(Node node,Node head) {
			Node temp=head;
			if(head==null) {
				head=node;
			}else {
			while(temp.next!=null)
				temp=temp.next;
			}
			
			temp.next=node;
		return head;
	}
	
	public void print(Node temp) {
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		IntersectionOfTwoList nt = new IntersectionOfTwoList();
		Node head=nt.new Node(1);
		nt.push(nt.new Node(2),head);
		nt.push(nt.new Node(3),head);
		nt.push(nt.new Node(4),head);
		nt.push(nt.new Node(6),head);
		nt.print(head);
		System.out.println();
		Node head2=nt.new Node(2);
		nt.push(nt.new Node(4),head2);
		nt.push(nt.new Node(6),head2);
		nt.push(nt.new Node(8),head2);
		nt.print(head2);
		System.out.println();
		nt.print(nt.intersectionOfTwoList(head, head2));
	}
	
	private Node intersectionOfTwoList(Node head1,Node head2) {
		Node head=null;
		while(head1!=null && head2!=null) {
			if(head1.data==head2.data) {
				if(head==null) {
					head=new Node(head1.data);
				}else {
					Node temp=head;
					while(temp.next!=null)
						temp=temp.next;
					
					temp.next=new Node(head1.data);
					
				}
				head1=head1.next;
				head2=head2.next;
			}else if(head1.data<head2.data) {
				head1=head1.next;
			}else if(head1.data>head2.data) {
				head2=head2.next;
			}
		}
		return head;
	}

}
