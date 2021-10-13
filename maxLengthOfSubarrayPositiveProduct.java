class Solution {
    public int getMaxLen(int[] nums) {
       int n=nums.length;
        int firstNeg=-1;
        int totalNeg=0;
        int zeroPlace=-1;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]<0)
          {
             totalNeg++;
               if(firstNeg==-1)
                firstNeg=i;
              
          }
           
            if(nums[i]==0)
            {
                   firstNeg=-1;
                zeroPlace=i;
                totalNeg=0;
            
            }
            if(totalNeg%2==0)
            {
max=Math.max(max,i-zeroPlace);
                
            }
            else
            {
max=Math.max(max,i-firstNeg);
            }
            
        }
         return max;   
    }
}