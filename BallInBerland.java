/*package whatever //do not write package name here */

import java.util.*;

 public class Sol3 {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i1=0;i1<t;i1++)
	{
	    int a=sc.nextInt();
	    int l=sc.nextInt();
	    int k=sc.nextInt();
	    int a1[]=new int[k];
	    int b[]=new int[k];
	    for(int i=0;i<k;i++)
	    {
	        a1[i]=sc.nextInt();
	    }
	    for(int i=0;i<k;i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    long count=0;
	  int outdegree[]=new int[a+1];
	  int indegree[]=new int[l+1];
	  for(int i=0;i<k;i++)
	  {
	      outdegree[a1[i]]++;
	      indegree[b[i]]++;
	  }
	  for(int i=0;i<k;i++)
	  {
	      count+=(k-1)-(outdegree[a1[i]]-1)-(indegree[b[i]]-1);
	  }
	  System.out.println(count/2);
	}
	}
}