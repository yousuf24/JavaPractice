package com.infy.pp2;



import java.util.Arrays;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		int a[][] = { {1,  2,  3,  4,  5,  6}, 
		        {7,  8,  9,  10, 11, 12}, 
		        {13, 14, 15, 16, 17, 18} 
		    }; 
		int[][] matrix=new int[a.length][a[0].length];
		int counter=0;
		
		int m=a.length,n=a[0].length,l=0,k=0,i;
		
	    while (k < m && l < n) 
	    { 
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; i++) 
	        { 
	            System.out.println ("%d "+ a[k][i]); 
	            matrix[k][i]=++counter;
	        } 
	        k++; 
	  
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; i++) 
	        { 
	        	 System.out.println ("%d "+ a[i][n-1]);
	        	 matrix[i][n-1]=++counter;
	        } 
	        n--; 
	  
	        /* Print the last row from the remaining rows */
	        if ( k < m) 
	        { 
	            for (i = n-1; i >= l; i--) 
	            { 
	            	 System.out.println ("%d "+ a[m-1][i]); 
	            	 matrix[m-1][i]=++counter;
	            } 
	            m--; 
	        } 
	  
	        /* Print the first column from the remaining columns */
	        if (l < n) 
	        { 
	            for (i = m-1; i >= k; i--) 
	            { 
	            	 System.out.println ("%d "+ a[i][l]); 
	            	 matrix[i][l]=++counter;
	            } 
	            l++;     
	        }         
	    } 
		
		for(int[] each:matrix) {
			System.out.println(Arrays.toString(each));
		}
		

	}

}


