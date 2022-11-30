package com.infy.pp2;

import java.util.*;
import java.util.stream.*;

public class ReverseOnlyLetters {
	public static String reverseLetters(String input) {
		int len=input.length();
		int index=len-1;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<len;i++) {
			char dataChar=input.charAt(i);
			if(Character.isLetter(dataChar)) {
				
				while(index>=0) {
					char local=input.charAt(index);				
					if(Character.isLetter(local)) {sb.append(local);index--;break;}
					index--;
				}
				
			}else sb.append(dataChar);
		}
		
		return sb.toString();
	}
	
	public static String reverseVowel(String input) {
		String getV="",ans="";
		char[] arr=input.toCharArray();
		for(char e:arr) {
			if((""+e).matches("[aeiouAEIOU]"))getV+=e;
		}
		//System.out.println(getV);
		int index=getV.length()-1;
		//System.out.println(Arrays.toString(arr));
		for(char e:arr) {
			if(getV.contains(e+"") && index>=0) {ans+=getV.charAt(index);index--;}
			else ans+=e;
			
		}
		return ans;
	}
	
	public static <E> Object[] merge(E[] arr1,E[] arr2) {
		List<E> list=new ArrayList<>();
		Stream.of(arr1,arr2).flatMap(Stream::of).forEach(list::add);
		
		return list.toArray();//it returns object array
	}
	public static void main(String[] args) {
		String input="yousufmohammad TechnicalTestLead 2030Kerala";
		/*String temp=input,res="";
		StringBuilder sb=new StringBuilder();
		temp=temp.replaceAll("[A-Za-z]", " ");
		
		String[] arr=input.split("");
		for(String each:arr) {
			if(each.matches("[A-Za-z]"))res+=each;
		}
		System.out.println(res);
		System.out.println(temp);
		int j=res.length()-1;
		for(String each:input.split("")) {
			if(each.matches("[A-Za-z]") && j>=0)sb.append(res.charAt(j--));
			else sb.append(each);
		}
		
		System.out.println(sb.toString());
		
		//System.out.println(reverseLetters(input));
		System.out.println(input);
		System.out.println(reverseVowel(input));*/

		Object[] arr=merge(new Integer[] {1,2,3},new Integer[] {4,5,6});
		System.out.println(Arrays.toString(arr));
		
		int[] arr2= {76,8,90};
		
		
	}

}
