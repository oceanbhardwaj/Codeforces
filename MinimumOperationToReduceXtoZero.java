/*class Solution {
    int ans;
    public int minOperations(int[] nums, int x) 
    { HashMap<String,Integer> h=new HashMap<>();
        ans=Integer.MAX_VALUE;
     ans=solve(x,0,nums.length-1,nums,0,h);
return ans==Integer.MAX_VALUE?-1:ans;
       
        
        
        
        
        
        
        
        
    }
    public int solve(int x,int start,int end,int nums[],int steps,HashMap<String,Integer>h)
    {
        String str=start+"*"+end+"*"+steps;
        if(h.containsKey(str))
            return h.get(str);
        if(x==0)
        {
            
            return steps;
        }
        if(x<0 || start>end || start>=nums.length || end<0)
            return Integer.MAX_VALUE;
        int l=solve(x-nums[start],start+1,end,nums,steps+1,h);
        int r=solve(x-nums[end],start,end-1,nums,steps+1,h);
        h.put(str,Math.min(l,r));
              return Math.min(l,r);
    
    }
}*/
        



///////////////////////////////////
class Solution {
    public int minOperations(int[] nums, int x) 
    {
        //step 1-find longest length of subarray having sum1=sum-x
        //step2-nums.length-length;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1=sum1+nums[i];
        }
        int n=nums.length;
        int maxLen=0;
    int k=sum1-x;
        int sum=0;
        if(sum1==x)
            return n;
        //find longest subarray length having sum=k
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(sum==k)
                maxLen=i+1;
            if(!h.containsKey(sum))
                h.put(sum,i);
            if(h.containsKey(sum-k))
            {
                if(maxLen<i-h.get(sum-k))
                    maxLen=i-h.get(sum-k);
            }
        }
       
        
        
        
        return maxLen==0?-1:n-maxLen;
        
        
        
        
        
        
        
        
        
    }
}