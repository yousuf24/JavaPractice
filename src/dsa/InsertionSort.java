package dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// start from arr[1] to arr[N]  if current value (key)<predecessor then compare to the elements before. Move the greater element 1 position up to make space for swapped element
		int[] arr=  { 12, 11, 13, 5, 6 };int size=arr.length;
		
		for( int i=1;i<size;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}arr[j+1]=key;
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
