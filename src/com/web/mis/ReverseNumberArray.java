package com.web.mis;

public class ReverseNumberArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		reverse(arr,0);

	}
	
	private static void reverse(int[] arr,int n) {
		if(arr.length==n)
			return;
		reverse(arr,n+1);
		System.out.println("no "+arr[n]);
	}

}
