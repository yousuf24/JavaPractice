package com.infy.pp0;

import java.io.*;
import java.util.*;
public class ReadData {
	public static void run(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			
				//if(i+j>n)System.out.print("* ");//right angled
				//if(i+j<n)System.out.print("* ");//inverted right Angled
				
				/*if(i+j<=n)System.out.print(" ");// Equilateral triangle
				else System.out.print("* ");              */
				
				if(i+j>n)System.out.print(" ");// Equilateral triangle
				else System.out.print("* "); 
				
				
				
				}System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		/*
		//01. inputStreamReader | bufferedReader and method readLine()
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		//02. scanner class
		Scanner scanner=new Scanner(System.in);
		scanner.nextLine();
		
		//03. Console Class
		String input=System.console().readLine();
		
		//04. Command line
		if(args.length>0)for(String e:args)System.out.println(e);
		else System.out.println("No Arguments found");*/
		ReadData rd=new ReadData();
		//rd.run(5);
		//int num=5;
		//while(num>=1) {rd.run(num);num--;}
		
		
		System.out.println((char)90);
		List<String> names= Arrays.asList("yousuf","mohammad","teja","jones","jamie");
		
		 //interface is comparator which implements compare method that returns integer
		names.sort((x1,x2)->x1.compareTo(x2)); // alphabetic sort
		names.sort((x1,x2)->x1.length()-x2.length());//asc order of their lengths |
		names.sort((x1,x2)->x2.length()-x1.length());//DESC of their lengths
		//System.out.println(names);

		
		
		
	}

}
