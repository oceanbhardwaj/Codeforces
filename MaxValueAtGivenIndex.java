class Solution {
    public int maxValue(int n, int i,int maxSum) {
        
        long s=0;
        long e=Integer.MAX_VALUE;
        long ans=0;
        while(s<=e)
        {
         long mid=s+(e-s)/2;
      long left=sum(Math.min(i,mid-1),mid);
            left+=Math.max(0,(i-mid+1));
       long right=sum(Math.min(n-i-1,mid-1),mid);
            right+=Math.max(0,n-i-1-mid+1);
            if(mid+left+right<=maxSum)
            {
                ans=Math.max(ans,mid);
                s=mid+1;
            }
            else
                e=mid-1;
        }
        return (int)ans;
        
        
        
        
    }
    public long sum(long i,long mid)
    {
        long d=i*mid-(i*(i+1))/2;
        return d;
    }
}