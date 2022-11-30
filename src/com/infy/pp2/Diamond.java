package com.infy.pp2;

public class Diamond {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			
			for(int j=5-i;j<=5;j++) {
				System.out.print("* ");				
		
			}
			System.out.println();
			
		}
		
		for(int i=0;i<4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("##########################");
		
		  for (int i = 0; i < 5; i++) {
			    for (int j = 0; j < i + 1; j++) {
			    	//System.out.println("(i,j): "+"("+i+","+j+")");
			      System.out.print("* ");
			    }
			    //System.out.println();

	}

}
}

