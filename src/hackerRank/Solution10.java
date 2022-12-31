package hackerRank;

public class Solution10 {
	public static String reg = null;
	
	public static void main(String[] args) {
		//8-10 chars (\\w) starts with alphabet
		reg="[a-zA-Z]\\w{7,29}";
		String input="samanth?_102A";
		boolean flag=input.matches(reg);
		if(flag)System.out.println("VALID");
		else {
			if(input.length()<8)System.out.println("INVALID; Username length < 8 characters");
			else if(input.matches("\\d.*"))System.out.println("INVALID; Username begins with non-alphabetic character");
			else if(!input.matches("[a-zA-Z]\\w{7,29}")) {
				char[] arr=input.toCharArray();
				for(char each:arr) {
					if(!(each+"").matches("\\w")) {System.out.println("INVALID; '" +each+"' is not allowed");break;}
				}
			}
		}
		
		
		String nm="juliaGreat?";
		//System.out.println(nm.matches("^\\d.*"));

	}

}
