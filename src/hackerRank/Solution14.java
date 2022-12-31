package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		br.close();
		int num=Integer.parseInt(s);boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {flag=false ; break;}
		}if(flag)System.out.println("PRIME.");
		else System.out.println("NOT PRIME.");
		
		/*BigInteger bi=new BigInteger(s);
		
		for(BigInteger i=BigInteger.valueOf(2);i.compareTo(bi)<0;i=i.add(BigInteger.ONE)) {
			System.out.println(i);
			
		}*/

	}

}
