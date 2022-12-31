package dsa;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class CodeLeadQ1 {
	public static int findFact(int n) {
		int factN=1;
		if(n>0)
			for(int i=n;i>=1;i--) {
				factN*=i;			
				}
		else factN=1;
		
		return factN;
	}
	public static int eval(String S,int Q,int[] arr,String x, String y) {
		int size=S.length(),globalV=0;
				
		
		String op="";//To find the limit numerator 5P3 for 7 byte string input and 3 as arr[i]
		//System.out.println(factN);
		
		for(int i=0;i<Q;i++) {
			String mer=x.charAt(i)+""+y.charAt(i);op=mer;
			String local=S.replace(mer, "");
			Set<String> uniq2=Arrays.stream(local.split("")).collect(Collectors.toSet());
			
			int factN=findFact(uniq2.size());
			
			//System.out.println(op);
			
			int len=arr[i], factD=findFact(uniq2.size()-(len-2));//To find the limit denominator 4P1 for 7 byte string input and 3 as arr[i]
			//System.out.println(factD);
			Set<String> uniq=new HashSet<>();
			Random rand=new Random();
			int limit=factN/factD; // 5 60 0 
			System.out.println(factN+":"+factD);
			
			//System.out.println(S.contains(mer));
			if(S.contains(mer)) {				
				
				while(true) {
					if(uniq.size()==(limit))break;
					if(op.length()==len) {uniq.add(op);op=mer;}				
					op+=(local).charAt(rand.nextInt(size-2));
					//System.out.println(op);
				
				}globalV+=uniq.size();
				}
			else globalV+=0;
			
			System.out.println(uniq);
		}
		
		
		return globalV;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,4};
		int result=eval("astdssy",3,arr,"ada","ssd"); // 5 60
		System.out.println(result);
		
		return;
	}

}
