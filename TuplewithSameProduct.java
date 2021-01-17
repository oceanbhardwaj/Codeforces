/*class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
               for(int k=j+1;k<nums.length-1;k++)
               {
                   for(int l=k+1;l<nums.length;l++)
                   {
                       if(nums[i]*nums[j]==nums[k]*nums[l] ||nums[i]*nums[k]==nums[j]*nums[l]||nums[i]*nums[l]==nums[k]*nums[j])
                           count++;
                   }
               }
            }
        }
        return count*8;
        
    }
}
*/
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int prod=nums[i]*nums[j];
                h.put(prod,h.getOrDefault(prod,0)+1);
            }
        }
        for(int i:h.keySet())
        {
            int val=h.get(i);
            if(val>1)
            {
                count=count+(val*(val-1))/2;
                
            }
        }
       return count*8;
        
              
    }
}