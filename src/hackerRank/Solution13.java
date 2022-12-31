package hackerRank;

import java.math.*;
import java.util.*;

public class Solution13 {
	public static void main(String[] args) {
		String[] s= {"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
		/*List<BigDecimal> numbers=new ArrayList<>();
        for(String each:s){
            numbers.add(new BigDecimal(each));
        }
        Collections.sort(numbers, (x1,x2)->x2.compareTo(x1));
        System.out.println(numbers);*/
		
		int len=s.length;
		for(int i=0;i<len;i++) {
			BigDecimal first=new BigDecimal(s[i]);
			int index=i;
			
			for(int j=i+1;j<len;j++) {
				BigDecimal second=new BigDecimal(s[j]);
				if(second.compareTo(first)>0) {
					first=second;
					index=j;
				}
			}
			//interchange values at index and i
			String temp=s[i];
			s[i]=s[index];
			s[index]=temp;
			
			
			
		}System.out.println(Arrays.toString(s));
		
	}
}
