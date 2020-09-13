package com.web.tree;

public class ConstructBSTPreorder {
int index=0;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
	public Node bstUtil(int pre[],int low,int high,int size) {
		
		if(index>size|| low>high) {
			return null;
		}
		
		Node root = new Node(pre[index]);
		index++;
		
		if(low==high) {
			return root;
		}
		int i;
		for(i=low;i<=high;i++) {
			if(pre[i]>root.data)
				break;
		}
		
		root.left=bstUtil(pre,index,i-1,size);
		root.right=bstUtil(pre, i, high, size);
		
		return root;
		
		
		
	}
	public static void main(String[] args) {
		int[] arr={10, 5, 1, 7, 40, 50};
		ConstructBSTPreorder bst = new ConstructBSTPreorder();
		Node node = bst.bstUtil(arr, 0, arr.length-1, arr.length);

	}

}
