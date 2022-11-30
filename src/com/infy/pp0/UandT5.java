package com.infy.pp0;

import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.*;

@SuppressWarnings("all")
public class UandT5 {
	public static String encryptData(String data,int key) {
		int fD=Integer.toString(key).charAt(0),size=data.length();
		int sD=Integer.toString(key).charAt(1);
		int tD=Integer.toString(key).charAt(2);
		
		char dataChar='\0';String strng="";
		
		for(int i=0;i<size;i++) {
			dataChar=data.charAt(i);
			if(Character.isUpperCase(dataChar))dataChar=(char)(dataChar+fD);
			else if(Character.isLowerCase(dataChar))dataChar=(char)(dataChar+sD);
			else if(Character.isDigit(dataChar))dataChar=(char)(dataChar+tD);
			strng+=dataChar;
		}
		
	return strng;		
	}
	
	public static int dac(int[] arr,int high,int low,int toF) {
		int mid=(low+high)/2;
		if(arr[low]==toF)return low;
		else if(arr[high]==toF)return high;
		else if(arr[mid]==toF)return mid;
		else {
			if(arr[mid]>toF)return dac(arr,mid-1,low,toF);
			else if(arr[mid]<toF)return dac(arr,high,mid+1,toF);
			else return arr[mid];
		}
		
	}

	public static void main(String[] args) {
		char a='*';
		String in="2*3/4-5";
		Matcher matcher=Pattern.compile("(-?[\\d]+)\\x(-?[\\d+-/]+)".replace('x', a)).matcher(in);
			
		//System.out.println(matcher.find() + ": "+ matcher.group(1));
		
		Stack<Character> ops=new Stack<>();
		Stack<Integer> values=new Stack<>();
		
		for(char e:in.toCharArray()) {
			if((""+e).matches("\\W"))ops.push(e);
			else if((""+e).matches("\\d"))values.push(Integer.parseInt(e+""));
			else continue;
		}
		
		int number=1009032122;
		//we can convert int to string and then get the length alternatively we can also use log10 function
		//System.out.println((int)Math.log10(number)+	1);
		
		String arr="100,200,300";
		List<Integer> list1=Arrays.stream(arr.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		int[] arrConverted=Arrays.stream(arr.split(",")).mapToInt(Integer::parseInt).toArray();
		
		Map<Integer,Long> map=Arrays
				.stream(arr.split(","))
				.collect(Collectors
						.groupingBy(x->Integer.parseInt(x),Collectors.counting()));;
		//countOfPairs.java
		
		int[] array1= {1,2,3,4,5,43,42};
		int diff=40,size=array1.length;
		List<String> list0=new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i!=j && Math.abs(array1[i]-array1[j])==diff)list0.add(array1[i]+":"+array1[j]);
			}
		}
		//System.out.println(list0);
		
		//Encryption
		//System.out.println(encryptData("yousuf mohammad",123));
		
		List<String> courses=Arrays.asList("python","dbms","dataStructures","Gproject","IVS","DevOps","Java","Selenium","TBTM");
		
		//courses.stream().sorted((x1,x2)->x1.compareTo(x2)).forEach(System.out::println);
		
		
		Optional<String> op=courses.stream().reduce((x1,x2)->x1.length()>x2.length()?x2:x1);
		op.ifPresent(System.out::println);
		op.orElse("No string is found");
		
		//pc1.java to be resumed
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
