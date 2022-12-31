package hackerRank;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution9 {

	public static void main(String[] args) {
		//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
		//The length of A, B, C, or D can't be greater than 3.
		/*
		 * 000.12.12.034
	121.234.12.12
	23.45.12.56
	00.12.123.123123.123
	122.23
	Hello.IP
		 */
		/*String nm="122.23",
				pattern="([0-1]?[0-9]?[0-9]|[2][0-4]?[0-9]|25[0-5]).([0-1]?[0-9]?[0-9]|[2][0-4]?[0-9]|25[0-5]).([0-1]?[0-9]?[0-9]|[2][0-4]?[0-9]|25[0-5]).([0-1]?[0-9]?[0-9]|[2][0-4]?[0-9]|25[0-5])";
		//System.out.println(nm.matches(pattern));
		
		
		System.out.println(("255.").matches("([0-1]?[0-9]?[0-9]|[2][0-4]?[0-9]|25[0-5])."));*/
		
		
		
		//Remove duplicate words
		String input="Goodbye bye Bye world world World world";
		/*String[] arr=input.split("\r\n");
		System.out.println(Arrays.toString(arr));*/
		
		String regex="(?i)\\b(\\w+)(\\s+\\1\\b)+";
		//Pattern p=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Pattern p1=Pattern.compile(regex);
		System.out.println(p1.matcher(input).find());

		//Matcher m=p.matcher(input);
		//System.out.println(m);
		//System.out.println(m.find()+":"+m.group()+":"+m.group(1));
		
//		String modified=input.replaceAll("\\b(\\w+)(\\s+\\1\\b)+", "$1");
//		String modified2=input.replaceAll(m.group(), m.group(1));
		//System.out.println(modified2);
		
		/*while( true ) {
		      Matcher m = p.matcher(input);
		      if(!m.find()) break;
		      input = input.replaceAll(m.group(), m.group(1) );
		   }
		System.out.println(input);*/
		
		/* while( true ) {
		      String modif = input.replaceAll("\\b(\\w+)(\\s+\\1\\b)", "$1");
		      if(modif.equals(input)) break;
		      input = modif;
		   }
		 System.out.println(input);*/
		
		/*
		 * 
		 * A word boundary is a position that is either preceded by a word character and not followed by one, 
		 * or followed by a word character and not preceded by one. It's equivalent to this:

			(?<=\w)(?!\w)|(?=\w)(?<!\w)
		 */
		
		

	}

}
