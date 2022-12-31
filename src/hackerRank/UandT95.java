package hackerRank;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UandT95 {

	public static void main(String[] args) {
		/*int num=99;String op="";
		//all the primes till 99
		for(int i=2;i<=num;i++) {
			boolean flag=true;
			for(int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {flag=false;break;}
			}if(flag)op+=i+" ";
		}System.out.println(op);*/
		
		/*Object arr[]={42,"yousuf"};//{42,10,"###","hello","java"};
		List<Object> li=Arrays.asList(arr);
		Iterator it=li.iterator();
		while(it.hasNext()) {
			Object element=	it.next();
			
			if(element instanceof String)break;
		}
		
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}*/
		
		String name=" 1 -2 4 -5 1 ";
		
		//System.out.println(name.replaceAll("\\s+$", ""));
		//Object[] arr=Stream.of(name.split(" ")).map(Integer::parseInt).toArray();
		Stream<String> str=Arrays.stream(name.replaceAll("(\\s+$|^\\s+)", "").split(" "));
		
		int[] arr1=str.mapToInt(Integer::parseInt).toArray();
		
		int size=arr1.length,counter=0;
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				int sum=0;
				int[] subArr=Arrays.copyOfRange(arr1, i, j+1);
				
				for(int k=0;k<subArr.length;k++)sum+=subArr[k];
				if(sum<0) {System.out.println(Arrays.toString(subArr));;counter++;}
			}
		}System.out.println("no of negative subArrays: "+counter);
		
		
		
		
		
		
		
		
		
		
		
	}

}
