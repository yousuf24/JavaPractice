package com.infy.pp3;



import java.io.*;
import java.util.Scanner;  
 
class MagicNumber 
{
    // Function to generate odd sized magic squares
    static void generateSquare(int n)
    {
        int[][] magicSquare = new int[n][n];
         //magic constant = n(n^2+1)/2 and 1 will start at position (n/2,n-1) and everytime row-- and col++ in circular fashion
       
        int i = n/2;
        int j = n-1;
  
      
        for (int num=1; num <=n*n; )
        {
            if (i==-1 && j==n) {j = n-2;i=0;}
            
            else
            {   
                if (j == n) j = 0;
                     
               
                if (i < 0)  i=n-1;
            }
             
            
            if (magicSquare[i][j] != 0) 
            {
                j=j-2;
                i=i+1;
                continue;
            }
            else
               
                magicSquare[i][j] = num++; 
          
            
            j++;  i--;
        }
       
        // print magic square
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
                System.out.print(magicSquare[i][j]+" ");
            System.out.println();
        }
        
    }
     
    // driver program
    public static void main (String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();  
        generateSquare(n);
        sc.close();
    }
}

