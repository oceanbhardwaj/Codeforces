class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        if(nums1.length > nums2.length * 6 || nums2.length > nums1.length * 6) 
		return -1;
        for(int i:nums1)
        {

        sum1=sum1+i;
        }
        
          
        for(int i:nums2)
        {

        sum2=sum2+i;
        }
        
        
        if(sum1>sum2)  //sum1<sum2 is okkk
        {
            return fun(sum2,sum1,nums2,nums1);
            
        }
        return fun(sum1,sum2,nums1,nums2);
    }
    public int fun(int sum1,int sum2,int nums1[],int nums2[])
    {
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        PriorityQueue<Integer> p2=new PriorityQueue<>(Collections.reverseOrder());
        int operations=0;
        for(int i:nums1)
            p1.add(i);  //min  +(6-num)
        
        for(int i:nums2)
            p2.add(i); //max   //-(num-1)
        
        while(sum1<sum2)
        {
            operations++;
            
            if(p2.isEmpty() ||6- p1.peek()> p2.peek()-1)
                sum1=sum1+6-p1.poll();
            
            else
                sum2=sum2-(p2.poll()-1);
            
            
        }
        return operations;
        
        

        
    }
}