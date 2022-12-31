package hackerRank;
import java.util.*;

public class Solution16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String dup=sc.nextLine();//Here it is used as temp resource to not have any issue when intaking data henceforth. If u dont use it. \r\n will be considered for immediate sc.nextLine()
		ArrayList<ArrayList<String>> a=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String eL=sc.nextLine();
			
			a.add(i, new ArrayList<>(Arrays.asList(eL.split(" "))));
			
		}
//		for(List<String> each:a) {
//			System.out.println(each);
//		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			if(x<=a.size() && y>=0 && y<a.get(x-1).size()) {
				System.out.println(a.get(x-1).get(y));
			}else System.out.println("ERROR!");
				
		}
				
		sc.close();
	}

}