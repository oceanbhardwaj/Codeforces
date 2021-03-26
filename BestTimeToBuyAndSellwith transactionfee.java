class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        HashMap<String,Integer> h=new HashMap<>();
        return dfs(prices,fee,0,0,h);
    }
    public int dfs(int[] prices,int fee,int buyorsell,int i,HashMap<String,Integer> h)
    {
        if(i>=prices.length )
            return 0;
        String x=buyorsell+"leet"+i+"code";
        if(h.containsKey(x))
            return h.get(x);
        int max=0;
        if(buyorsell==0)
        {
            int buy=-prices[i]+dfs(prices,fee,1,i+1,h);
            int nobuy=dfs(prices,fee,0,i+1,h);
            max=Math.max(buy,nobuy);
        }
        else
        {
            int sell=prices[i]+dfs(prices,fee,0,i+1,h)-fee;
            int nosell=dfs(prices,fee,1,i+1,h);
            max=Math.max(sell,nosell);
        }
        h.put(x,max);
        return max;
        
    }
}