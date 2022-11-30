package com.infy.pp3;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
enum weekD {
	
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);
	@SuppressWarnings("unused")
	private int no;
	weekD(int no){
		this.no=no;}
	
	};
	
public class CharacterWithRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String input="Infosys,2,4";String arr[]=input.split(",");
		String name=arr[0];int size=name.length();
		int s=Integer.parseInt(arr[1]);int e=Integer.parseInt(arr[2]);
		if(s<=e && e<size) {
			//System.out.println(name.substring(s,e+1));
		}
		else System.out.println("invalid");
		
		
		//Number pyramid
		int i=1, j, limit;
		   
		   DataInputStream in= new DataInputStream(System.in); 
		   System.out.print("Enter limit: ");
		   limit = Integer.parseInt(in.readLine());
		   
		   do
		   {
			   for(int k=limit;k>=i;k--) {
				   System.out.print(" ");
			   }
			   for(j=1;j<=i;j++) {
				   System.out.print(i+" ");
			   }
			   
			   
			   System.out.println("");
			   i++;
			   
		   } while(i<=limit);
		
		
		
		
		

	}

}



