package dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {36,11,63,24,9};
		int size=arr.length;
		//Main logic.. get the minimum element from unsorted array picked in every iteration and moved to sortedArray O(n^2)
		
		for(int i=0;i<size;i++) {
			int min_index=i;
			for(int j=i+1;j<size;j++) 
				if(arr[j]<arr[min_index])min_index=j;
			
			//swap the firstElement with min_indexed value
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}System.out.println(Arrays.toString(arr));

	}

}
