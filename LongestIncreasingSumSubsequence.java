class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int dp[]=new int[n];
	    for(int i=0;i<n;i++)
	    dp[i]=arr[i];
	    for(int i=1;i<n;i++)
	    {
	        for(int j=i-1;j>=0;j--)
	        {
	            if(arr[i]>arr[j] && arr[i]+dp[j]>=dp[i])
	            {
	                dp[i]=arr[i]+dp[j];
	                //break;
	            }
	        }
	    }
	    
	    int max=0;
	    for(int i=0;i<n;i++)
	    {// System.out.print(dp[i]+"       ");
	        max=Math.max(max,dp[i]);
	    }
	    return max;
	}  
}