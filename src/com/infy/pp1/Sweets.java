package com.infy.pp1;

import java.util.*;

public class Sweets {
	public static void distributeS(int sweets,int no,int[] arr) {
		for(int i=0;sweets>0 && i<no;i++) {
			arr[i]+=i+1;
			sweets-=(i+1);
		}if(sweets>0)distributeS(sweets,no,arr);
	}
	
	public static String swap(String input,int pos1,int pos2) {
		char[] arr=input.toCharArray();
		char temp=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=temp;		
		return String.copyValueOf(arr);
	}

	public static void main(String[] args) {
		int sweets=36,no=9;// each person get sweets equal to queue no
		int[] arr=new int[no];
		distributeS(sweets,no,arr);
		//System.out.println(Arrays.toString(arr));
		
		//Tongue twister
		String pp="Peter piper picked a peck of picked peppers. How many picked peppers";
		String anchor="P";int wCounter=0;
		List<String> li=new ArrayList<>();
		for(String each: pp.split(" ")) {
			li.add(each);
		if(each.toLowerCase().matches("^"+anchor.toLowerCase()+".*"))wCounter++;
		}int size=li.size();boolean flag=true;
		
		for(int i=0;i+1<size;i++) {
			if(li.get(i).equals(li.get(i+1))) {flag=false;break;}
		}
		
		
		//All possible substring
		String school="Bhashyam";int len=school.length();
		/*for(int i=0;i<=len;i++) {
			for(int j=1;j+i<=len;j++) {
				
			System.out.println(	school.substring(i, i+j));
			}
		}*/
		// or
		for(int i=1;i<=len;i++) {
			for(int j=0;j+i<=len;j++) {
				
			System.out.println(	school.substring(j, i+j));
			}
		}
		
		
		

	}

}
