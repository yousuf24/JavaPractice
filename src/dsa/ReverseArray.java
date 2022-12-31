package dsa;

import java.util.Arrays;

public class ReverseArray {
	public static int getPartitionIndex(int[] arr,int st,int en) {
		int pointer=st-1;
		
		int pivot=arr[en];//keeping right most as pivot
		for(int i=st;i<en;i++) {
			if(arr[i]<pivot) {
				pointer++;
				int temp=arr[pointer];
				arr[pointer]=arr[i];
				arr[i]=temp;
				
			}
			
		}
		int temp=arr[pointer+1];		
		arr[pointer+1]=pivot;
		arr[en]=temp;
		
		
		return pointer+1;
	}
	
	public static void quickSort(int[] arr, int st,int en) {
		if(st>=en)return;//nothing when element<2 in the array which is base condition here
		int p_index=getPartitionIndex(arr,st,en);//get the pivot at correct index ; By the end of each iteration the pivot will be at correct position
		
		quickSort(arr,st,p_index-1);//sorting to left of pivot
		quickSort(arr,p_index+1,en);//sorting to right of pivot
	}

	public static void main(String[] args) {
		int[] arr= {3,4,8,9,2,1};int len=arr.length;
		System.out.println(Arrays.toString(arr));
		int[] arr_N=new int[arr.length+1];
		
		//quickSort select pivot, place element smaller by incrementing pointer to the left and larger to the right and recursive call
		//Choose pivot for efficiency
		int[] arr2= {7, 9, 1, 2, 10, 15, 6};
		quickSort(arr2,0,arr2.length-1);
		System.out.println(Arrays.toString(arr2));
		
		//How to swap two elements in an array
		/*int n1=8,n2=1;
		for(int i=0;i<len;i++) {
			if(arr[i]==n1)arr[i]=n2;
			else if(arr[i]==n2)arr[i]=n1;
		}System.out.println(Arrays.toString(arr));*/
		
		//add element in between
		int num=5,index=3;
		/*
		System.arraycopy(arr, 0, arr_N, 0, index);
		arr_N[index]=num;
		System.arraycopy(arr, index, arr_N, index+1, arr.length-index);
		System.out.println(Arrays.toString(arr_N));
		int k=0;
		for(int i=0;i<len;i++) {
			if(i!=index)arr_N[k++]=arr[i];
			else arr_N[k++]=num;
		}
		System.out.println(Arrays.toString(arr_N));*/
		
		
		
		
		

	}

}
