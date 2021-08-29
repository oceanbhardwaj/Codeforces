/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long m=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		long low=arr[0];
		long high=arr[n-1];
		long ans=-1;
		while(low<=high)
		{
		   long mid=(low+high)/2;
		   if(isValid(mid,arr,m))
		   {
		       ans=mid;
		       low=mid+1; 
		   }
		   else{
		       high=mid-1;
		   }
		}
		System.out.println(ans);
	}
	public static boolean isValid(long mid,long arr[],long m)
	{
	    long sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]-mid>0)
	        sum=sum+arr[i]-mid;
	    }
	    if(sum>=m)
	    return true;
	    return false;
	}
}