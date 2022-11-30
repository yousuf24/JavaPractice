package com.infy.pp2;
import java.util.*;
import java.util.Map.*;
public class AllP {
	public static String swap(String input,int pos1,int pos2) {
		char[] arr=input.toCharArray();
		char temp=arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=temp;		
		return String.copyValueOf(arr);
	}
	public static int fact(int n) {
		if(n<=1)return 1;
		else return n*fact(n-1);
	}

	public static void main(String[] args) {
		String name="abc";int len=name.length();
		List<String > permutations=new ArrayList <>(); ;
		
		
		//This solution will not give correct result
		/*for( int i=0;i<len;i++) {
			for( int j=0;j<len;j++) {
				String local=AllP.swap(name, i, j);
				 if(!permutations.contains(local))permutations.add(local);
				 System.out.println(local);
			}
		}System.out.println(permutations);
		System.out.println(fact(name.length())+":"+permutations.size());*/

		//below solution is preferred
		List<String> anagrams=new ArrayList<>();		
		//int index=0;
		
			char[] arr=name.toCharArray();
		while(anagrams.size()<fact(len)) {
			Random r=new Random();
			for( int i=0;i+1<=len;i++) {
				int local=r.nextInt(i+1);
				
				char temp=arr[local];
				arr[local]=arr[i];
				arr[i]=temp;
					
			}String fV=String.valueOf(arr);
			if(!anagrams.contains(fV))anagrams.add(fV);
			
		}System.out.println(anagrams);
	}

}
