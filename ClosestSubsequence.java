class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int n=nums.length;
        ArrayList<Integer> first=new ArrayList<>();
        ArrayList<Integer> second=new ArrayList<>();
        dfs(nums,first,0,0,n/2);
        dfs(nums,second,0,n/2,n);
        Collections.sort(first);
        int min=Integer.MAX_VALUE;
        for(int ele:second)
        {
            int left=goal-ele;
            if(first.get(0)>left)
            {min=Math.min(Math.abs(ele+first.get(0)-goal),min);
             continue;}
            if(first.get(first.size()-1)<left)
            { min=Math.min(Math.abs(ele+first.get(first.size()-1)-goal),min);
             continue;}
            
            int pos=Collections.binarySearch(first,left);
            if(pos>=0)
                return 0;
            else
             pos=-1-pos;
            int low=pos-1;
            min=Math.min(Math.abs(ele+first.get(pos)-goal),min);
            min=Math.min(Math.abs(ele+first.get(low)-goal),min);
        }
        
        return min;
        
        
        
    }
    public void dfs(int nums[],ArrayList<Integer> a,int sum,int i,int end)
    {
        if(i==end)
        {
            a.add(sum);
            return;
        }
        dfs(nums,a,sum+nums[i],i+1,end);
        dfs(nums,a,sum,i+1,end);
    }
}