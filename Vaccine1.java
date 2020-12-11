/*package whatever //do not write package name here */

import java.util.*;

 class Solution {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
   String s1=sc.nextLine();
   String s[]=s1.split(" ");
   int d1=Integer.parseInt(s[0]);
   int v1=Integer.parseInt(s[1]);
   int d2=Integer.parseInt(s[2]);
   int v2=Integer.parseInt(s[3]);
   int p=Integer.parseInt(s[4]);
   int count=0;
   int min=0;
   int max=0;
   int valuemin=0;
   int valuemax=0;
   
   if(d1<=d2)
   {
       min=d1;
       max=d2;
       valuemin=v1;
       valuemax=v2;
   }
   else
   { min=d2;
   max=d1;
   valuemin=v2;
   valuemax=v1;
       
   }
   if(min!=1)
   count=count+(min-1);
   int f=0;
   for(int i=0;i<Math.abs(max-min);i++)
   {  if(p>0)
       {int d=valuemin;
       f++;
       p=p-d;}
       else
       break;
   }
   count=count+f;
   //int ans=p-Math.abs(max-min)*valuemin;
   if(p>0){
   int t=v1+v2;
  int mod=p%t;
  if(mod!=0)
  count++;
   count=count+p/t;}
   
   System.out.println(count);
	    
	    
	
	}
}