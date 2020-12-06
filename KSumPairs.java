class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        if(n==1)
            return 0;
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        
        while(left<right)
        {
            if(nums[left]+nums[right]>k)
                right--;
            else if(nums[left]+nums[right]<k)
                left++;
            else 
            {
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}