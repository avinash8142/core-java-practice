package com.web.tree;

import java.util.Stack;

public class TraverseTreeWithoutRecursion {
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
	}

	Node root;

	public void add() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
	}

	public void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.println(root.data);
			printInorder(root.right);
		}
	}

	public void printWithoutRecursion() {
		Stack<Node> st = new Stack<>();
		if (root != null) {
			Node cur = root;
			while (true) {
				while (cur != null) {
					st.push(cur);
					cur = cur.left;
				}
				if (cur == null && !st.isEmpty()) {
					Node ele = st.pop();
					System.out.println(ele.data);
					cur = ele.right;
				}
				if (cur == null && st.isEmpty())
					break;
			}

		}
	}
	
	public void printWithoutRecurAndStack() {
		 if (root == null) 
	            return; 
	  
		 Node current=root;
		 Node pre=null;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;
			} else {
				/* Find the inorder predecessor of current */
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;

				/* Make current as right child of its inorder predecessor */
				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				}

				/*
				 * Revert the changes made in the 'if' part to restore the original tree i.e.,
				 * fix the right child of predecessor
				 */
				else {
					pre.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				} /* End of if condition pre->right == NULL */

			}
		}
	}

	public static void main(String[] args) {
		TraverseTreeWithoutRecursion twr = new TraverseTreeWithoutRecursion();
		twr.add();
//		twr.printInorder(twr.root);
//		twr.printWithoutRecursion();
		twr.printWithoutRecurAndStack();
	}

}
