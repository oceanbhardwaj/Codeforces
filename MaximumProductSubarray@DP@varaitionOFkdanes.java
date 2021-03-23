class Solution {
    public int maxProduct(int[] nums) {
        int pre_max=nums[0];
        int pre_min=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           int curr_max=Math.max(nums[i],Math.max(nums[i]*pre_max,nums[i]*pre_min));
int curr_min=Math.min(nums[i],Math.min(nums[i]*pre_max,nums[i]*pre_min));
            pre_min=curr_min;
            pre_max=curr_max;
            ans=Math.max(curr_max,ans);
        }
        return ans;
    }
}