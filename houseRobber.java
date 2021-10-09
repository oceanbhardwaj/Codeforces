class Solution {
    public int rob(int[] nums) {
        return robMaxValue(nums,0);
    }
    public int robMaxValue(int nums[],int i)
    {
        if(i>=nums.length)
            return 0;
        return Math.max(nums[i]+robMaxValue(nums,i+2),robMaxValue(nums,i+1));
    }
}
//method -2
class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return robMaxValue(nums,0,dp);
    }
    public int robMaxValue(int nums[],int i,int dp[])
    {
        if(i>=nums.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        return dp[i]= Math.max(nums[i]+robMaxValue(nums,i+2,dp),robMaxValue(nums,i+1,dp));
    }
}
//method-3
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
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
       return dp[n-1]; 
    }
}