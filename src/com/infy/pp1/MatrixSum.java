package com.infy.pp1;
import java.util.*;
public class MatrixSum {
	public static int getSum(int[][] matrix) {
		//upper triangle sum including diagonal
		int rowL=matrix.length,colL=matrix[0].length, maxS=0;
		
		for(int i=0;i<rowL;i++) {
			int x=0,y=i,sumD=0;
			for(int j=i;j<colL;j++) {
				sumD+=matrix[x++][y++];
			}maxS=maxS>sumD?maxS:sumD;
		}
		
		//lower triangle excluding diagonal
		for(int i=1;i<rowL;i++) {
			int x=i,y=0,sumD=0;
			for(int j=i;j<colL;j++) {
				sumD+=matrix[x++][y++];
			}maxS=maxS>sumD?maxS:sumD;
		}
		
		return maxS;
	}
	public static int findMountainSubArray(int[] heights) {
		int N=heights.length,base=0,longLen=0,peak=0;//peakP is hillpoint index | vantage point | peakPoint
		while(base<N) {
			peak=base;
			//enter the loop only if there is chance to form mountain
			if(peak+1<N &&  heights[peak]<heights[peak+1] ) {
				while(peak+1<N &&  heights[peak]<heights[peak+1] )peak++;//ascending the mountain
				
				while(peak+1<N &&  heights[peak]>heights[peak+1] ) {
					peak++;// we are descending the mountain now
					
				}
				//System.out.println(longLen+":"+(peak-base+1));
				longLen=Math.max(longLen, peak-base+1);
				
				
			}base=Math.max(peak, base+1);
		}
		
		
		
		
		return longLen;
	}
	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		String input=s.nextLine();//2#2#1,4#8,9
		String[] arr=input.split("#");
		int row_len= Integer.parseInt(arr[0]);
		int col_len= Integer.parseInt(arr[1]);
		int[][] matrix=new int[row_len][col_len];
		
		for(int r_index=0;r_index<row_len;r_index++) {
			int[] row=Arrays.stream(arr[r_index+2].split(",")).mapToInt(Integer::parseInt).toArray();
			for(int c_index=0;c_index<col_len;c_index++) {
				matrix[r_index][c_index]=row[c_index];
			}
		}
		
		for(int[] each:matrix) {
		System.out.println(Arrays.toString(each));}
		
		s.close();*/
		int[] intA={1,2,3,4,2,1,0,1,2,1};
		System.out.println(findMountainSubArray(intA));
		
		//How do we toggle 1 and 2 use num=3-num%3;  initialize num=1;

	}

}
