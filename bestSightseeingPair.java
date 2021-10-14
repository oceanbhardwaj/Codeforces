class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int leftMax[]=new int[values.length]; //A[i]+i
        int rightMax[]=new int[values.length]; //A[i]-i;
        leftMax[0]=values[0]+0;
        for(int i=1;i<values.length;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],values[i]+i);
        }
       
        //right
        rightMax[values.length-1]=values[values.length-1]-(values.length-1);
        
        for(int i=values.length-2;i>=0;i--)
        {
            rightMax[i]=Math.max(values[i]-i,rightMax[i+1]);
        }
        
        int max=0;
        for(int i=0;i<values.length-1;i++)
        {
             max=Math.max(leftMax[i]+rightMax[i+1],max);
        
        }
        return max;
    }
}
///////////////////////////
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=-1;
        int maxi=values[0]+0;
        for(int i=1;i<values.length;i++)
        {
            ans=Math.max(ans,maxi+values[i]-i);
            maxi=Math.max(maxi,values[i]+i);
        }
        return ans;
    }
}