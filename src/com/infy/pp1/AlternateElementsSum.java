package com.infy.pp1;


import java.util.*;
public class AlternateElementsSum {
	public static int evaluate(int[][] matrix) {
		int sum=0;
		// code here
		// its simple take boolean and flip it for every iteration of inner for loop 
		//two for loops used to iterate through rows and columns
		
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();  //3#3#1,2,3#4,5,6#7,8,9
		String arr[]=input.split("#");
		int row=Integer.parseInt(arr[0]);
		int col=Integer.parseInt(arr[1]);
		int[][] matrix=new int[row][col];
		
		for( int r=0;r<row;r++) {
			int[] arr2= Arrays.stream(arr[r+2].split(",")).mapToInt(Integer::parseInt).toArray();
			for(int c=0;c<col;c++) {
				matrix[r][c]=arr2[c];
			}
		}
		
		s.close();

	}

}
