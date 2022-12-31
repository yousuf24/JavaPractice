package dsa;

import java.util.Random;

public class UandT98 {

	public static void main(String[] args) {
		char one='a';
		char two='b';
		//System.out.println(one+""+two);
		String nm="yousufMd";
		//System.out.println(nm.charAt(new Random().nextInt(nm.length())));
		
		Random rand=new Random();
		String local=nm.replaceAll("yo","" );int len=local.length(); 
		//System.out.println(len);
		System.out.println(local.charAt(rand.nextInt(len)));

	}

}
