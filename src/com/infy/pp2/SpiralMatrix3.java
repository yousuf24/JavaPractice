package com.infy.pp2;



import java.util.Arrays;

public class SpiralMatrix3 {

	public static void main(String[] args) {
		int number=4;
		int[][] matrix=new int[number][number];
		int l=0,k=0,m=number,n=number,i=0,counter=0;
		
		while(k<m && l<n) {
			
			
			for(i=l;i<n;i++) {//first row from remaing rows
				matrix[k][i]=++counter;
			}
			k++;
			
			
			for(i=k;i<m;i++) {//LastCol from remaining cols
				matrix[i][n-1]=++counter;
			}
			n--;
			
			//if(k<m) {
			for(i=n-1;i>=l;i--) {//LastRow from remaining rows
				matrix[m-1][i]=++counter;
			}
			m--;
			
			
			
			//if(l<n) {
				for(i=m-1;i>=k;i--) {//First col from remaining cols
					matrix[i][l]=++counter;
				}
				l++;
				
				//}
			
		}
		
		for(int[] each:matrix) {
			System.out.println(Arrays.toString(each));
		}

	}

}


