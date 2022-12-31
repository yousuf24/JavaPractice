package dsa;

public class CodeLeadQ2 {
	public static int eval(int[] arr,int K) {
		int size=arr.length,noOfPairs=0;
		//Complexity O(n^2)
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				int local=arr[i]*arr[j];
				//System.out.println(arr[i]+"*"+arr[j]+"="+local);
				if(local%K==0)noOfPairs++;
			}
		}
		
		return noOfPairs;
	}

	public static void main(String[] args) {
		//Find the distinct or unique ordered pairs whose product is divisible by integer K.( Note : i!=j)
		int[] arr= {2,3,4,6,7,8};
		int result=eval(arr,3);
		System.out.println(result);

	}

}
