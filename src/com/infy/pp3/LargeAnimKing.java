package com.infy.pp3;

import java.util.Arrays;

public class LargeAnimKing {
	public static int getLocalLarge(int row,int col, int[][] matrix,boolean[][] isV) {
		int row_len=matrix.length,col_len=matrix[0].length;
		//Every Element is initialized to false at start
		
		if( row<0 || row>=row_len || col<0 || col>=col_len )return 0;
		if(matrix[row][col]==0)return 0;
		isV[row][col]=true;

		
		int toR=1;
		for(int i=row-1;i<=row+1;i++) {
			for(int j=col-1;j<=col+1;j++) {
				if( i>=0 && i<row_len && j>=0 && j<col_len && isV[i][j]==false) {
					
					toR+=getLocalLarge(i,j,matrix,isV);
				}
			}
		}return toR;
		
		
	}
	
	public static void getGlobalLarge(int[][] matrix) {
		int gmax=Integer.MIN_VALUE;
		int row_len=matrix.length,col_len=matrix[0].length;
		boolean[][] isV=new boolean[row_len][col_len];
		

		
		for (int row = 0; row < row_len; row++) {
			for (int col = 0; col < col_len; col++) {
				if (matrix[row][col] == 1) {
					int localLen = getLocalLarge(row, col, matrix,isV);
					System.out.println(localLen);
					gmax = Math.max(gmax, localLen);
				}
			}
		}System.out.println("Max size of AnimalKingdom: "+gmax);
//		for(boolean[] each:isV) {
//			System.out.println(Arrays.toString(each));
//		}
	}

	public static void main(String[] args) {
		int[][] matrix= {{0,0,0,1,1,0,0},{0,1,0,0,1,1,0},{1,1,0,1,0,0,1},{0,0,0,0,0,1,0},{1,1,0,0,0,0,0},{0,0,0,1,0,0,0}};
		for(int[] each:matrix) {
		System.out.println(Arrays.toString(each));
	}

		
		getGlobalLarge(matrix);

	}

}
