package com.infy.Interview;

import java.util.Map;
import java.util.*;

public class Fibanocci_DP {
	public static int cal(int n,Map<Integer,Integer> cache) {
		if(n==0 || n==1) {cache.put(n, n);return n;}
		if(cache.containsKey(n)) {System.out.println("Already Calculated.");}
		else {
			int local=cal(n-1,cache)+cal(n-2,cache);
			cache.put(n, local);
			return local;
		}
		return cache.get(n);
	}

	public static void main(String[] args) {
		Map<Integer,Integer> cache=new HashMap<>();
		int num=8;
		cal(num,cache);
		System.out.println(cache);
		System.out.println(cache.get(num));

	}

}
