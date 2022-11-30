package com.infy.pp2;

public class PerfectSquare {
	public static boolean isPerfectSq(int number) {
		if(Math.sqrt(number)==Math.floor(Math.sqrt(number)))return true;
		return false;
	}

	public static void main(String[] args) {
		int number=21,counter=0;
		double sq=Math.sqrt(number);
		
//		double dec=Math.floor(sq); //perfect square 9
//		double frac=sq-Math.floor(sq); // b^2 + 2*a*b --need to express as perfect square
//		double restP=Math.pow(frac, 2) +  (2 * dec * frac);
		while(number>0)
		{
			number-=   Math.pow(Math.floor(Math.sqrt(number)), 2);
			
			if(number==0)break;
			else counter++;
		}
		System.out.println(counter);
		

	}

}

