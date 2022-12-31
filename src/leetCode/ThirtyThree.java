package leetCode;

public class ThirtyThree {
	public static int eval(int[] arr,int target) {
		//Use binary search to simply cut it
		
		int high=arr.length-1,low=0;
		
		while(low<=high) {
			int mid=(high+low)/2;
			if(arr[mid]==target)return mid;
			else if(arr[low]<=arr[mid] ) {//left side is sorted
				if(target<arr[mid] && target>=arr[high])low=mid+1;
				else high=mid-1;
			}
			else if(arr[high]>=arr[mid] ) {//right side is sorted
				if(target<arr[mid] && target>=arr[low])high=mid-1;
				else low=mid+1;
			}
		}
		
		
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {4 ,5 ,6, 9 ,1 ,2, 3}; //7,9,1,2,3,4,5
		int target=9;
		int soln=eval(arr,target);
		System.out.println(soln);
		return;
	}

}
