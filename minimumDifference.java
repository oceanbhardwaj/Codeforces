class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++)
        {
            int start=i;
            int end=i+k-1;
            min=Math.min(nums[end]-nums[start],min);
        }
        
        return min;
    }
}