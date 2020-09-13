package com.web.array;

import java.util.Arrays;

public class RearrangeArray {

	public static void main(String[] args) {
//		[-1, 2, -3, 4, 5, 6, -7, 8, 9]
		int arr[]= {-1, 2, -3, 4, 5, 6, -7, 8, 9};
//		seperatePositiveAndNegativeNos(arr);
		System.out.println("input "+Arrays.toString(arr));
		seperatePositiveAndNegativeNos(arr);
//		arrangeNegativeThenPositive(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void seperatePositiveAndNegativeNos(int arr[]) {
//		Arrays.sort(arr);
//		int i=0;
//		for(i=0;i<arr.length;i++) {
//			if(arr[i]>0) break;
//		}
		
		 int i = -1, temp = 0; 
	        for (int j = 0; j < arr.length; j++) 
	        { 
	            if (arr[j] < 0) 
	            { 
	                i++; 
	                temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	        
		int pos=i+1;
		for(int j=0;j<arr.length;j=j+2) {
			if(arr[j]<0) {
				temp=arr[j];
				arr[j]=arr[pos];
				arr[pos]=temp;
				pos++;
			}
		}
	}
	
	private static void arrangeNegativeThenPositive(int arr[]) {
		int neg=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp=arr[i];
				int j;
				for(j=i;j>neg;j--) {
					int temp1=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp1;
				}
				arr[neg]=temp;
				neg++;
			}
		}
	}

}
