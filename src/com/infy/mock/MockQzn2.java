package com.infy.mock;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import java.io.*;

public class MockQzn2 {
	
	public static int findSteps(int[] arr) {
		
		
		
		return -1;
	}

	public static void main(String[] args) {
		// NO of steps needed to make all array elements equal
		// arr =[1,2,3,4];  step1: A[3]=1, A[1]=1  at most 2 operations can be 1;  step2: A[2]=1
		//arr =[1,1,1] ; if all elements in array are same then not needed steps: 0
		
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();	
		s.close();
		
		String[] arr=input.split("#"); // <size>#<n1>,<n2>,<n3>..... eg: 5#10,12,3,36,23  --> ["5", "10,12,3,36,36"]
		int size=Integer.parseInt(arr[0]); //5
		
		String[] arr2=arr[1].split(","); //[10,12,3,36,36]
		Map<Integer,Long> map_col=Arrays.stream(arr2).map(Integer::parseInt).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		// {10=1, 12=1,3=1,36=2}
		
		int[] arr3=Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray();
		//methods of map
		Set<   Integer         > t_n_s=map_col.keySet(); //{10,12,3,36}
		
		Set<  Entry<Integer,Long>    > ess=map_col.entrySet();  //{10-1,12-1,3-1,36-2}
		
		
		
		
		
		Collection<Long> col=map_col.values();  //{1,1,1,2}
		Long maxV=Collections.max(col); //maximum frequency 
		int toCollect=0;
		
// wrapper class(chocolate + gift paper) Integer, Long, Double,Boolean derivatives of object class  |   primitive class (just chocolate)  eg: int, long, double, char,boolean,short,byte
		
		
		
		for(Integer each:map_col.keySet()) {
			if(map_col.get(each)==maxV.longValue())toCollect=each;//to find max repeated element
		}
		
		
		if(maxV==1)System.out.println("no of steps required is "+ (size/2) );
		else if(maxV==size)System.out.println("No of steps required is :"+ 0);
		else {
			if((size - maxV) %2==0)System.out.println("No of steps required is : "+ (size - maxV)/2);
			else System.out.println ( (size - maxV)/2 +1);
		}
		
		
		int result=findSteps(arr3);
		//System.out.println(result);
		
/*
 * [1,0,9,8,7,3,1,1,4] -->make all the array elements same [1,1,1,1,1,1,1] or [0,0,0,0,0,0,0,0] or [4,4,4,4,4,4]
 * rules:
 * 1. You can at max change adjacent element in one iteration ( cyclic order is present) 
 * 2. Find the no of steps/iterations required to make all elements same
 * 
 * 
 * 
 */
		Map<String, String> map=new HashMap<String,String>();
		map.keySet();


	}

}









