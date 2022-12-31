package dsa;

import java.util.Arrays;

public class SortTechniques {
	
	static void merge(int[] arr,int st,int m, int en) {
		int N1=m-st+1,N2=en-m;
		int[] L=new int[N1];
		int[] R=new int[N2];
		
		//Load arrays L and R
		for(int i=0;i<N1;i++) {
			L[i]=arr[st+i];
		}for(int i=0;i<N2;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0,j=0,k=st;
		while(i<N1 && j<N2) {
			if(L[i]<=R[j])arr[k++]=L[i++];
			else arr[k++]=R[j++];
		}
		//Load the remaining
		while(i<N1)arr[k++]=L[i++];
		while(j<N2)arr[k++]=R[j++];
		
	}
	
	public static void sort(int[] arr,int st,int en) {
		if(st<en) {
			int m=(st+en)/2;
			
			sort(arr,st,m);//sort left half
			sort(arr,m+1,en);//sort right half
			merge(arr,st,m,en);//merge the sortedHalf
		}
	}

	public static void main(String[] args) {
	 int[] arr= {4,2,6,1,8,3,0,9};
	 sort(arr,0,arr.length-1);
	 System.out.println(Arrays.toString(arr));
	}

}
