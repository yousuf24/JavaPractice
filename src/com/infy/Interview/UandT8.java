package com.infy.Interview;

public class UandT8 {

	public static void main(String[] args) {
		String input = "careydevelopment";
		StringBuilder sb = new StringBuilder();

		char[] chars = input.toCharArray();
		for (char c : chars) {
			
		    String binary = Integer.toBinaryString(c);
		    String formatted = String.format("%8s", binary);
		    String output = formatted.replaceAll(" ", "0");
		    sb.append(output);
		    sb.append(" ");
		}

		//System.err.println(sb.toString());
		
		
		


	}

}
