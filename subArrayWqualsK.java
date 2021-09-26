class Solution {
    public int subarraySum(int[] nums, int k) {
      //brute force
       /* int count=0;
       
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==k)
              count++;
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum==k)
                    count++;
            }
           
        }
        return count;
        */
        
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int count=0;
        h.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
           sum=sum+nums[i];
            if(h.containsKey(sum-k))
                count=count+h.get(sum-k);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}