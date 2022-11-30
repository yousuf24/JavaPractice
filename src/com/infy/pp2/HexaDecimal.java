package com.infy.pp2;

import java.util.*;
import java.util.stream.*;
import java.util.Map.*;
import java.util.stream.Stream;

public class HexaDecimal {
	public static String tohex(int num) {
		StringBuilder sb=new StringBuilder();
		char[] hex= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		//Assuming 32 bit architecture 8 * 4 = 32 ( 4 bit operation for each instance)
		for(int i=0;i<8 && num!=0;i++) {
			
			sb.append(hex[num & 15]);
			num=num>>4; //right shift by 4 bits
		}
		
		
		
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		int input=105,temp=input;
		StringBuilder out=new StringBuilder();
		while(temp>1) {
			int local=temp%16;
			System.out.println(local);
			if(local>9)out.append((char)(local-9+96));
			else out.append(local);
				temp/=16;
		}System.out.println("HexamDecimal for " +input+" is "+out.reverse());
		
		System.out.println(tohex(input));
		
		// instead of using .append and reverse() we can use sb.insert(0,<>)
		
		
		
		//merge two arrays
		Integer[] arr1= {12,2,3,4,5,5,67,88};
		Integer[] arr2= {1,2,3,4,55,15,67,88};
		// make sure each array above has unique values . This is preRequisite
		Map<Integer,Long> map_col=Stream.of(arr1,arr2).flatMap(Stream::of).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		String commonV="";
		for(Entry<Integer,Long> entry:map_col.entrySet()) {
			if(entry.getValue()>1)commonV+=entry.getKey()+" ";
			
		}System.out.println(commonV);
		
		List<Integer> li1=new ArrayList<>(Arrays.asList(arr1));
		List<Integer> li2=new ArrayList<>(Arrays.asList(arr2));
		li1.retainAll(li2);
		System.out.println(li1);
		
		
		
		
		
		
		
		
		
		
	}

}
