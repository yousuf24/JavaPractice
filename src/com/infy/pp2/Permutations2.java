package com.infy.pp2;

public class Permutations2 {
	public static void permute(int[] arr, int index) {
		int size=arr.length;
		
		//base condition
        if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
            //System.out.println(Arrays.toString(arr));
            //Print the array
            System.out.print("[");
            for(int i = 0; i < arr.length - 1; i++){
                System.out.print(arr[i] + ", ");
            }
            if(size > 0) 
                System.out.print(arr[size - 1]);
            System.out.print("]");
            return;
        }
		
		
		//iterative condition
		
		//swap the elements at index and i
		for(int i=index;i<size;i++) {
			int t=arr[i];
			arr[i]=arr[index];
			arr[index]=t;
			
			permute(arr,index+1);
			//backtrace swap it back to trace the original elements
			t=arr[i];
			arr[i]=arr[index];
			arr[index]=t;
			
			if(i<arr.length-1) {System.out.print(",");System.out.println();}
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		//to permute fix first position and swap next two positions
		permute(arr,0);

	}

}


