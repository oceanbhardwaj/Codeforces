/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static int ans1=Integer.MAX_VALUE;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    //ans1=Integer.MAX_VALUE;
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[k+1];
		    int dp[]=new int[k+1];
		    for(int i=1;i<=k;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.fill(dp,-1);
		  int r= dfs(arr,k,k,dp,n);
		    if(r==1000)
		    r=-1;
		    
		    System.out.println(r);
		    
		    
		}
	}
		public  static int dfs(int arr[],int n,int k,int dp[],int n1)
		{
		    
		    if(n==0)
		    {
		        
		       
		        return 0;
		    }
		    int ans1=1000;
		    int s=1000;
		    if(n<0)
		    return 1000 ;
		    if(dp[n]!=-1)
		    return dp[n];
		    
		    for(int i=1;i<=k;i++)
		    {
		        if(arr[i]!=-1)
		        { s=arr[i]+dfs(arr,n-i,k,dp,n1);
		         ans1=Math.min(ans1,s);}
		    }
		    dp[n]=ans1;
		    return ans1;
		}
	
}