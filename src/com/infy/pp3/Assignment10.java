package com.infy.pp3;


import java.io.*;
import java.util.*;

class Assignment10
{
    public static String evaluate(String input){
    	
        String arr[]=input.split(":");
        int len=input.length();
        int size=arr.length;
        
        
        
        if(arr[0].equals("12") && arr[size-1].matches("\\d*AM")) return "00"+input.substring(2,len-2);
        else if( (arr[0].equals("12") && arr[size-1].matches("\\d*PM"))  || (arr[size-1].matches("\\d*AM")) ) return input.substring(0,len-2);
           else {
                 int local=Integer.parseInt(arr[0]);
                 return String.valueOf(local+12)+input.substring(2,len-2);
               
           }
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        String MilitaryTime=evaluate(inputString);
        System.out.println("Military Time: "+MilitaryTime);
        
    }
}
