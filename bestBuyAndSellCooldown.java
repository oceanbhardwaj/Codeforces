class Solution {
    public int maxProfit(int[] prices) {
        return buySell(prices,true,0);
    }
    public int buySell(int prices[],boolean buyOrSell,int index)
    {
       if(index>=prices.length)
           return 0;
        int x=0;
        if(buyOrSell) //true for buy
        {
            int buy=-prices[index]+buySell(prices,false,index+1);
            int noBuy=buySell(prices,true,index+1);
             x=Math.max(buy,noBuy);
            
        }else
        {
            
            int sell=prices[index]+buySell(prices,true,index+2);
            int noSell=buySell(prices,false,index+1);
            x=Math.max(x,Math.max(sell,noSell));
        }
        return x;
    }
}
/////////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String,Integer> h=new HashMap<>();
        return buySell(prices,true,0,h);
    }
    public int buySell(int prices[],boolean buyOrSell,int index,HashMap<String,Integer> h)
    {
       if(index>=prices.length)
           return 0;
        int x=0;
        String s=buyOrSell+"code"+index;
        if(h.containsKey(s))
            return h.get(s);
        
        if(buyOrSell) //true for buy
        {
            int buy=-prices[index]+buySell(prices,false,index+1,h);
            int noBuy=buySell(prices,true,index+1,h);
             x=Math.max(buy,noBuy);
            
        }else
        {
            
            int sell=prices[index]+buySell(prices,true,index+2,h);
            int noSell=buySell(prices,false,index+1,h);
            x=Math.max(x,Math.max(sell,noSell));
        }
        h.put(s,x);
        return x;
    }
}