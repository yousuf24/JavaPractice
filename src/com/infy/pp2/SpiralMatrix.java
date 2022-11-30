package com.infy.pp2;


import java.util.Arrays;

public class SpiralMatrix {
	public static void isV(int[][] arr,int i, int j,boolean[][] visited) {
		visited[i][j]=true;
	}

	public static void main(String[] args) {
		int[][] arr2D=new int[][] {{1,2,3},{8,9,4},{7,6,5}};
		int rowS=arr2D.length,colS=arr2D[0].length;
		boolean[][] visited = new boolean[rowS][colS];
		
		
int x=0,y=0,counter=0;		
while(x<rowS && x>=0 && y<colS && y>=0) {

	
	isV(arr2D,x,y,visited);
	System.out.println( arr2D[x][y]);
	y++;		
		if(y==colS-1)
		System.out.println( arr2D[y][x]);x++;
		
		if(x==rowS-1) {
			y=x-1;x=y;
			System.out.println( arr2D[x][y]);y--;}
		if(y<0) {
			x=x-1;y=0;
			System.out.println(arr2D[x][y]);x--;
		}
		
		
		for(int i=0;i<visited.length;i++) {
			for(int j=0;j<visited[0].length;j++) {
				if(visited[i][j]==true) counter++;
			}
		}
		
		if(counter==colS*rowS)break;
	
}
		
		
		
		
		
//		for(boolean[] each:visited) {
//			System.out.println(Arrays.toString(each));
		/*
		 * 
1 1 1 1 0
1 1 0 1 0
1 1 0 0 0
0 0 0 0 0

cons,increase
00 01-->thru colns.... 0n-1
increase,const
1,n-1    2,n-1   3,n-1 .......  n-1,n-1

const,decrease
n-1,n-2  n-1,n-3  ...............n-1,0
decrease,const
n-2,0 n-30.............10

const,increase
11 12 ................1n-2

follow untill all visited nodes are true and break from loop

		 */
		
		
		
		
//		}
	}

}

