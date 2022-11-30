package com.infy.pp1;
import java.util.*;
import java.util.Map.*;

public class Sinwave {
	public static void swap(int[] arr,int initial,int changed) {
		int temp=arr[initial];
		arr[initial]=arr[changed];
		arr[changed]=temp;
	}
	public static void main(String[] args) {
		int[] arr= {10,5,6,7,100,90};
		Map<Integer,Integer> swapE=new HashMap<>();
		int len=arr.length,swapC=0;boolean flag=true;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[i]) {
					Sinwave.swap(arr, i, j);
					System.out.println(Arrays.toString(arr)+"-->"+i+":"+j);
					
					if(swapE.containsKey(arr[i]))swapE.put(arr[i], swapE.get(arr[i])+1);
					else swapE.put(arr[i], 1);
					if(swapE.containsKey(arr[j]))swapE.put(arr[j], swapE.get(arr[j])+1);
					else swapE.put(arr[j], 1);
					
					
					swapC++;
				}
			}
			
		}System.out.println(swapE);
		
		for(Entry<Integer,Integer> entry:swapE.entrySet()) {
			if(entry.getValue()>2) {flag=false;break;}
			
		}
		if(flag)System.out.println("swaps Needed: "+swapC);
		else System.out.println("messedUp.");
	}
}
