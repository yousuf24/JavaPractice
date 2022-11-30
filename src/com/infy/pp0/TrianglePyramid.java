package com.infy.pp0;
import java.util.*;
import java.util.stream.Collectors;
public class TrianglePyramid {
	public static void display(int num) {
		int temp=num;
		
		for(int i=1;i<=num;i++) {
			for(int k=temp;k<=(2*temp-1);k++) {
				System.out.print(" ");
			}
			
			
			for(int j=1;j<(2*i)-1;j++) {
				System.out.print("* ");
			}
			temp--;
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		List<Integer> numbers=Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
		display( numbers.get(1));
		
		s.close();

	}

}
