package leetCode;

public class Qzn50 {
	public static double soln(double x,int n) {
		double ans=1.0;int n_modified=-1;boolean flag=n<0;
		if(flag)n=n_modified*n;
		
		while(n>0) {
			if(n%2==0) {
				x=x*x;
				System.out.println("inside if "+ x);
				n=n/2;
			}
			else {
				ans=ans*x;
 				System.out.println("inside else "+ans);
				n=n-1;
			}
		}
		if(flag)return 1.0/ans;
		return ans;
	}

	public static void main(String[] args) {
		// x^n
		System.out.println(soln(2,8));

	}

}
