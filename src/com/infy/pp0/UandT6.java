package com.infy.pp0;

import java.util.*;
public class UandT6 {

	public static void main(String[] args) {
		int[] A= {-3,-6,-1};
		int size=A.length,counter=0,toReturn=0;
		List<Integer> list1=new ArrayList<>();
		for(int e:A)list1.add(e);
		
		
		for(Integer e:list1) {
			if(e>0)counter++;
		}
		
		if(counter>0) {
		
		list1.sort(Comparator.naturalOrder());
		// N length <=100000 and values from -1mill to +1million
		for(Integer i=1;i<=1000000;i++) {
			if(!list1.contains(i)) {toReturn=i;break;}
		}
		}
		else toReturn=1;

	}

}
