package com.web.dll;

public class RotateDll {

	private Node head;
	class Node{
		char data;
		Node next;
		Node prev;
		Node(char data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	private void push(char data) {
		if(head==null) {
			head=new Node(data);
		}else {
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
				
				Node node=new Node(data);
				temp.next=node;
				node.prev=temp;
			}
	}
	
	private void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"  ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		RotateDll obj = new RotateDll();
		obj.push('a');
		obj.push('b');
		obj.push('c');
		obj.push('d');
		obj.push('e');
		obj.push('f');
		obj.push('g');
		obj.push('h');
		System.out.println("Original List ");
		obj.printList();
		obj.rotateList(4);
		System.out.println("\nNew list ");
		obj.printList();
	}
	
	private void rotateList(int k) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			if(count==k) {
				break;
			}
			++count;
			temp=temp.next;
		}
		temp.prev.next=null;
		temp.prev=null;
		Node tail=head;
		head=temp;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=tail;
		tail.prev=temp;
	}
}
