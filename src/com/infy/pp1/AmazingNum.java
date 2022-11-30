package com.infy.pp1;

import java.util.*;
import java.util.stream.*;

public class AmazingNum {
	public static void printClosest(int[] arr,int tA) {
		int p1=0,p2=0,oSum=Integer.MAX_VALUE,len=arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i!=j) oSum=Math.min( Math.abs(arr[i]+arr[j]-tA), oSum);
				if(Math.abs(arr[i]+arr[j]-tA)==oSum) {p1=i;p2=j;}
					
			}
		}		System.out.println("optimized SUM "+oSum+" pairs: "+p1+":"+p2);
	}

	public static void main(String[] args) {
		String num="45631899";int len=num.length();
	
		//to get all possible number combination
		/*for(int i=0;i<len;i++) {
			
			for(int j=0;2*j+i<=len && i+j<=len;j++){
				
				String loc1=num.substring(i, i+j);
				String loc2=num.substring(i+j, i+2*j);
				
				if(!(loc1.isEmpty() || loc2.isEmpty()))System.out.println(Integer.parseInt(loc1)+":"+Integer.parseInt(loc2));
				
			}
		}*/
		
		//to find common chars between two strings
		/*String in1="yousuf",in2="cruzy";
		Map<Character,Long> collection1=Arrays.stream(in1.split("")).collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
		Map<Character,Long> collection2=Arrays.stream(in2.split("")).collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
		
		// iterate over loop and use String.contains() method
		
		//How to find common)elements between a list : use <List>.retainAll(List <ref>)
		//List<String> li1= Arrays.asList("infy","tcs","deloitte","openText");
		//List<String> li2= Arrays.asList("tcs","deloitte","openText");
		
		
		List<Character> li1= Arrays.stream(in1.split("")).map(x->x.charAt(0)).collect(Collectors.toList());
		List<Character> li2= Arrays.stream(in2.split("")).map(x->x.charAt(0)).collect(Collectors.toList());
		boolean isTrue=(li1.size()>li2.size())? li1.retainAll(li2):li2.retainAll(li1);
		
		
		if(isTrue)System.out.println("retained in list1"+li1);
		else System.out.println("retained in list2"+li2);
		
		if(li1.size()>li2.size()) {
			li1.retainAll(li2);// To be able to use this please use stream and get the list
			System.out.println("Retained in List1"+li1);
		}else {li2.retainAll(li1);System.out.println(li2);}
		
		
		int[] arr= {23,45,67,98};
		int size=arr.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		
		for(int i=0;i<size;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}System.out.println("min: "+min +" max: "+max);
		
		//sketch
		int num1=7;
		
		for(int i=1;i<=num1;i++) {
			
			//adding appropriate spaces
			for(int k=1;k<=num1-i;k++)System.out.print( " ");
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		
		
		
		int[] students={10,12,15,25,21};
		printClosest(students,39);	

	}

}
