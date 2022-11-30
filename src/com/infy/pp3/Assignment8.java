package com.infy.pp3;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.lang.*;

class Assignment8
{
    public static String[] solve(String[] arr){
    	int size=arr.length;
    	String[] arrT=new String[size/2];
    	int global=0;
    	for(int i=0;i+1<size;i=i+2) {
    		String one=arr[i];
    		String two=arr[i+1];
    		
    		
    		
    		//code here
    		String temp=one; //to store in temp becoz everytime char[] is modified. Focus on string1 as u either remove or Capitalize(change case) of lower chars
    		List<Integer> list0=new ArrayList<>();//to store the positions of lowerCase in string1
    		List<String> allPermutations=new ArrayList<>();
    		char[] array=temp.toCharArray();//main char[] array
    		int len=one.length(),lcCounter=0;//we need lowecaseCounter to iterate from 0000.. to 111111...
    		
    		//to find lowercase positions and lowercaseCounter
    		for(int j=0;j<len;j++) {
    			if(Character.isLowerCase(array[j]))
    			{list0.add(j);
    			lcCounter++;}}
    		
    		
    		
    		//to find the limit till we can iterate
    		int limit=(int)Math.pow(2, lcCounter);
    		String l=Integer.toBinaryString(limit-1);
    		int lenL=l.length();// this is used to append 0 if missed
    		
    		StringBuilder[] array24=new StringBuilder[limit]; //stringBuilder is mutable so hence used in modification operations
    		for(int k=limit-1;k>=0;k--) {
    			array24[k]=new StringBuilder(Integer.toBinaryString(k)); //to initialize the local StringBuilder type
    			
    			while(array24[k].length()!=lenL)		
    			array24[k].insert(0, "0");// to append trailing zeroes 
    		}
    		//for(StringBuilder each:array24) {System.out.println(each.toString());}
    		//System.out.println(Arrays.toString(array24));
    		
    		
    		for(int k=0;k<limit-1;k++) { //to capture all possible combinations
    			array=temp.toCharArray(); // to initialize everytime back to string1
    			String local=array24[k].toString();
    			char[] arrL=local.toCharArray(); // array is always used for modifications , u cant use list here
    			int size24=arrL.length;
    			
    			for(int j=0;j<size24;j++) {
    				if(arrL[j]=='0')array[list0.get(j)]=(char)(array[list0.get(j)] -32);
    				else array[list0.get(j)]=Character.MIN_VALUE;
    			}
    			allPermutations.add(new String(array).replaceAll(""+Character.MIN_VALUE, ""));
    			
    		}
    		
    		System.out.println(allPermutations);
    		if(allPermutations.contains(two))arrT[global++]="YES";
    		//else arrT[global++]="NO";
    		//code ends here
    		
    		
    	}
    	
    	return arrT;
        
    }
    
    
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String arr[]=new String[2*N];
        
        for(int i=0;i<2*N;i++){
            arr[i]=s.next();
        }
        //System.out.println(Arrays.toString(arr));
        s.close();
        
       for(String each: solve(arr)) {
    	   System.out.println(each==null?"NO":"YES");
       };
        
    }
}

