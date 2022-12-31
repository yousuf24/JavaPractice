package com.infy.pp3;
import java.util.stream.*;
import java.util.*;

public class UandT {
	
	public static char toUC(char in) {
		return (char)(in-32);
	}
	
	public static char remove(char in) {
		return Character.MIN_VALUE;
	}

	public static void main(String[] args) {
		String one="AbcDE";
		String two="AFDE";
		
		String[] outputArray=new String[1];
		
		//finding all possible combinations of one 
		/*
		 * Capitalize zero or more of str_one 's lowercase letters.
		 *	Delete all of the remaining lowercase letters in str_one.
		 * 
		 */
		
		String temp=one; //to store in temp becoz everytime char[] is modified 
		List<Integer> list0=new ArrayList<>();//to store the positions of lowerCase in string1
		List<String> allPermutations=new ArrayList<>();
		char[] arr=temp.toCharArray();//main char[] array
		int len=one.length(),lcCounter=0;//we need lowecaseCounter to iterate from 0000.. to 111111...
		
		//to find lowercase positions and lowercaseCounter
		for(int i=0;i<len;i++) {
			if(Character.isLowerCase(arr[i]))
			{list0.add(i);
			lcCounter++;}}
		
		
		
		//to find the limit till we can iterate
		int limit=(int)Math.pow(2, lcCounter);
		String l=Integer.toBinaryString(limit-1);
		int lenL=l.length();// this is used to append 0 if missed
		
		StringBuilder[] array24=new StringBuilder[limit]; //stringBuilder is mutable so hence used in modification operations
		for(int i=limit-1;i>=0;i--) {
			array24[i]=new StringBuilder(Integer.toBinaryString(i)); //to find the local StringBulder
			
			while(array24[i].length()!=lenL)		
			array24[i].insert(0, "0");// to append trailing zeroes 
		}
		//for(StringBuilder each:array24) {System.out.println(each.toString());}
		
		
		for(int i=0;i<limit-1;i++) { //to capture all possible combinations
			arr=temp.toCharArray(); // to initialize everytime back to string1
			String local=array24[i].toString();
			char[] arrL=local.toCharArray(); // array is always used for modifications , u cant use list here
			int size24=arrL.length;
			
			for(int j=0;j<size24;j++) {
				if(arrL[j]=='0')arr[list0.get(j)]=toUC(arr[list0.get(j)]);
				else arr[list0.get(j)]=remove(arr[list0.get(j)]);
			}
			allPermutations.add(new String(arr).replaceAll(""+Character.MIN_VALUE, ""));
			
		}
		
		int k=0;
		if(allPermutations.contains(two))outputArray[k++]="YES";
		else outputArray[k++]="NO";
		
		System.out.println(Arrays.toString(outputArray));
		
		

	}

}


