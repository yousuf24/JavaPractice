package com.infy.pp3;


import java.util.Arrays;
import java.util.Scanner;

public class Assigment1 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,6,7,9,2,3,0,5};
		int sum=0,ls=0,size=arr.length;
		int out=0;
		for(int each:arr) {sum+=each;}
		
		if (sum - arr[0] == 0)
			out = 0;
		else if (sum - arr[size - 1] == 0)
			out = size - 1;
		else {
			for (int i = 0; i < size; i++) {
				

				sum -= arr[i];
				
				if (ls == sum) {
					
					out = i;
					break;
				}
				ls += arr[i];

			}

		}
		System.out.println("equilibrium index " + out);
	
		  	Scanner s = new Scanner(System.in);
	        String inputString = s.nextLine();
	        int[] arr1=Arrays.stream(inputString.split(",")).mapToInt(Integer::parseInt).toArray();
	        s.close();
	
		
	}

}


