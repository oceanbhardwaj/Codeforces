class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int dp[][]=new int[nums.length][sum/2+1];
        for(int i=0;i<nums.length;i++)
        {
            Arrays.fill(dp[i],-2);
        }
        if(sum%2!=0)
            return false;
        return subset(nums,sum/2,0,dp)==1? true:false;
        
    }
    public int subset(int nums[],int S,int i,int dp[][])
    {
        if(S==0)
            return 1;
        if(S<0 ||i>=nums.length)
            return -1;
        if(dp[i][S]!=-2)
            return dp[i][S];
        int takeit=subset(nums,S-nums[i],i+1,dp);
        int donttakeit=subset(nums,S,i+1,dp);
        if(takeit==1 || donttakeit==1)
            return dp[i][S]= 1;
        return dp[i][S]=-1;
       
    }
}