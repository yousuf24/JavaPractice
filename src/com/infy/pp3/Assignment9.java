package com.infy.pp3;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Assignment9 {
	
	public static String isV(String in) {
		char[] arr = in.toCharArray();
		int size2 = arr.length;
		boolean flag = true;
		
		

		for (int j = 0; j + 1 < size2; j++) { // iterate through character array
			if (arr[j + 1] == arr[j]) {
				arr[j + 1] = Character.MIN_VALUE;
				flag = false;
			} else
				continue;
		}
		arr=new String(arr).replaceAll("" + Character.MIN_VALUE, "").toCharArray();
		
		
		if(flag) return in;;
		
		while (!flag)
			return isV(String.copyValueOf(arr));
		
		
		return String.copyValueOf(arr);

		
	}
	
	
	public static String[] solve(String[] arr) {
		int size = arr.length;
		String[] arrT = new String[size];

		for (int i = 0; i < size; i++) {
			arrT[i] = isV(arr[i]);

		}

		return arrT;
		
	}
	
	
	
	
	public static void main (String[] args) throws java.lang.Exception
    {
        
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		String[] arr = new String[T];

		for (int i = 0; i < T; i++) {
			arr[i] = s.next();
		}
		s.close();
		String[] res = solve(arr);
		for (String each : res) {
			System.out.println(each);
		}

	
        
    }

}


