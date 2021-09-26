class Solution {
    public boolean increasingTriplet(int[] nums) {
        /*
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && lis[i]<lis[j]+1)
                { lis[i]=lis[j]+1;
                 max=Math.max(lis[i],max);
                }
            }
        }
      
         return max>=3?true:false;
         */
        //o(nlogn)
        //binary search
        int count=0;
        ArrayList<Integer> addedValues=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(addedValues.isEmpty() ||                                    nums[i]>addedValues.get(addedValues.size()-1) )
            {
                count++;
                addedValues.add(nums[i]);
            }
            else
            {
                //putting at correct position
                //finding floor
                int index=bsFloor(addedValues,nums[i]);
                   addedValues.set(index,nums[i]);                      
       

            }
        }
        
            
        return count>=3?true:false;
        
            
    }
    public int bsFloor(ArrayList<Integer> a,int target)
    {
       int index=-1;
        int left=0;
        int right=a.size()-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
                if(a.get(mid)>=target)
                {
                    index=mid;
                    right=mid-1;
                }
                else
                    left=mid+1;
            }
        
        return index;
        
    }
       

}