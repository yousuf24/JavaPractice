package com.codility;

import java.util.*;
import java.util.stream.Collectors;
class Excep1 extends Exception{
	Excep1(String msg){
		super(msg);
	}
}

class Excep2 extends Exception{
	Excep2(String msg){
		super(msg);
	}
}

class Excep3 extends Exception{
	Excep3(String msg){
		super(msg);
	}
}
public class Mock1 {
	public static int code(String[] A) throws Exception {
		//Code is correct
		
		int size = A.length;
		String strng = "", op = "";
		// excep1
		if (size > 8 || size < 1)
			throw new Excep1("Please provide input array of length<=8 && >=1");
		// Excep2
		for (String each : A) {
			strng += each;
			int len = each.length();
			for (int i = 0; i < len; i++) {
				if (!Character.isLowerCase(each.charAt(i))) {
					throw new Excep2("Each string in A should be of lowercase");
				}
			}
		}
		// Excep3
		if (strng.length() > 100)
			throw new Excep3("Sum of lengths in String[] A shouldn't exceed 100");

		// start code here
		List<String> valid = new ArrayList<>();
		for (String e : A) {
			int localLen = e.length();
			boolean flag = true;
			for (int i = 0; i < localLen; i++) {

				if ((e.length()) - (e.replaceAll("" + e.charAt(i), "")).length() != 1) {
					flag = false;

				}

			}
			if (flag)
				valid.add(e);
		}
		// System.out.println(valid);
		valid = valid.stream().sorted((x1, x2) -> x2.length() - x1.length()).collect(Collectors.toList());
		System.out.println(valid);

		if (valid.size() == 0)
			return 0;
		else {
			// System.out.println(valid);
			op += valid.get(0);int len2=valid.size();
			for (int j = 1; j < len2; j++) {
				int len = valid.get(j).length();
				String loc = "";
				boolean f = true;
				String toA = valid.get(j);
				for (int i = 0; i < len; i++) {
					if (op.contains(toA.charAt(i) + ""))
						f = false;
					loc += toA.charAt(i);

				}
				if (f)
					op += loc;
			}

		}
		System.out.println(op);
		return op.length();

	}
	
	
	
	public static void main(String[] args) throws Exception {
		String[] A= {"inf","o","sy","tc","openxt","delo"};
		System.out.println(code(A));

	}

}
