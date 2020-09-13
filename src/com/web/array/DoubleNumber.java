package com.web.array;

import java.util.Arrays;

public class DoubleNumber {

	public static void main(String[] args) {
//		Input : arr[] = {2, 2, 0, 4, 0, 8}
//	Output : 4 4 8 0 0 0
		int arr[] = {2, 2, 0, 4, 0, 8};
		System.out.println("input "+Arrays.toString(arr));
		doubleNumberMoveZeroAtEnd(arr);
		System.out.println("output "+Arrays.toString(arr));
	}
	
	private static void doubleNumberMoveZeroAtEnd(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0 && arr[i]==arr[i+1]) {
				arr[i]=2*arr[i];
				arr[i+1]=0;
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
	}
}
