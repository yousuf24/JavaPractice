package com.infy.pp0;

import java.util.Arrays;

public class QuickSort {
	//takes one element in an array as pivot and arranges smaller elements to left of it and larger to its right
	
	
	int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
		//swap arr[i+1] and arr[high]/pivot
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		
		
		return i+1;
	}
	
	void sort(int arr[],int low,int high) {
		if(low<high) {
			int pi=partition(arr,low,high);//arr[pi] is at right place
			sort(arr,low,pi-1); //sort element to left of pivot
			sort(arr,pi+1,high);//sort element to right of pivot
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {10,7,2,5,76,19,23};int size=arr.length;
		new QuickSort().sort(arr, 0, size-1);
		System.out.println("sorted Array: ");
		System.out.println(Arrays.toString(arr));
		

	}

}
