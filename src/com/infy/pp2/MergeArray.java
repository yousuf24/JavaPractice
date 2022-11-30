package com.infy.pp2;

import java.util.*;
import java.util.stream.*;

public class MergeArray {

	public static void main(String[] args) {
		Integer[] gopal= {1,2,3};
		Integer[] madhav= {22,3,4};int totalS=madhav.length+gopal.length;

		//usuf's first thought of using streams
		/*Object[] arrayMerged= Stream.of(gopal,madhav)
		.flatMap(Stream::of)
		.toArray();
		System.out.println(Arrays.toString(arrayMerged));
		
		//method2
		Integer[] arr=new Integer[totalS];
		System.arraycopy(madhav, 0, arr,0,madhav.length );
		System.arraycopy(gopal, 0,arr , madhav.length,gopal.length);
		
		
		Arrays.sort(arr);//sorting using Arrays.sort
		System.out.println(Arrays.toString(arr));*/
		
		
		int num=100; //  0101  1111
		String bS1=Integer.toBinaryString(num);
		
		if( (num & (num-1)) == 0)System.out.println("Power of 2.");  //16 & 15 10000 01111 --> 00000 
		if(bS1.replaceAll("0", "").length()==1)System.out.println("Power of 2. *");
		

	}

}
