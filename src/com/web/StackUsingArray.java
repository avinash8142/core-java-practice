package com.web;

public class StackUsingArray {
	
	int[] arr;
	int top;
	public StackUsingArray(int size) {
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int a)
	{
		if(arr.length==top) {
			System.out.println("stack is full");
			return;
		}
		
		top++;
		arr[top]=a;
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("stack is empty ");
			return -1;
		}
		int old=arr[top];
		top--;
		return old;
	}

	public static void main(String[] args) {
//		int[] arr= {1,2,3,4,5,6};
		
StackUsingArray st = new StackUsingArray(10);
st.push(5);
st.push(10);
System.out.println(st.pop());
System.out.println(st.pop());
System.out.println(st.pop());
	}

}
