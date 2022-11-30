package com.infy.pp3;

import java.util.*;

public class MaxDistance {

	public static void main(String[] args) {
		int[] arr={9,2,1,2,1,4,5,4,2};int size=arr.length;
		
		//Sol1 --O(n^2)
		int gsum=0,lsum=Integer.MIN_VALUE;//localsum and global sum
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				int min=i;int max=j;				
				if(arr[i]==arr[j] && i!=j) lsum=Math.max(lsum, max-min);
				
			}
			gsum=Math.max(lsum, gsum);
		}
		System.out.println("max distance: "+gsum);
		
		//Sol2 --O(n) as lookup in hashtable/dict takes only O(1)
		int gsum2=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int index=0;index<size;index++) {
			if(map.containsKey(arr[index])) gsum2=Math.max(gsum2, (index-map.get(arr[index])));
			else map.put(arr[index], index);
		}
		System.out.println(map);
		System.out.println("Maxi: "+gsum2);
		

	}

}

