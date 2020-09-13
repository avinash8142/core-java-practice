package com.web;

public class QueueUsingLinkedList {

	Node front;
	Node rear;
	
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
	
	
	public void enqueue(int data)
	{
		Node node = new Node(data);
		if(rear==null)
		{
			rear=node;
			front=rear;
		}else
		{
			rear.next=node;
			rear=node;
		}
	}
	
	public int dequeue()
	{
		if(front==null)
		{
			System.out.println("queue is empty");
			front=rear=null;
			return -1;
		}else
		{
			Node tmp=front;
			front=front.next;
			return tmp.data;
		}
	}
	public static void main(String[] args) {
		
QueueUsingLinkedList qu = new QueueUsingLinkedList();
qu.enqueue(5);
qu.enqueue(10);
System.out.println(qu.dequeue());
System.out.println(qu.dequeue());
System.out.println(qu.dequeue());
qu.enqueue(15);
System.out.println(qu.dequeue());
	}

}
