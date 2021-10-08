class Solution {
    public int tribonacci(int n) {
    
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        return call(n,dp);
        
    }
    public int call(int n,int dp[])
    {
        
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=call(n-1,dp)+call(n-2,dp)+call(n-3,dp);
        
    }
}