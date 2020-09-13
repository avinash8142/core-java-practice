package com.web.linkedlist;

public class SegregateOddEven {
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
//		IP:- 17->15->8->12->10->5->4->1->7->6->NULL
//		OP:- 8->12->10->4->6->17->15->5->1->7->NULL
		SegregateOddEven nt = new SegregateOddEven();
		nt.push(17);
		nt.push(15);
		nt.push(8);
		nt.push(12);
		nt.push(10);
		nt.push(5);
		nt.push(4);
		nt.push(1);
		nt.push(7);
		nt.push(6);
		nt.print(nt.head);
		System.out.println();
		nt.print(nt.segregateEvenOdd(nt.head));
		System.out.println();
		nt.print(nt.segregateEvenOdd2(nt.head));
	}

	private Node segregateEvenOdd(Node node) {
		Node even = null;
		Node evenEnd = null;
		Node odd = null;
		Node oddEnd = null;
		while (node != null) {
			if (node.data % 2 == 0) {
				if (even == null) {
					even = new Node(node.data);
					evenEnd = even;
				} else {
					evenEnd.next = new Node(node.data);
					evenEnd = evenEnd.next;
				}
			} else {
				if (odd == null) {
					odd = new Node(node.data);
					oddEnd = odd;
				} else {
					oddEnd.next = new Node(node.data);
					oddEnd = oddEnd.next;
				}
			}
			node = node.next;
		}
		evenEnd.next = odd;
		return even;

	}

	private Node segregateEvenOdd2(Node node) {
		Node end = node;
		while (end.next != null)
			end = end.next;

		Node start = node;
		Node endStart = end;
		Node prev = null;
		while (start != end) {
			if (start.data % 2 == 1) {
				if (start == node) {
					node = node.next;
					endStart.next = new Node(start.data);
					endStart = endStart.next;

				} else {
					endStart.next = new Node(start.data);
					endStart = endStart.next;
					prev.next = prev.next.next;
				}
			} else {
				prev = start;
			}

			start = start.next;
		}
		return node;
	}
}
