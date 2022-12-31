package hackerRank;

import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Prime o=new Solution3().new Prime();
        
        int a=Integer.parseInt(br.readLine().trim());
        System.out.println(o.checkPrime(a));
        int b=Integer.parseInt(br.readLine().trim());
        System.out.println(o.checkPrime(b));
        int c=Integer.parseInt(br.readLine().trim());
        System.out.println(o.checkPrime(c));
        int d=Integer.parseInt(br.readLine().trim());
        System.out.println(o.checkPrime(d));
        int e=Integer.parseInt(br.readLine().trim());
        System.out.println(o.checkPrime(e));
        
        
    }
    
    class Prime{
        String checkPrime(int... arg) {
            int len=arg.length;String op="";
           
            for(int i=0;i<len;i++){
                 boolean flag=true;
               if(arg[i]>2) {
                   for(int j=2;j<=(int)Math.sqrt(arg[i]);j++){
                       if(i%j==0){flag=false;break;}
                   }if(flag)op+=arg[i]+" ";
               }else if(arg[i]==2)op+=2+" ";
               
               
            }
            return op;
        }
    }
}

