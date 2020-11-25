/*package whatever //do not write package name here */

import java.util.*;

public class UniqueBidauction {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
		   {
		       arr[i]=sc.nextInt();
		   }
		   HashMap<Integer,Integer> h=new HashMap<>();
		   for(int i=0;i<n;i++)
		   {
		       h.put(arr[i],h.getOrDefault(arr[i],0)+1);
		   }
		   int min=Integer.MAX_VALUE;
		   for(int j:h.keySet())
		   {
		       if(h.get(j)==1)
		       {
		           min=Math.min(min,j);
		       }
		   }
		   int ans=-1;
		   for(int i=0;i<n;i++)
		   {
		       if(arr[i]==min)
		       {
		           ans=i+1;
		           break;
		       }
		   }
		   
		   
		   System.out.println(ans);
		}
	}
}