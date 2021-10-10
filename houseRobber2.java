class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        return Math.max(call(nums,0,nums.length-2),call(nums,1,nums.length-1));
    }
    public int call(int nums[],int start,int end)
    {
        int dp[]=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        if(dp.length==2)
            return dp[1];
        for(int i=start+2;i<=end;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        System.out.println( dp[dp.length-1]);
        return dp[end];
    }
}