/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int p=sc.nextInt();
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j]=sc.nextInt();
		        
		    }
		    Arrays.sort(arr);
		    
		    int low=0;
		    int high=arr[n-1]*(p*(p+1))/2;
		    int ans=-1;
		    int sum=0;
		    int p1=0;
		    int d=Integer.MAX_VALUE;
		    while(low<=high)
		    {
		       int mid=(low+high)/2;
		       p1=0;
		       sum=0;
		       d=Integer.MAX_VALUE;
		       for(int k=0;k<n;k++)
		       {
		           int count=1;
		           while(sum+count*arr[k]<=mid)
		           {
		               sum=sum+count*arr[k];
		               count++;
		               p1++;
		           }
		           sum=0;
		           
		           
		           if(p1>=p)
		           break;
		           
		       }
		       if(p1>=p)
		       {ans=mid;
		       high=mid-1;}
		       else{
		           low=mid+1;
		       }
		    }
		    System.out.println(ans);
		}
	}
}