class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            left[i]=nums[i]*left[i-1];
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i]=nums[i]*right[i+1];
        }
        int arr[]=new int[nums.length];
        arr[0]=right[1];
        arr[nums.length-1]=left[nums.length-2];
        for(int i=1;i<nums.length-1;i++)
        {
            arr[i]=left[i-1]*right[i+1];
        }
        return arr;
    }
}