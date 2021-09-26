class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            prod=prod*nums[i];
            else
                count++;
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0 && count>0)
               arr[i]=0;
            else if(nums[i]!=0)
                arr[i]=prod/nums[i];
            else if(count>1)
                arr[i]=0;
            else
                arr[i]=prod;
        }
        return arr;
    }
}