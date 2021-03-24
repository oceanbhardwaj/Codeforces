class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return dfs(nums,0,n,dp);
        
    }
    public int dfs(int nums[],int i,int n,int dp[])
    {

    if(i>=n)
        return 0;
        if(dp[i]!=-1)
            return dp[i];
        int take=nums[i]+dfs(nums,i+2,n,dp);
        int dont_take=dfs(nums,i+1,n,dp);
        return dp[i]=Math.max(take,dont_take);
    
    }
    
}
////////////////////////////////////////////DP/////////////////////////////////////////////////////////////////////
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
       
       if(n==1)
           return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
         int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    
}