package com.infy.pp3;


import java.util.Arrays;

public class MaximumSum {

	public static void main(String[] args) {
		int[] arr= {1,4,5,6,7,8,9}; int size=arr.length;
		//Dynamic programming sum[] to find the intermediate sum and get max sum once u build sum[] sum[sum.length-1]-->gives u max value
		
		
		
		//TIME complexity O(n^2)
		int maxSum=Integer.MIN_VALUE;
		for(int j=0;j+2<size;j++) {
			int temp=0;
		for( int i=j;i<size;i=i+2) {			
			temp+=arr[i];
		}
		//System.out.println(temp);
		maxSum=Math.max(maxSum, temp);
		}
		
		//System.out.println("maximum sum of adjacent elements: "+maxSum);
		
		// 1 4 5 6 7 8 9   come from first 1 4 6 10 13 18 22
		//Dynamic programming using sum[] to store intermediate sum
		int sum[]=new int[size];int ms=0;
		for(int i=0;i<size;i++) {
			if(i>=2) {
			ms=arr[i]+sum[i-2];
			sum[i]=Math.max(ms, sum[i-1]);}
			else {
				ms=arr[i];
				sum[i]=Math.max(ms, sum[i]);
			}
		}
		System.out.println(Arrays.toString(sum));
		
		
		
		
		
		
	}

}


