package com.infy.pp1;

import java.util.Arrays;

public class Decrypt {

	public static void main(String[] args) {
		String data="yousuf";int len=data.length(),index=0,pos=1;
	char[] arr=new char[len];boolean isEvenArray=(len%2==0);
		
		int mid=!isEvenArray?len/2:len/2-1;
		
		arr[mid]=data.charAt(0);
		if(!isEvenArray)index=1;
		else {arr[mid+1]=data.charAt(1);index=2;}
		
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=index;i+1<len;i=i+2) {
			arr[mid-pos]=data.charAt(i);//irrespective of condition
			if(!isEvenArray)arr[mid+pos]=data.charAt(i+1);
			else	arr[mid+pos+1]=data.charAt(i+1);
			pos++;
		}System.out.println(new String(arr));
		
	}

}
