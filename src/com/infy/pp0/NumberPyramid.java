package com.infy.pp0;

public class NumberPyramid {

	public static void main(String[] args) {
		int number=5;
		
		for(int i=1;i<=number;i++) {
			for(int k=number;k>i;k--)System.out.print(" ");
			
			for(int m=(2*i-1)-i;m<=(2*i-1);m++)System.out.print(m);
			for(int m=(2*i-1)-1;m>=(2*i-1)-(i);m--)System.out.print(m);
			System.out.println();	
			
			
		}

	}

}
