package com.infy.pp3;

import java.util.Stack;

public class AlgebraicExpression {
	public static int perform(Integer a, Integer b,char c) {
		switch (c){
		case '+': return a+b;
		case '-': return b-a;
		
		}
		return 0;
	}
	
	public static int evaluate(String input) {
		Stack<Integer> values=new Stack<>();
		Stack<Character> ops=new Stack<>();
		
		char[] arr=input.toCharArray();int size=arr.length;
		
		for(int i=0;i<size;i++) {
		
			if (arr[i] >= '0' &&arr[i] <= '9') {

				StringBuilder sb = new StringBuilder();
				while (i<size && arr[i]>='0' && arr[i]<='9') {
					 sb.append(arr[i++]);
				}
				
				values.add(Integer.parseInt(sb.toString()));
				System.out.println( values);
				
			} 
			if(arr[i]=='(') {
				ops.push('(');
				System.out.println(ops);}//"90-(4-1-(1+3))-10";
			
			//if it is closed braces then solve it
			else if(arr[i]==')') {
				
				while( ops.peek()!='('  ) {
					values.push(perform(values.pop(),values.pop(),ops.pop()));
						}
				
				ops.pop();
				
			}
			
			if(i<size && (arr[i]=='+' || arr[i]=='-')) {
				ops.push(arr[i]);
				System.out.println(ops);
				
			}
			

			//solve remaining
			while (!ops.isEmpty() && (ops.peek()!='(' || ops.peek()!=')') &&  values.size()>=2 ) {
				values.push(perform(values.pop(), values.pop(), ops.pop()));
			}
			
			
			
		}
		
		System.out.println(values);
		return values.pop();
	}
	

	public static void main(String[] args) {
		String input="90-(4-1-(1+3))-10";
		
	System.out.println(evaluate(input));
		
	
	}

}

