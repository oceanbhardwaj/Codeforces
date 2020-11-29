class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int max=0;
        int sum=0;
        for(int a[]:accounts)
        { sum=0;
            for(int i:a)
                sum=sum+i;
         max=Math.max(sum,max);
                
        }
        return max;
        
    }
}