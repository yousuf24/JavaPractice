package hackerRank;

import java.util.regex.*;


public class Solution11 {

	public static void main(String[] args) {
		String tag="<div>yousuf mohammad practicing java hard</div><a>ScoobyDoo</a>";
		String regex="<(\\w+)>([^<]+)</\\1>";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher =pattern.matcher(tag);
		
		boolean isMatch=false;
		
		while(matcher.find()) { //matcher.find() method is very handy when it comes to finding pattern and moving forward. Once it finds the pattern, it will not do .find() on same data but move ahead
			
			System.out.println(matcher.group(2));
			isMatch=true;
			
		}
		if(!isMatch) System.out.println("None");

	}

}
