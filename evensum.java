/*package whatever //do not write package name here */

import java.util.*;

 class Solution {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<t;i++)
	{ String s1=sc.nextLine();
      String s[]=s1.split(" ");
      int A=Integer.parseInt(s[0]);
      int B=Integer.parseInt(s[1]);
      long e1=0;
      long o1=0;
      long e2=0;
      long o2=0;
      if(A==1)
      {
          e1=0;
          o1=1;
          
      }
     else if(A%2==0)
      {
          e1=A/2;
          o1=A/2;
      }
      else 
      {
          e1=A/2;
          o1=A/2+1;
      }
      if(B==1)
      {
          o2=1;
          e2=0;
      }
     else if(B%2==0)
      {
          e2=B/2;
          o2=B/2;
      }
      else 
      {
          e2=B/2;
          o2=B/2+1;
      }
      long ans=e1*e2+o2*o1;
      
      
      System.out.println(ans);
  
   
	    
	}
	}
}