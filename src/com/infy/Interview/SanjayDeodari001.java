package com.infy.Interview;

import java.util.*;

public class SanjayDeodari001 {
	public static boolean binSearch(int[] arr,int st,int en,int toS) {
		int mid=(st+en)/2; 
		if(arr[mid]==toS || arr[st]==toS || arr[en]==toS)return true;
		else {
			
			while(en>=st) {
			if(toS<arr[mid])return binSearch(arr,st,mid-1,toS);
			else if(toS>arr[mid])return binSearch(arr,mid+1,en,toS);
		}}
		return false;
	}

	public static void main(String[] args) {
		//Bubble sort
		int[] A= {1,2,3,7,8,9,5,6};int len=A.length;
		Arrays.sort(A);;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(A[j]>A[j+1]) {
					int temp=A[j+1];
					A[j+1]=A[j];
					A[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(A));
		List<Integer> li2=List.of(1,2,4);//immutable list
		
		Integer arr[]={1,2,3,7,8,9,5,6};
		List<Integer> li=Arrays.asList(arr);
		Collections.sort(li);
		System.out.println(li);
		
		//Divide and conquer ; Binary search
		int[] arr2= {12,21,34,45,56,60};// Search for 45
		int toSearch=20,size=arr2.length;
		//Make sure you have DS sorted before u make soln
		boolean result=binSearch(arr2,0,size-1,toSearch);
		System.out.println(result);
			
	}

}
