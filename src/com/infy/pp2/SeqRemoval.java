package com.infy.pp2;


public class SeqRemoval {


	public static void main(String[] args) {
		String data="Infosys global";//minimum two chars
		int[] seq= {2,4,8};int size=seq.length;
		
		
		char[] arr=data.toCharArray(); //convert data to charArray to program at char level
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<size;i++) {
			arr[seq[i]]=Character.MIN_VALUE;	//try to keep ' ' at the positions mentioned in seq[]		
		}
		
		String result0=String.copyValueOf(arr);
		result0=result0.replace(""+Character.MIN_VALUE, "");
		System.out.println(result0); //print the result
		
		//char c=Character.MAX_VALUE;
		//System.out.println(c);
		//System.out.println("aqieb"+Character.MIN_VALUE+"javed");
		
		
//		for(int i=0;i<size;i++) {
//		data=data.replace(data.charAt(seq[i]), '\0');
//		System.out.println(data);
//		}
//		
//		data=data.replace(""+'\0', "");
//		System.out.println(data);
	
		
	}

}


