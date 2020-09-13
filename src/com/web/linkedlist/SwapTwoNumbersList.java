package com.web.linkedlist;

public class SwapTwoNumbersList {
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
		SwapTwoNumbersList nt = new SwapTwoNumbersList();
		nt.push(10);
		nt.push(15);
		nt.push(12);
		nt.push(13);
		nt.push(20);
		nt.push(14);
		nt.print(nt.head);
		System.out.println();
		Node swap = nt.swap(12, 20, nt.head);
		nt.print(swap);
	}

	private Node swap(int x,int y,Node node) {
		Node nodeX=node;
		Node prevX=null;
		while(nodeX!=null) {
			if(nodeX.data==x) {
				break;
			}
			prevX=nodeX;
			nodeX=nodeX.next;
		}
		Node nodeY=node;
		Node prevY=null;
		while(nodeY!=null) {
			if(nodeY.data==y) {
				break;
			}
			prevY=nodeY;
			nodeY=nodeY.next;
		}
		
		if(nodeX!=null && nodeY!=null) {
			prevX.next=nodeY;
			prevY.next=nodeX;
			
			Node temp=nodeY.next;
			nodeY.next=nodeX.next;
			nodeX.next=temp;
		}
		return node;
		
	}
}
