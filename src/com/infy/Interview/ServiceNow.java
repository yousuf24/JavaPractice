package com.infy.Interview;

import java.util.*;

public class ServiceNow {

	public static void main(String[] args) {
		 String name="yousuf mohammad",op="";//fusuoy dammahaom
		 Arrays.stream(name.split(" "))
		 .map(x->{
			 String local="";
			 char[] localArr=x.toCharArray();int len=localArr.length;
			 for(int i=len-1;i>=0;i--) {
				 local+=localArr[i];
			 }return local;
			 }).forEach(each->{System.out.print(each+" ");});		 
		 
		 System.out.println();
		 //swap two numbers without using temp
		 int num1=10,num2=20;
		 num1+=num2;
		 num2=num1-num2;
		 num1-=num2;
		 System.out.println("num1 "+num1+": "+"num2 "+num2);
		 
		 

	}

}
