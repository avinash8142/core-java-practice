package com.web;

import java.util.Stack;

public class SortStackUsingStack {

	public static Stack<Integer> sortStack(Stack<Integer> st)
	{
		Stack<Integer> tempSt=new Stack<>();
		while(!st.isEmpty())
		{
			int curData=st.pop();

			while(!tempSt.isEmpty() && tempSt.peek()>curData)
			{
				st.push(tempSt.pop());
			}
			
			tempSt.push(curData);
		}
		return tempSt;		
		
	}
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(4);
		st.push(8);
		st.push(10);
		st.push(5);
		st.push(20);
		st.push(15);
		Stack<Integer> rt = sortStack(st);
		System.out.println(rt);
//		System.out.println(st.peek());

	}

}
