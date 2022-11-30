package com.infy.pp1;

import java.util.*;
import java.util.stream.Collectors;

public class UandT7 {

	public static void main(String[] args) {
		List<Integer> li0=Arrays.asList(1,2,3);
		List<Integer> li1=Arrays.asList(45,21,30);
		
		//li0.addAll(0,li1);
		
		String name="yousuf mohammad";
		char[] arr=name.toCharArray();
		
		List<Object> li=Arrays.asList(arr);//Use wisely
		
		//Find Frequency of chars in 3 methods
		//01. use Collections.frequency()
		int freq_a=Collections.frequency(li1, 'a');
		
		//02. Use Stream 
		Character[] arr_dup=new Character[arr.length];
		int index=0;
		for(char e:arr)arr_dup[index++]=e;
		Map<Character,Long> map=Arrays.stream(arr_dup).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(map);
		
		//03. Define map DS and use famous method .put() if exist +1 if no just add 1 as value
		
		
		//To be continued com.infy.assigment  Contiguousarray.java
		
		
		
		
	}

}
