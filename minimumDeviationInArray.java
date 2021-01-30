class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)//even
            {pq.add(nums[i]);
             min=Math.min(nums[i],min);}
            else
            {pq.add(nums[i]*2);
             min=Math.min(nums[i]*2,min);
            }
            
        
        
    }
        while(!pq.isEmpty())
        {
            int curr=pq.poll();
            ans=Math.min(ans,curr-min);
            if(curr%2==1)
                break;
            pq.add(curr/2);
            min=Math.min(curr/2,min);
        }
        return ans;
}
}