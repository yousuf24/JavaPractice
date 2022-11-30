package com.infy.pp0;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegexDemo {

	public static void main(String[] args) {
		String regex="^(?=.*[\\d])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&_]).+$";
		//atleast 1 digit, 1 small case, 1 upper case 1 special char
		Matcher matcher=Pattern.compile(regex).matcher("aqieb.javed1996@gmail.com");
		
		matcher.matches();//returns boolean
		//ascii values from 65 to 91 and 97 to 120
		
		Stream<Integer> intStr=Stream.of(1,45,36,99,90,21,19,18,63,10);
		
		Optional<Integer> finalV=intStr.filter(x->x>=10).reduce((a,b)->a+b);
		finalV.ifPresent(System.out::println);
		finalV.orElse(0);
		
		List<Integer> list0=Arrays.asList(1,34,56,78,98);
		list0.stream().filter(x->x>=1).sorted((a,b)->a-b).forEach(x->System.out.print(x+" "));;
		
		

	}

}
