package com.infy.pp0;

import java.util.Arrays;

public class EquilbriumT {
	public static int removeEven(int num) {
		int temp=num,local=0,local1=0,numTo=0;//10^remainder + numTo
		while(temp>0) {
			local=temp%10;
			if(local%2!=0) {
				numTo+=Math.pow(10, local1)*local;
				local1++;
			}
			temp=temp/10;
			
		}return numTo;
	}
	
	public static void merge(int[] arr,int l,int m,int r) {
		int n1=m-l+1,n2=r-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		// Load halves into L and R
//		for(int i=0;i<size;i++) {
//			if(i<=m)L[te1++]=arr[i];
//			else R[te2++]=arr[i];
//		}
		
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[m + 1 +j];
		}
		
		int k=l;
		
		//compare and modify arr
		int te1=0,te2=0;
		while(te1<n1 && te2<n2) {
			
			if(L[te1]<=R[te2])arr[k++]=L[te1++];
			else arr[k++]=R[te2++];
			
		}
		while(te1<n1)arr[k++]=L[te1++];
		while(te2<n2)arr[k++]=R[te2++];
		
		
	}
	
	public static void sort(int[] array,int l,int r) {
		
		
		if(l<r) {
		int m=(l+r)/2;	
		sort(array,l,m);//sort left half
		sort(array,m+1,r); //sort right half
		
		//merge the sorted halves
		merge(array,l,m,r);
		}
		
	}
	public static void main(String[] args) {
		int number=9,temp=number;
		/*for(int i=1;i<=number;i++) {
			
			for(int k=1;k<=(2*temp-2);k++) {System.out.print(" ");}
			
			for(int j=1;j<=(2*i-1);j++) {System.out.print(i+" ");}
			temp--;
			System.out.println();
		}*/
		
		//System.out.println(removeEven(234567));
		
		int[] array1= {0,4,3,6,1,7,2,5,8,9};
		int size=array1.length;
		System.out.println(Arrays.toString(array1));
		sort(array1,0,9);
		System.out.println(Arrays.toString(array1));

	}

}
