/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class CommonSubsequence {
	public static void main (String[] args) {

   Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   for(int i1=0;i1<t;i1++)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int  arr1[]=new int[n];
        int  arr2[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
       
        HashSet<Integer> h=new HashSet<>();
         HashSet<Integer> h1=new HashSet<>();
         for(int i:arr1)
         {
             h.add(i);
         }
         for(int i:arr2)
         {
             if(h.contains(i))
            { h1.add(i);
             h.remove(i);}
         }
         int min=Integer.MAX_VALUE;
         if(h1.size()==0)
         System.out.print("NO");
         else{
             int d=h1.size();
             if(d>=1)
             { d=1;
                 for(int i:h1)
                 {
                     min=Math.min(i,min);
                 }
             }
             System.out.println("YES");
             System.out.print(d+" "+min);}
             
             System.out.println();}}}
             
             
             
             
         
        
        
        
        
        
        
        
        
        
        
        
       
   
  
