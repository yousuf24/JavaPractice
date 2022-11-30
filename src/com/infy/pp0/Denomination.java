package com.infy.pp0;

import java.util.*;

public class Denomination {
	public static String cal(int den,List<Integer> arr) {
		int coin_chosen=0,coin_remaining=0,size=arr.size();
		
		if(den<=0) {return den+"";}
		if(arr.contains(den)) {return den+"";}
		
		for(int i=0;i<size;i++) {
			int local=arr.get(i);
			if(local<den)coin_chosen=local;
			else break;
		}
		coin_remaining=den-coin_chosen;
		return coin_chosen+","+cal(coin_remaining,arr);
		
		
	}

	public static void main(String[] args) {
		List<Integer> repo=Arrays.asList(1,5,20,25);
		Collections.sort(repo);
		System.out.println(cal(123,repo));

	}

}
