package com.infy.pp0;

import java.util.*;

public class EvaluateExpression {
	public static int evaluate(String in) {
		char[] arr=in.toCharArray();//String to char array conversion
		int size=arr.length;
		
		Stack<Integer> values=new Stack<Integer>();
		Stack<Character> op=new Stack<Character>();
		
		for(int i=0;i<size;i++) {
			if(in.charAt(i)==' ')continue;
			StringBuilder sb=new StringBuilder();
			if(i<size && arr[i]<='9' && arr[i]>='0' ) {
				sb.append(arr[i++]);
			
			values.push(Integer.parseInt(sb.toString()));
			}
			if(arr[i]=='(')op.push(arr[i]);
			if(arr[i]==')') {
				while(op.peek()=='(') {
					values.push(applyOp(op.pop(),values.pop(),values.pop()));
					}
				op.pop();
					}
			if(arr[i]=='*' || arr[i]=='/' || arr[i]=='+' || arr[i]=='-') {
				//while top operator has preference over current operator then continue
				while(!op.isEmpty() && hasPreference(arr[i],op.peek())) {
					values.push(applyOp(op.pop(),values.pop(),values.pop()));
				}
			}
			
			while(!op.isEmpty() && values.size()>=2)values.push(applyOp(op.pop(),values.pop(),values.pop()));
				
			
		}
		
		
		
		
		return values.pop();
	}
	public static int applyOp(Character c,int a,int b) {
		switch(c) {
		case '*': return a*b;
		case '/': return a/b;
		default: return a+b;
		}
	}
	
	public static boolean hasPreference(char op1,char op2) {
		if(op2=='(' ||  op2==')')return false;
		else if((op2=='+' || op2=='-')  && (op1=='*' || op1=='/') )return false;
		else return true;
			
	}

	public static void main(String[] args) {
		String	input="(100/2)-(12*(3+2))";
		evaluate(input);
	}

}
