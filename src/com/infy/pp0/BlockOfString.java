package com.infy.pp0;

import java.util.*;
import java.util.stream.Collectors;
public class BlockOfString {
	/*
a block is a word consisting of one type of letter. For example, aaaa and xx are blocks and bbbcc (two different letters) and xyz (three different letters) are not.
A string S consisting of N small letters from the English alphabet is given. We want to delete as few letters as possible from S to obtain a word composed of at most three blocks.
	 */

	public static void main(String[] args) {
		String S="aabacbba";
		int bc=0,len=S.length();
		
		Map<Character,Long> coll=Arrays.stream(S.split("")).collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
		System.out.println(coll);
		
        char[] arr=S.toCharArray();
        
    for(int i=0;i+1<len;i++) {
    	//if(arr[i]==arr[i+1])bc++;
    	
    	
    }
    System.out.println(bc);
        
//        for(int i=0;i<=len;i++){
//            for(int j=0;i+j<=len;j++){
//            	if(!S.substring(j,i+j).trim().isEmpty())System.out.println(S.substring(j,i+j));
//                ;
//            }
//            
//        }
        
        
        

	}

}
