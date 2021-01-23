class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<gain.length;i++)
        {
            c=c+gain[i];
            max=Math.max(c,max);
        }
        return max<0?0:max;
    }
}