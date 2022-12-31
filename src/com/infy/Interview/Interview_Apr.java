package com.infy.Interview;

public class Interview_Apr {

	public static void main(String[] args) {
		//swap
        int num1=10,num2=20,temp=0;
        System.out.println(" BEFORE: num1 "+num1+" num2 "+num2);
        temp=num1; //LHS =RHS
        num1=num2;
        num2=temp;
        System.out.println("AFTER: num1 "+num1+" num2 "+num2);

        //without temp
        num1=10;num2=20;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("AFTER: num1 "+num1+" num2 "+num2);


        //palindrome
        String nm="arshiya",op=""; //ayihsra
        char[] arr=nm.toCharArray();//returns char array [a, r, s, h, i ,y,a]
        int len=arr.length;
        for(int i=len-1;i>=0;i--){
                op+=arr[i];
        }
        System.out.println(op);
        if(op.equals(nm))System.err.println("palindrome");//it will print in red font
        else System.err.println("not a palindrome");

	}

}
