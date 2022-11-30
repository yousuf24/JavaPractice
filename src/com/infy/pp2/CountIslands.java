package com.infy.pp2;
import java.util.*;
public class CountIslands {
	
	
	public static int numI(char[][] arr) {
		int rowS=arr[0].length,colS=arr[0].length;
		boolean[][] visited=new boolean[rowS][colS];
		int countOfIslands=0;
		
		for(int i=0;i+1<rowS;i++) {
			
			for(int j=0;j+1<colS;j++) {
				//System.out.println(arr[i][j]);
				if(arr[i][j]=='1' && i-1>=0  && j-1>=0) {
					if(Character.getNumericValue(arr[i-1][j]) +Character.getNumericValue(arr[i+1][j])+ 
							Character.getNumericValue(arr[i][j-1])+ Character.getNumericValue(arr[i][j+1])==1 ) {
						countOfIslands++;
						countI(arr,i,j,visited);}
				}
			}
			
		}
		
		
		
		
		return countOfIslands;
	}
	
	public static void countI(char[][] arr,int i, int j, boolean[][] visited) {
		int rowS=arr[0].length,colS=arr[0][0];
		if(i>=rowS || j>=colS || visited[i][j]==true || arr[i][j]=='0' || i<0 || j<0) {
			return;//this is best condition to give when u don't want to do anything becoz continue works only in loops
		}
		visited[i][j]=true;
		//Directions
		countI(arr,i-1,j,visited);//north
		countI(arr,i+1,j,visited);//south
		countI(arr,i,j+1,visited);//east
		countI(arr,i,j-1,visited);//west
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine(); //1,1,1,1,0#1,1,0,1,0#1,1,0,0,0#0,0,0,0,0   (row separator # column separator , )
		sc.close();
		
		String[] row=input.split("#");
		int size=row.length;
		char[][] arr=new char[row.length][row[0].split(",").length];//it is okay if u mention no size for columns
		int i=0;
		for(String each:row) {
			arr[i++]=each.replaceAll(",", "").toCharArray();
			
		}
		
		System.out.println(CountIslands.numI(arr));
	}

}

