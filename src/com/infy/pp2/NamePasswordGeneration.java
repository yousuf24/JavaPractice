package com.infy.pp2;


public class NamePasswordGeneration {

	public static void main(String[] args) {
		String name="Yousuf Mohammad";
		// Lowercase  --4  | uppercase ++4 
		int size=name.length();
		char[] arr=name.toCharArray();
		
		for(int i=0;i<size;i++) {
			
			if(Character.isUpperCase(arr[i])) arr[i]=  (char) ((arr[i]+'A' + 4)%26 + 'A');
			else if(Character.isLowerCase(arr[i]))arr[i]=  (char) ((arr[i]+'a'+14 -4)%26 + 'a');
			//else continue;
		}
		
		System.out.println("Generated Password"+String.valueOf(arr));
		
		int number=387;
		String nS=String.valueOf(number); int toReturn=0;
		if(nS.length()==1)toReturn= (int) Math.pow(number, 2);
		else if(Character.getNumericValue(nS.charAt(1))%4==0)toReturn=24;
		else if(number%2==0)toReturn=2;
		else toReturn=1;

		System.out.println("Logic Tranformation: "+toReturn);


		
		
		
		
		
		
		
		
		
	}

}


