/*package whatever //do not write package name here */

import java.util.*;

public class YetAnotherTwoIntegerProblem {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	int t2=sc.nextInt();
	for(int i=0;i<t2;i++)
	{
	    long a=sc.nextLong();
	    long b=sc.nextLong();
	    long ans=0;
	    if(Math.abs(a-b)%10==0)
	       ans=Math.abs(a-b)/10;
	       else
	       ans=Math.abs(a-b)/10+1;
	        
	    System.out.println(ans);    
	        
	        
	        
	        
	        
	        
	    
	}
	}
}