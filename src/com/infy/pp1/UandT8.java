package com.infy.pp1;
import java.util.*;
import java.util.stream.Collectors;
public class UandT8 {

	public static void main(String[] args) {
		
		Map<Character,Integer> dataCharW=new HashMap<>();
		for(int i=0;i<26;i++) {
			dataCharW.put((char)(i+97), i+1);
		}System.out.println(dataCharW);
		
		String input="yousufmd,24,7,6,4,19";
		
		Set<Integer> weights=Arrays // to get the numeric values from input
		.stream(input.split(","))
		.filter(x->Character.isDigit(x.charAt(0)))
		.map(Integer::parseInt)
		.collect(Collectors.toSet());
		
		System.out.println(weights);
		
		String data=input.split(",")[0];
		int len=data.length();
		
		int[] eachW=new int[len];int j=1;
		eachW[0]=dataCharW.get(data.charAt(0));
		
		for(int i=1; i<len;i++) {
			char current=data.charAt(i);
			char prev=data.charAt(i-1);
			
			//System.out.println(current);
				if(prev==current)eachW[j++]=eachW[j-1]+dataCharW.get(current);
				else eachW[j++]=dataCharW.get(current);
			
			
		}System.out.println(Arrays.toString(eachW));
		

	}

}
