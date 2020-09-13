package com.web.array;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
public static void main(String[] args) {
//	Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//	Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
	int arr[]= {1, 2, 0, 4, 3, 0, 5, 0};
	System.out.println("input "+Arrays.toString(arr));
//	moveAllZeroAtEnd(arr);
//	moveAllZeroAtEndMaintainOrder(arr);
	moveAllZeroAtEndSingleTraversal(arr);
	System.out.println(Arrays.toString(arr));
}

//input order is not maintaining
private static void moveAllZeroAtEnd(int arr[]) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		if(arr[i]!=0) {
			i++;
		}else if(arr[j]==0) {
			j--;
		}else {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	System.out.println(Arrays.toString(arr));
}
//move all zeroes at the end of array in two traversal
private static void moveAllZeroAtEndMaintainOrder(int arr[]) {
	int i=0;
	int count=0;
	while(i<arr.length) {
		if(arr[i]!=0)
		{
			arr[count++]=arr[i];
		}
		i++;
	}
	
	while(count<arr.length) {
		arr[count++]=0;
	}

}

private static void moveAllZeroAtEndSingleTraversal(int arr[]) {
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
