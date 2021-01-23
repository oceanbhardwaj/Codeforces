/*package whatever //do not write package name here */

import java.util.*;

 public class GFG {
   static int min=Integer.MAX_VALUE;
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int d=2*m;
   int d1=dfs(m,n);
	System.out.println(d1);
	
	}
  //n--->m
  //m---------------->n
	public static int dfs(int m,int n)
	{
	    int count=0;
	    while(m!=n){
	    if(m%2==0 && m>n)
	    m=m/2;
	    else
	    m=m+1;
	    count++;
	    }
	    return count;
	}
}