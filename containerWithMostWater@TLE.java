class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                      
                max=Math.max(Math.min(height[j],height[i])*(j-i),max);
            
            
            }
        }
        return max;
    }
}