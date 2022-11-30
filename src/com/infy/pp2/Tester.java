package com.infy.pp2;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

class Utility {
	public static String modifyDataWithSeries(String input,int[] arr) {
		//int maxLength=input.length();
		StringBuilder modifiedData=new StringBuilder(input);//captures given string in StringBuilder
		
		//System.out.println("Str:"+modifiedData.toString() +" "+Arrays.toString(arr));
		
		int size=arr.length,j=0;
		
		for(int i=0;i<size;i++) {
		//modifiedData.replace(arr[i]-j,arr[i]-j+1,"" );j++;//logic to remove the characters specified at positions in array this j is important as we are doing concurrent work
		input=input.replace(input.charAt(arr[i]-j)+"", "");j++;
		
		}
		System.out.println(input);
		return modifiedData.toString();//converts back to string
	}
}
class Tester {
    public static void main(String[] args) throws Exception{
    	Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();//scans the input in format   "infosys global,2,4,8"
		in.close();
		
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());//splits into [infosys global,2,4,8]
		int size=inputData.size();
		int[] arr=new int[size-1];int j=0;
		
		for(int i=1;i<size;i++) {//you can make use of Array and convert to int[]
			arr[j]=Integer.parseInt(inputData.get(i));j++;//loads into array [2,4,8]
		}
		
		String S=inputData.get(0);//captures infosys global
		
		if(S!=null && S.length()>=2) {
		String data=Utility.modifyDataWithSeries(S,arr); //function call
		
		System.out.println(data);}
		else throw new Exception("pls add valid string!");
//		String name="Yousuf mohammad Shaik Khan";j=0;
//		for(int i=0;i<size-1;i++) {
//			
//			name.replace(name.charAt(arr[i]-j)+"","");j++;
//		}
        
    }
}

