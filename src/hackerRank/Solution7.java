package hackerRank;
import java.util.*;
import java.util.Map.Entry;
public class Solution7 {
	
	  static boolean isAnagram(String a, String b) {
	        String[] arr=a.replaceAll("\\W+$","").split("");
	        String[] arr2=b.replaceAll("\\W+$","").split(""); boolean flag=true;
	        Map<String,Integer> freq=new HashMap<>();
	        for(String each:arr){
	        	each=each.toLowerCase();
	            if(freq.containsKey(each))freq.put(each, freq.get(each)+1);
	            else freq.put(each, 1);
	        }
	        Map<String,Integer> freq2=new HashMap<>();
	        for(String each:arr2){
	        	each=each.toLowerCase();
	            if(freq2.containsKey(each))freq2.put(each, freq2.get(each)+1);
	            else freq2.put(each, 1);
	        }
	      
	        
	        //comparing two maps if they are equal
	        if(freq.size()==freq2.size()) {
	        for(Entry<String,Integer> entry:freq.entrySet()){
	            //entry.getKey();entry.getValue();
	            if(!freq2.containsKey(entry.getKey())) flag= false;
	            else if (freq2.containsKey(entry.getKey())){
	                if(freq.get(entry.getKey())!=freq2.get(entry.getKey()))flag= false;
	            }
	        }}else flag=false;
	        
	        return flag;
	    }

	  static boolean isAna(String a,String b) {
		  boolean toR=false;
		  String A=a.toLowerCase();
		  String B=b.toLowerCase();
		  
		  if(A!=null && B!=null) {
		  char[] A_arr=A.toCharArray();Arrays.sort(A_arr);
		  char[] B_arr=B.toCharArray();Arrays.sort(B_arr);
		  toR=Arrays.equals(A_arr, B_arr);}
		  
		  return toR;
	  }
	  
	  static boolean isAn(String a,String b) {
		  boolean toR=false;
		  
		  return toR;
	  }
	  public static void main(String[] args) {
		
        /*String A="aabbbbaa";
        StringBuilder sb=new StringBuilder(A);
        if(A.equals(sb.reverse().toString()))System.out.println("yes");
        else System.out.println("No");*/
		//System.out.println(isAnagram("hello","Hello"));
		
		int[] arr1= {18,45,63,21,19,90};
		int[] arr2= {18,45,63,21,19,90};
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1==arr2);
		System.out.println("method3: "+Arrays.equals(arr1, arr2));

	}

}
