package com.web.dll;

public class DllUsingSinglePointer {

	private Node head;
	class Node{
		int data;
		Node npx;
		Node(int data){
			this.data=data;
			this.npx=null;
		}
	}
	
	private void push(int data) {
		if(head==null) {
			head=new Node(data);
		}else {
			Node node=new Node(data);
			if(head.npx==null) {
			}
		}
	}
}
