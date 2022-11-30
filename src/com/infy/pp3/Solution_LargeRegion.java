package com.infy.pp3;


public class Solution_LargeRegion {
	
	public static int getSize(int row, int column,int[][] matrix) {
		if(row<0 || column<0 || row>=matrix.length || column>=matrix[row].length) return 0;
		if(matrix[row][column]==0) return 0;
		matrix[row][column]=0;
		int toR=1;	
		for(int r=row-1;r<=row+1;r++) {
			for(int c=column-1;c<=column+1;c++) {
				if(r!=row || c !=column)
				toR+=getSize(r,c,matrix);
				
			}
		}
		return toR;
		
	}
	
	
	public static void getBiggestRegion(int[][] matrix) {
		int maxSize=Integer.MIN_VALUE;
		for(int row=0;row<matrix.length;row++) {
			for(int column=0;column<matrix[row].length;column++) {
				if(matrix[row][column]==1) {
					int size=getSize(row,column,matrix);
					maxSize=Math.max(size, maxSize);
				}
			}
		}
		System.out.println("Largest region size comprising '1': "+maxSize);
		
	}

	public static void main(String[] args) {
		int matrix[][]= {{0,0,0,1,1,0,0},{0,1,0,0,1,1,0},{1,1,0,1,0,0,1},{0,0,0,0,0,1,0},{1,1,0,0,0,0,0},{0,0,0,1,0,0,0}}; 
		getBiggestRegion(matrix);

	}

}


