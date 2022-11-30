package com.infy.mock;

import java.util.*;
import java.util.stream.*;


public class MockQzn1 {

	public static void main(String[] args) {
		// input string 0010101 , final string 0100101, writer 00000 
		//rotate operation cost 2$ , write operation cost 3$
		
		/*
		 * Algorithm, psuedo code, DS used, final coding
		 */
		
		String input="00000111100";int len=input.length();
		String fin_S="00111100000",lsv="",rsv=""; int fin_S_int=Integer.parseInt(fin_S, 2);
	   String writer="10000000100";int iter=0;
		int shiftCost=2,writeCost=3,totalCost=0;
		
		//******************USECASE 1***********************
		//if(writer.replace("0", "").length()==0) {
		//if writer has no 1's , u can do only shifting, you dont need this condition u can avoid lines 50-56
			
			while(iter<len) { // iterates 'len' times
				//leftshift
				String left=input.substring(iter)+input.substring(0, iter);
				String right=input.substring(len-iter)+input.substring(0,len-iter);
				if(left.equals(fin_S) || right.equals(fin_S)) { totalCost=(shiftCost*iter);   break;}
				iter++;
			}
			
			
		//}
		//System.out.println("total cost :"+ totalCost+"$");
		//******************USECASE 2***********************
		//Find if there is chance to achieve fin_S just by rotating
		//int input_int=Integer.parseInt(input, 2);
//		for(int i=0;i<len;i++) {
//			lsv=String.format("%8s",Integer.toBinaryString(input_int<<i));
//			rsv=Integer.toBinaryString(input_int>>i);
//			System.out.println(lsv+" : "+rsv+" : "+fin_S );
//			 if(lsv.equals(fin_S) || rsv.equals(fin_S)) {
//				 totalCost+=(shiftCost*i);
//				 break;
//			 }
//		}
		iter=0;
//		while(iter<len) {
//			lsv=input.substring(iter)+input.substring(0,iter);
//			rsv=input.substring(len-iter)+input.substring(0,len-iter);
//			//System.out.println(lsv+":"+rsv);
//			if(lsv.equals(fin_S) || rsv.equals(fin_S)) {  totalCost=(shiftCost*iter);break;}
//			iter++;
//		}
		
		if(totalCost>0)System.out.println("Just by rotating"+totalCost+"$");
		
		
		//Find which bits are 1 in writer
		iter=0;List<Integer> list=new ArrayList<>();
		
		// setting ith position  n | i<<1
		//get ith pos   n & i<<1
		
		int writer_int=Integer.parseInt(writer,2);
		while(iter<len) {
			
		   if( (writer_int	&  (1<<iter)) !=0) list.add(iter);
			
			iter++;
		}
//		System.out.println(list);
		boolean flag=false; // to set to true only if u could reach fin_S
		
		int list_size=list.size(),j=0;
		
		
		
		//System.out.println("totalCost "+totalCost);
		
		
		//Grab F and try to do left and right shifts to see if there is chance to reach fin_S
		int var=0;
		while (var < len) {
			if (flag)break;

			String _shifted = input.substring(var) + input.substring(0, var);
			String shifted_ = input.substring(len - var) + input.substring(0, len - var);
			//System.out.println(_shifted+" : "+shifted_);
			j=0;
			while (j < list_size) {
				iter = 0;
				int FL = Integer.parseInt(_shifted, 2) | (1 << list.get(j));
				int RL = Integer.parseInt(shifted_, 2) | (1 << list.get(j));
				iter++;
				
				String local3 = Integer.toBinaryString(FL);
				while (local3.length() < len)local3 = "0" + local3;
				
				String local4 = Integer.toBinaryString(RL);
				while (local4.length() < len)local4 = "0" + local4;
				
				//System.out.println(local3+":"+local4);

				//System.out.println(local3.equals(fin_S) + " " + var + " : " + local4.equals(fin_S) + " : " + fin_S);
				//System.out.println(local3 + " " + var + " : " + local4+ " : " + fin_S);

				if (local3.equals(fin_S) || local4.equals(fin_S)) {
					
					totalCost += (shiftCost * var + (j+1*writeCost));
					flag = true;
					break;
				}
				
				if(( FL | writer_int) ==fin_S_int || (RL | writer_int)==fin_S_int) {
					totalCost += (shiftCost * var + (list_size*writeCost));
					flag=true;break;
				}
				
				j++;

			}

			var++;
		}
		
		
		if(flag)System.out.println("total cost :"+ (totalCost)+"$");
		else System.err.println("Can't make them equal.");
		
		//***********************************************
		String a="0010101";int size=a.length();
		//System.out.println("Original     :  "+a);
		String a_shifted=a.substring(3)+a.substring(0,3);//shift left by 3 using string operations  circular one
		//System.out.println("Left  circular: "+a_shifted);
		
		String a_right=  a.substring(size-3) + a.substring(0,size-3);// shift right by 3 using string Operations circular one
		//System.out.println("Right circular: "+a_right);
		
		
		// **********************************************
		StringBuilder sb=new StringBuilder(a);
		//System.out.println("OS:"+sb.toString());//Alternate way of circular shift
		int leftShift=3,i=0;
		while(i<leftShift) { //shift left by 3 using string operations  circular one
			char local=sb.charAt(0);
			
			sb.append(local);
			sb.deleteCharAt(0);
			i++;
		}
		
		//System.out.println("LS:"+sb.toString());
		StringBuilder sb1=new StringBuilder(a);
		
		int rightShift=3;i=0;
		
		while(i<rightShift) {//right left by 3 using string operations  circular one
			char local=sb1.charAt(size-1);
			sb1.deleteCharAt(size-1);
			sb1.insert(0, local);
			i++;
		}
		//System.out.println("RS:"+sb1.toString());
		
		
		
		
		
		
		//***********************************************
	    i = Integer.parseInt("1010101010", 2); //converting binarystring to integer
	    //System.out.println(i);
	    String shiftedi = Integer.toBinaryString(i<<4).substring(4);  //0101010000
	    System.out.println(shiftedi);
	}

}


