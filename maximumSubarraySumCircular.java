class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      /*  two cases- normal kdanes algo case-when subarray is found at mid
            head and tail case-total-minimum kdanes algo case */
        //sum
        int sum=0;
        for(int i:nums)
        {
            sum=sum+i;
        }
        
        //kdanes algo normal (max)
        int max_msf=nums[0];
        int max_meh=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
           max_meh=max_meh+nums[i];
            if(max_meh<nums[i])
                max_meh=nums[i];
            max_msf=Math.max(max_msf,max_meh);
        }
        
        //min kdanes algo
        int min_meh=nums[0];
        int min_msf=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            min_meh=min_meh+nums[i];
            if(min_meh>nums[i])
                min_meh=nums[i];
            
            min_msf=Math.min(min_msf,min_meh);
        }
        //all neg case
        if(min_msf==sum)
            return max_msf;
        System.out.println("max :"+max_msf+"  min :"+min_msf);
        return Math.max(max_msf,sum-min_msf);
        
    }
}