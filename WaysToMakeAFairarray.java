/*class Solution {
    public int waysToMakeFair(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        a.add(nums[i]);
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            a.remove(i);
            int j=0;
            int even=0;
                int odd=0;
            for(int e:a)
            {
                if(j%2==0)
                    even=even+e;
                else
                    odd=odd+e;
                j++;
            }
            a.add(i,nums[i]);
            if(even==odd)
                count++;
        }
        return count;
    }
}*/


class Solution {
    public int waysToMakeFair(int[] nums) {
        int evenv=0;
            int oddv=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
                evenv+=nums[i];
            else
                oddv+=nums[i];
        }
        int even=0;
        int odd=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                evenv-=nums[i];
            }
            else
                oddv-=nums[i];
            
            if(evenv+odd==oddv+even)
                count++;
            if(i%2==0)
                even+=nums[i];
            else
                odd+=nums[i];
        }
        
        return count;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}