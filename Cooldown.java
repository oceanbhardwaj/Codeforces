class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        HashMap<String,Integer> h=new HashMap<>();
        
        
        return dfs(prices,0,0,n,h);
        
    }
    public int dfs(int prices[],int i,int buyorsell,int n, HashMap<String,Integer> h)
    {
        if(i>=n )
            return 0;
        String x=i+"leet"+buyorsell;
        if(h.containsKey(x))
            return h.get(x);
       
        int maxbuy=0;
       
        if(buyorsell==0 )
        {
        int buy=-prices[i]+dfs(prices,i+1,1,n,h);
        int nobuy=dfs(prices,i+1,0,n,h);
         maxbuy=Math.max(buy,nobuy);
        }
        else
        {int sell=prices[i]+dfs(prices,i+2,0,n,h);
         int nosell=dfs(prices,i+1,1,n,h);
         maxbuy=Math.max(sell,nosell);
        }
       h.put(x,maxbuy);
        return maxbuy;
            
            
            
        
        
    }
}
        
    
        
  