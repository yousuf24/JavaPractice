package com.infy.pp3;

import java.util.Stack;

public class RemoveFromAlgebraicString {
	public static String solve(String input) {
		int size=input.length();
		char[] res=new char[size];//take result char[] and change it to string at the end
		int index=0,i=0;
		Stack<Integer> toggle=new Stack<>(); // for toggle operations when input.charAt(i-1)=='-' and input.charAt(i)=='('
		toggle.push(0);// push value 0 initially
		
		while(i<size) { //use while loop instead of for loop; Any loop can be used
			if (input.charAt(i) == '(' && i == 0) {
				i++;
				continue;
			}
			
			if(input.charAt(i)=='-') {
				if(toggle.peek()==1)res[index++]='+';
				else res[index++]=input.charAt(i);
			}
			else if(input.charAt(i)=='+') {
				if(toggle.peek()==1)res[index++]='-';
				else res[index++]=input.charAt(i);
			}
			else if(input.charAt(i)=='(' && i!=0) {
				if(input.charAt(i-1)=='-') toggle.push(toggle.peek()==0?1:0);
				else toggle.push(toggle.peek());
			}
			else if(input.charAt(i)==')')toggle.pop();
			//else if(input.charAt(i) == ')' && i == 0)i=0;
			else res[index++]=input.charAt(i);
			
			
			i++;
		}
		
		
		return new String(res);
		
	} 

	public static void main(String[] args) {
		String input="(a-(b+c)+d)"; //problem is to solve the algebraic braces interchanging - & +
		//main logic when - is encountered before ( then flip the operator with in the braces use Stack<Integer> for toggling operations
		System.out.println(solve(input).replace('\0'+"", ""));

	}

}


