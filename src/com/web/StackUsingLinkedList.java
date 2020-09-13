package com.web;

public class StackUsingLinkedList {
	
	Node top;
	
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
	
	public void push(int data)
	{
		
		Node node=new Node(data);
		if(top==null)
			top=node;
		else
		{
			node.next=top;
			top=node;
		}
	}
	
	public int pop()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
			return -1;
		}else
		{
			int old=top.data;
			top=top.next;
			return old;
		}
	}

	public static void main(String[] args) {
		
StackUsingLinkedList st = new StackUsingLinkedList();
st.push(5);
st.push(10);
System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());
st.push(15);
System.out.println(st.pop());
	}

}
