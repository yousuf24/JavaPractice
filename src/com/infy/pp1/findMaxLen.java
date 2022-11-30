package com.infy.pp1;

import java.util.Arrays;

public class findMaxLen {
	public static int findmaxLen(char[] arr) {
		int maxL=0,len=arr.length,count=0;
		int[] temp=new int[2*len+1];
		Arrays.fill(temp, -2);
		temp[len]=-1;
		
		for(int i=0;i<len;i++) {
			count+=(arr[i]=='b'?-1:1);
			if(temp[count+len]>=-1) maxL=Math.max(maxL, i-temp[count+len]);
			
			else temp[count+len]=i;
		}
		
		
		System.out.println(Arrays.toString(temp));
		return maxL;
	}

	public static void main(String[] args) {
		
		
		String input="yofb";
		char[] arr=input.toCharArray();
		System.out.println(findmaxLen(arr));
	}

}
