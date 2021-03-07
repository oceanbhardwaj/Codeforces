class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int count[]=new int[n];
        Arrays.fill(count,1);
        dp[0]=1;
        for(int i=1;i<n;i++)
        { dp[i]=1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i] && dp[j]+1>dp[i])
                {
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }
                else if(nums[j]<nums[i] && dp[j]+1==dp[i])
                {
                    count[i]+=count[j];
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(dp[i],max);
        }
        int count1=0;
         for(int i=0;i<n;i++)
        {
            if(dp[i]==max)
                count1=count1+count[i];
        }
        

return count1;
    }
}