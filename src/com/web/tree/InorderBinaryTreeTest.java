package com.web.tree;


class InorderBinaryTree{
	Node root;
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=this.right=null;
		}
	}
	
	public void insert() {
		
		root=new Node(5);
		root.left=new Node(4);
		root.right=new Node(3);
		root.left.left=new Node(6);
		root.left.right=new Node(1);
	}
	
	public void inorderPrint(Node tmp) {
		if(tmp!=null) {
			inorderPrint(tmp.left);
			System.out.print(tmp.data+" ");
			inorderPrint(tmp.right);
		}
	}
	
	public void preorderPrint(Node tmp) {
		if(tmp!=null) {
			System.out.print(tmp.data+" ");
			preorderPrint(tmp.left);
			preorderPrint(tmp.right);
		}
	}
	public void postorderPrint(Node tmp) {
		if(tmp!=null) {
			postorderPrint(tmp.left);
			postorderPrint(tmp.right);
			System.out.print(tmp.data+" ");
		}
	}
}
public class InorderBinaryTreeTest {

	public static void main(String[] args) {
// 5 4 3 6 1
//		  Inorder print 6 4 1 5 3 PreOrder Print 5 4 6 1 3 Post Order Print 6 1 4 3 5
		InorderBinaryTree bt = new InorderBinaryTree();
		bt.insert();
		System.out.println("Inorder print ");
		bt.inorderPrint(bt.root);
		System.out.println("\nPreOrder Print ");
		bt.preorderPrint(bt.root);
		System.out.println("\nPost Order Print");
		bt.postorderPrint(bt.root);
	}

}
