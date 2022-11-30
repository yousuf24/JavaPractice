package com.infy.mock;


import java.util.Arrays;

public class HopsRequired {

	public static void main(String[] args) {
		int[] arr= {1,1,3,4,0,1,2,1,4,1};   //  [4 5 4 3 ` 3 2 2 1 0]
		int size=arr.length;
		
		int[] jumps=new int[size];//which keeps tabs on min jumps needed to reach last element from arr[i]
		int i,j,min=Integer.MAX_VALUE;
		jumps[size-1]=0;//min no of hops needed to reach last element from lastELment is always 0
		
		if(size==0)System.out.println("infinite");//no array -infinite
		else if(size==1)System.out.println(0);//arr of length 1 - no hops required
		
			
		for(i=size-2;i>=0;i--) {
			if(arr[i]==0)jumps[i]=Integer.MAX_VALUE;// if current value is 0 u can't reach end
			else if(arr[i]+i>=size-1)jumps[i]=1;
			else 
			{
			min=Integer.MAX_VALUE; // this has to be initialized with max value
			for(j=i+1;j<size && j<=arr[i]+i;j++) {
				min= (min>jumps[j])?jumps[j]:min;
				//min=Math.min(jumps[j], min);
			}
			
			jumps[i]=min+1;
			}
			
			
		}
			
		System.out.println(Arrays.toString(jumps));
		String result=(jumps[0]==Integer.MAX_VALUE)?"infinite":""+jumps[0];
		System.out.println(result);
		
		

	}

}

