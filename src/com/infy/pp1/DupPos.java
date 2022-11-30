package com.infy.pp1;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

public class DupPos {
	public static int[] arrCopy(int[] arr,int pos,int element) {
		int[] newArr=Arrays.copyOf(arr, arr.length+1);int size=arr.length; //[1,2,3,4,5,6]
		newArr[size]=element;
		
		for(int i=size;i-1>=pos;i--) {
			int temp=newArr[i];
			newArr[i]=newArr[i-1];
			newArr[i-1]=temp;
			
		}
		
		
		return newArr;
	}
	public static int formNum(int[] in,int[] freq) {
		int len=freq.length;String op="";StringBuilder sb=new StringBuilder();
		String[] arr=new String[len];int index=0;
		for(int e:in)arr[index++]=String.valueOf(e);
		
		for(int i=0;i<len;i++) {
			op+=arr[i].repeat(freq[i]);
		}
		
		//another way
		index=0;
		while(index<len) {
			sb.append((""+in[index]).repeat(freq[index]));
			
			index++;
		}
		
		
		return Integer.parseInt(op);//you can also return sb.toString();
	}

	public static void main(String[] args) {
		Integer[] arr= {1,2,3,18,45,18,90,63};// need dup index/position and uniq array
		int size=arr.length;
		Map<Integer,Long> map=Arrays.stream(arr).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		int len=map.size();// uniq arrayLength
		Set<Integer> uniq=map.keySet();//uniq values
		
		List<Integer> dup=new ArrayList<>();
		
		for(Entry<Integer,Long> entry:map.entrySet()) {
			if(entry.getValue()==2)dup.add(entry.getKey());
		}
		//get the index
		for(int i=0;i<size;i++) {
			//if(dup.contains(arr[i]))System.out.println("dup index found at : "+i);
		}
		
		int[] in_arr={1,2,3,4};
		//System.out.println(Arrays.toString(arrCopy(in_arr,2,7)));
		int[] freq= {1,2,0,1};
		System.out.println(formNum(in_arr,freq));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
