package com.infy.pp3;


import java.util.Arrays;

public class NonOverlappingSubstrings {

	public static void main(String[] args) {
		String input="A,B,C,D"; //consider there are 3 commas , 2^3 combinations can be found 000 001 .........111
		//Find positions of , and use 0|1 logic  1 3 5 are positions
		char[] arr=input.toCharArray();int size=arr.length;
		int n=input.length()- input.replace(",", "").length();
		
		StringBuilder sb=null;
		int limit=(int) (Math.pow(2, n)-1);
		String[] arrS=new String[limit+1];
		
		for(int i=0;i<=limit;i++) {			// to capture [000,001,.......111] in arrS[] array
			sb=new StringBuilder(Integer.toBinaryString(i));
			while(sb.length()!=3) {sb.insert(0, 0);}
			arrS[i]=sb.toString();
		}
		
		StringBuilder sb2=new StringBuilder();//to capture positions 135
		
		for(int i=0;i<size;i++) if(arr[i]==',') sb2.append(i);
			
			
		
				
		for(int i=0;i<=limit;i++) {
			arr=input.toCharArray();// redefine because you are manipulating it here
			int lenL=arrS[i].length();
			
			for(int j=0;j<lenL;j++) {
				
				if(arrS[i].charAt(j)=='0') 
					arr[   Character.getNumericValue(sb2.charAt(j))  ]=Character.MIN_VALUE;				
					
			}
			
			System.out.println(  String.copyValueOf(arr).replaceAll(""+Character.MIN_VALUE, ""));
		}
//		char ch='\0';
//		System.out.println(input.replace(',', ch));

	}

}


