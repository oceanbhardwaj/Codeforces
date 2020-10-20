/*package whatever //do not write package name here */

import java.util.*;

public class MinimumProduct {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	int t2=sc.nextInt();
	
	for(int i=0;i<t2;i++)
	{  long Act=Long.MAX_VALUE;
	    long a=sc.nextLong();
	    long b=sc.nextLong();
	    long x=sc.nextLong();
	    long y=sc.nextLong();
	    long n=sc.nextLong();
	    long ans=Math.min(call(a,b,x,y,n),call(b,a,y,x,n));
	    System.out.println(ans);
	}
	}
	private static long call(long a,long b,long x,long y,long n)
	{
	    long d1=a-x;
	    long d2=b-y;
	    long c1=Math.min(d1,n);
	    a=a-c1;
	    n=n-c1;
	    long c2=Math.min(d2,n);
	    b=b-c2;
	    return a*b;
	}
	
}