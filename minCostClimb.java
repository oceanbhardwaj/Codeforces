class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(minCost(cost,0),minCost(cost,1));
    }
    public int minCost(int cost[],int i)
    {
        if(i>=cost.length)
            return 0;
        return Math.min(cost[i]+minCost(cost,i+1),cost[i]+minCost(cost,i+2));
    }
}
////////////////////////////memoization
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
         int dp1[]=new int[cost.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp1));
    }
    public int minCost(int cost[],int i,int dp[])
    {
        if(i>=cost.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        return dp[i]=Math.min(cost[i]+minCost(cost,i+1,dp),cost[i]+minCost(cost,i+2,dp));
    }
}