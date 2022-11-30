package com.infy.mock;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntakeOfInput {

	public static void main(String[] args) throws IOException {
		
		//Method1 
		
				
	            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //"Location"
	        
	            String line=buffer.readLine(),arrAsString = "";int size=0;
	            
	            while (line  != null && line.length()!=0)
	            {
	            	if(size==0)size=Integer.parseInt(line); //String.valueOf(line)
	            	else arrAsString=line;
	            	
	            	line=buffer.readLine();
	               
	            }
	            int[] arr=new int[size];
	            arr=Arrays.stream(arrAsString.split(",")).mapToInt(Integer::parseInt).toArray();
	        	
	    		
//input given in below format	            
/*
10
2,3,4,5,6,7,8,9,0,1 
	
	       
size = 10;
arrAsString= "2,3,4,5,6,7,8,9,0,1" -->String[] arr = 	arrAsString.split(","); 

String name="teja nhayade" ; String[] tejaArr=name.split(" "); List = Arrays.stream(tejaArr).map(Integer::parseInt).collect(collectors.toList());

Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
 */
		
	
		System.out.println(Arrays.toString(arr));
		
			
			

		

	}

}

/*
1,2,3,4,5,6
2,3,4,5,6,7
3,4,5,6,7,8
10
1,2,3,4,4,55,6,6,76,0

*/
