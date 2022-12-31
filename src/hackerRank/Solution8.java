package hackerRank;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution8 {

    public static void main(String[] args) {
        
        //String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String s="        ";
        // Write your code here.
        String new_s=s.replaceAll("(^\\s+|\\s+$)","");
        //char[] spl={'!' , ',' , '?' , '.','\'','@'};
        
        if(!new_s.isBlank() && new_s.length()>0 ) {
        new_s=new_s.replaceAll("[!,?._'@]", " ");
        
        String[] arr=new_s.split("\\s+");
        
        for(String each:arr){
            System.out.println(each);
        }}else System.out.println(0);
        
        Scanner in=new Scanner(System.in);
        int testCases=5;
        while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try{
                  Pattern.compile(pattern);
                  System.out.println("Valid");}
              catch(PatternSyntaxException e){
                  System.out.println("Invalid");
              }testCases--;
		}in.close();
        
    }
}

