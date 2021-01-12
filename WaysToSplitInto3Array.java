class Solution {
    public int waysToSplit(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int sum=0;
        int diff=0;
        int res=0;
        for(int i=0;i<n;i++)
        {  sum=sum+nums[i];
            pre[i]=sum;
        }
        for(int i=0;i<n;i++)
        {
           int leftSum=pre[i];
            int lb=-1;
            int rb=-1;
            int l=i+1;
            int r=nums.length-2;
            while(l<=r)
            {
                int m=(r+l)/2;
                int midSum=pre[m]-leftSum;
                if(midSum>=leftSum)
                {
                    lb=m;
                    r=m-1;
                }
                else
                    l=m+1;
            }
            
              l=i+1;
            r=nums.length-2;
            while(l<=r)
            {
                int m=(r+l)/2;
                int midSum=pre[m]-leftSum;
                int rightSum=sum-leftSum-midSum;
                if(rightSum>=midSum)
                {
                    rb=m;
                    l=m+1;
                }
                else
                    r=m-1;
            }
            
            if(lb==-1 || rb==-1 || lb>rb)
                continue;
            diff=rb-lb+1;
            res=res+diff;
            res=res%(1000000007);
            
            
            
        
    }
        return res;
}
}