class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        HashSet<Integer> h=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
            {
                pq.add(nums[i]*2);
                min=Math.min(nums[i]*2,min);}
            else
            {pq.add(nums[i]);
             min=Math.min(nums[i],min);}
        }
        int res=Integer.MAX_VALUE;
        while(!pq.isEmpty())
        {
            int s=pq.poll();
           
             
            res=Math.min(Math.abs(s-min),res);
           
            
            if(s%2==1)
               break;
            
            pq.add(s/2);
             min=Math.min(min,s/2);
            
            
           
        }
       return res;
        
    }
}