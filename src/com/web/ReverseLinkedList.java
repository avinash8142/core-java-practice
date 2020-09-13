package com.web;

public class ReverseLinkedList {

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
		{
			head=node;
		}else
		{
			Node tmp=head;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.next=node;
		}
	}
	
	public void print(Node tmp)
	{
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	public void reverse()
	{
		Node prev=null;
		Node cur=head;
		Node nxt;
		while(cur!=null)
		{
			nxt=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nxt;
		}
		print(prev);
	}
	public static void main(String[] args) {
		ReverseLinkedList rv = new ReverseLinkedList();
		rv.append(5);
		rv.append(10);
		rv.append(15);
		rv.append(20);	
		rv.append(25);
		rv.print(rv.head);
		System.out.println("reverse linked list");
		rv.reverse();
	}

}
