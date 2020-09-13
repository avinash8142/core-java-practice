package com.web.linkedlist;

import java.util.Stack;

public class ReverseListUsingStack {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void push(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void print(Node temp) {
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		ReverseListUsingStack nt = new ReverseListUsingStack();
		nt.push(1);
		nt.push(2);
		nt.push(3);
		nt.push(4);
		nt.push(5);
		nt.push(6);
		nt.push(7);
		nt.push(8);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.reverse(nt.head, 3));
	}

	private Node reverse(Node node, int k) {
		Node curr = node;
		Stack<Node> st = new Stack<>();
		int count = 0;
		Node head = null;
		Node prev = null;
		while (curr != null) {

			while (curr != null && count < k) {
				st.push(curr);
				curr = curr.next;
				count++;
			}

			while (!st.isEmpty()) {
				if (prev == null) {
					prev = st.pop();
					head = prev;
				} else {
					prev.next = st.pop();
					prev = prev.next;
				}
			}
			count = 0;
		}
//		tricky point
		prev.next = null;
		return head;
	}
}
