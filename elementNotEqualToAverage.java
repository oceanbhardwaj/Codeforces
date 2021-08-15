class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        boolean flag=true;
        int index=0;
        int arr[]=new int[nums.length];
        while(left<=right)
        {
            if(flag)
            {
                arr[index++]=nums[right];
                right--;
            }else
            {
                arr[index++]=nums[left++];
            }
            flag=!flag;
        }
        return arr;
        
    }
}