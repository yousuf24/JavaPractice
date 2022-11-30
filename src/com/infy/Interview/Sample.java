package com.infy.Interview;
import java.util.*;
import java.util.Map.*;
public class Sample {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,5,6};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer each:arr) {
			if(map.containsKey(each))map.put(each, map.get(each)+1);
			else map.put(each, 1);
		}
		
		System.out.println(map);
		
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		

	}

}
