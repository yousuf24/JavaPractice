package com.infy.pp3;

import java.util.*;

public class CeilAndFloor {
	public static boolean bsearch(int[] arr,int low,int high,int num) {
		int mid=(low+high)/2;
		if(arr[mid]==num)return true;
		else if(num>arr[mid])bsearch(arr,mid+1,high,num);
		else bsearch(arr,0,mid-1,num);
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {1,4,6,8,9,7};
		Arrays.sort(arr);//ascending order by default
		
		int num=7,size=arr.length;
		boolean isExist=bsearch(arr,0,size,num);
		System.out.println("isPresent :"+(isExist?1:0));

	}

}

