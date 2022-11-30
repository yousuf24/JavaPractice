package com.infy.pp3;

import java.util.ArrayList;
import java.util.List;

public class PossibleSubstrings {

	public static void main(String[] args) {
		String input="mnonopoO";int size=input.length();
		List<String> AllSubstrings=new ArrayList<>();
		for(int i=1;i<=size;i++) {
			for(int j=0;j+i<=size;j++) {
				AllSubstrings.add(input.substring(j,j+i));
			}
		}
		List<String> spl=new ArrayList<>();
		for(String each:AllSubstrings) {
			if(each.replaceAll(""+each.charAt(0), "").length()==0)spl.add(each);
			else if(each.length()%2!=0 && each.replaceAll(""+each.charAt(0), "").length()==1)spl.add(each);
			else continue;
		}
		System.out.println(spl);
		

	}

}


