package com.web.linkedlist;

public class SortListOf0And1And2 {
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
		SortListOf0And1And2 nt = new SortListOf0And1And2();
		nt.push(1);
		nt.push(1);
		nt.push(2);
		nt.push(0);
		nt.push(2);
		nt.push(0);
		nt.push(1);
		nt.print(nt.head);
		System.out.println();
//		nt.print(nt.sort(nt.head));
		nt.print(nt.mergeAll0s1sAnd2s(nt.head));
	}
	
	private Node sort(Node node) {
		int count0=0;
		int count1=0;
		int count2=0;
		Node curr=node;
		while(curr!=null) {
			if(curr.data==0)
				count0++;
			else if(curr.data==1)
			count1++;
			else if(curr.data==2)
				count2++;
			curr=curr.next;
		}
		
		curr=node;
		while(curr!=null) {
			if(count0>0) {
				curr.data=0;
				count0--;
			}
			else if(count1>0) {
				curr.data=1;
				count1--;
			}
			else if(count2>0) {
				curr.data=2;
				count2--;
			}
			curr=curr.next;
		}
		return node;
	}
	
	private Node mergeAll0s1sAnd2s(Node node) {
		Node zeroHead=new Node(0);
		Node oneHead=new Node(0);
		Node twoHead=new Node(0);
		
		Node zero=zeroHead;
		Node one=oneHead;
		Node two=twoHead;
		
		while(node!=null) {
			if(node.data==0) {
				zero.next=node;
				zero=zero.next;
			}else if(node.data==1) {
				one.next=node;
				one=one.next;
			}else {
				two.next=node;
				two=two.next;
			}
			node=node.next;
		}
		
		zero.next=oneHead.next;
		one.next=twoHead.next;
		two.next=null;
		return zeroHead.next;
	}
}
