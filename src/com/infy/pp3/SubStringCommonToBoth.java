package com.infy.pp3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubStringCommonToBoth {
	
	public static List<String> spin(String input){
		List<String> one=new ArrayList<>();
		int size1=input.length();
	for(int i=1;i<=size1;i++) {
		for(int j=0;j+i<=size1;j++) {
			one.add(input.substring(j,j+i));
		}
	}
		return one;
	}
	public static void main(String[] args) {
		String input="ABCD,ABDC";String[] arr=input.split(",");
		String first=arr[0],second=arr[1];int size1=first.length(),size2=second.length();
		
		
		List<String> one_r;
		List<String> two_r;
		one_r=spin(first);
		two_r=spin(second);
		
		one_r.retainAll(two_r);// retain all common elements between two lists
		
		
		one_r.sort(Comparator.comparing(x->x.length()));//use this or use (x1,x2)->x1.length()-x2.length();
		//System.out.println(one_r);
		String op="";
		
//		int maxS=Integer.MIN_VALUE;
//		for(String each:one_r) {
//			if(each.length()<size1) maxS=Math.max(maxS, each.length());
//		}
//		for(String each:one_r) {if(each.length()==maxS)System.out.println(each);}
		
		one_r.stream().sorted((x1,x2)->x2.length()-x1.length()).collect(Collectors.toList());
		Optional<String> op1=one_r.stream().sorted((x1,x2)->x2.length()-x1.length()).reduce((acc,ele)->acc.length()>ele.length()?acc:ele);
		op1.ifPresent(System.out::println);//perfect way of getting value from Optional
		
		
		
	}

}


