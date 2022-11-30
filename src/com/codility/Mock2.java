package com.codility;

import java.util.*;
import java.util.stream.Collectors;
class Excep4 extends Exception{
	Excep4(String msg){
		super(msg);
	}
}

class Excep5 extends Exception{
	Excep5(String msg){
		super(msg);
	}
}
public class Mock2 {

	public static void main(String[] args) throws Exception {
		// find largest integer in an array and if -(that integer exist) return that integer else return 0
		
		int A[]= {3,2,-2,5,-3,10,-10,1000000000,-1000000000};
		
		int size=A.length;
		if(A.length>100000)throw new Excep4("Enter array of size <=100000");
		for(int each:A) {
			if(each<-1000000000 || each>1000000000)throw new Excep5("Enter the valid elements in array");
		}
		
		
		
		
		List<Integer> l=new ArrayList<>();
		for(int e:A)l.add(e);
		
		Collections.sort(l);//ASC order
		
		l=l.stream().sorted().collect(Collectors.toList());// ASC order
		
		int op=0;
		
		for(int index=size-1;index>=0;index--) {
			int local=l.get(index);
			if(l.contains(Math.negateExact(local))) {op=local;break;}		}
		
		
		System.out.println(op);
		

	}

}
