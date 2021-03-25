//bruteforce
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>buy)
                {
                    max=Math.max(max,prices[j]-buy);
                }
            }
        }
        return max;
        
    }
}
///////////////////////////////////////////////////////////o(n) time and o(n) space///////////////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] prices) {
      
        int n=prices.length;
        int max[]=new int[prices.length];
        max[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            max[i]=Math.max(max[i+1],prices[i]);
        }
        int max1=0;
        for(int i=0;i<n-1;i++)
        {
            if(max[i+1]>prices[i])
                max1=Math.max(max[i+1]-prices[i],max1);
        }
        return max1;
    }
}