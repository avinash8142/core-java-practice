package com.web;

public class ReverseNumberInPair {

	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void append(int data)
	{
		Node node=new Node(data);
		if(head==null)
			head=node;
		else
		{
			Node tmp=head;
			while(tmp.next!=null)
				tmp=tmp.next;
			tmp.next=node;
		}
	}
	
	public void print()
	{
		Node tmp=head;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	
	public void reversePair()
	{
		Node tmp=head;
		
		while(tmp!=null && tmp.next!=null)
		{
			int k=tmp.data;
			tmp.data=tmp.next.data;
			tmp.next.data=k;
			tmp=tmp.next.next;
		}
		
		print();
	}
	public static void main(String[] args) {
ReverseNumberInPair rv = new ReverseNumberInPair();
rv.append(5);
rv.append(10);
rv.append(15);
rv.append(20);
rv.append(25);
rv.print();
rv.reversePair();
	}

}
