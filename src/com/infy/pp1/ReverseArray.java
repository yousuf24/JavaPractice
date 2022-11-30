package com.infy.pp1;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(18,21,36,44);
		Collections.reverse(list);
		//System.out.println(list);
		
		List<Object> li=Arrays.asList(1,2,3);
		System.out.println(li);
		
		Integer[] array0= {99,10,12};
		Optional<Integer> op=Arrays.stream(array0).reduce((a,b)->a+b);
		System.out.println(op.get());
		op.ifPresent(System.out::println);
		op.orElse(0);
		
		int[] arr=new int[3];
		Arrays.fill(arr, 2);//it fills everything with 2
		
		//List<Object> list2=Arrays.asList(arr);
		//Collections.addAll(list);// It throws unsupported operation exception 
		//and its behavior is to take collection as arg1 and element/array of elements in arg2 and load array into collection
		
		//System.out.println(list);
		

	}

}
