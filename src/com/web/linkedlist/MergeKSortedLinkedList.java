package com.web.linkedlist;

public class MergeKSortedLinkedList {
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
//		list1 = 1->3->5->7->NULL
//				list2 = 2->4->6->8->NULL
//				list3 = 0->9->10->11->NULL
		MergeKSortedLinkedList nt = new MergeKSortedLinkedList();
		Node head1 = nt.new Node(1);
		nt.push(head1,3);
		nt.push(head1,5);
		nt.push(head1,7);
		nt.print(head1);
		System.out.println();
		MergeKSortedLinkedList nt1 = new MergeKSortedLinkedList();
		Node head2 = nt.new Node(2);
		nt1.push(head2,4);
		nt1.push(head2,6);
		nt1.push(head2,8);
		nt.print(head2);
		System.out.println();
		MergeKSortedLinkedList nt2 = new MergeKSortedLinkedList();
		Node head3 = nt.new Node(0);
		nt2.push(head3,9);
		nt2.push(head3,10);
		nt2.push(head3,11);
		nt.print(head3);
		System.out.println();
		nt.print(nt.mergeKSortedLinkedList(head1, head2, head3));
	}
	
	private Node mergeKSortedLinkedList(Node head1,Node head2,Node head3) {
		Node res=null;
		Node prev=null;
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				if(res==null) {
					res=head1;
					prev=res;
					head1=head1.next;
				}else {
					prev.next=head1;
					prev=prev.next;
					head1=head1.next;
					
				}
			}else {
				if(res==null) {
					res=head2;
					prev=res;
					head2=head2.next;
				}else {
					prev.next=head2;
					prev=prev.next;
					head2=head2.next;
				}
			}
		}
		if(head1!=null)
			prev.next=head1;
		
		if(head2!=null)
			prev.next=head2;
		
		Node result=null;
		 prev=null;
		while(res!=null && head3!=null) {
			if(res.data<head3.data) {
				if(result==null) {
					result=res;
					prev=result;
					res=res.next;
				}else {
					prev.next=res;
					prev=prev.next;
					res=res.next;
					
				}
			}else {
				if(result==null) {
					result=head3;
					prev=result;
					head3=head3.next;
				}else {
					prev.next=head3;
					prev=prev.next;
					head3=head3.next;
				}
			}
		}
		if(res!=null)
			prev.next=res;
		
		if(head3!=null)
			prev.next=head3;
		return result;
	}
}
