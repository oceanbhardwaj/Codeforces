class Solution {
    public int maxSubArray(int[] nums) {
        int meh=nums[0];
        int msf=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            meh=meh+nums[i];
            if(meh<nums[i])
                meh=nums[i];
            msf=Math.max(meh,msf);
        }
        return msf;
    }
}