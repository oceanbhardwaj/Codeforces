class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0)
            return 0;
        int maxL[]=new int[n];
        int maxR[]=new int[n];
        maxL[0]=height[0];
        for(int i=1;i<n;i++)
        {
            maxL[i]=Math.max(height[i],maxL[i-1]);
        }
        maxR[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
           maxR[i]=Math.max(maxR[i+1],height[i]); 
         }
        int sum=0;
        for(int i=0;i<n;i++)
        {
           sum=sum+(Math.min(maxL[i],maxR[i])-height[i]);
            
            
            
        }
        return sum;
        
    }
}