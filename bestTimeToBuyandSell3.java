class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        //HashMap<String,Integer> h=new HashMap<>();
        int t[][][]=new int[prices.length][2][3];
        for(int i=0;i<prices.length;i++)
        { for(int j=0;j<2;j++)
        {
            for(int k=0;k<3;k++)
            {
                t[i][j][k]=-1;
            }
        }
            
        }
        return dfs(prices,0,0,n,t,2);
        
    }
    public int dfs(int prices[],int i,int buyorsell,int n,int t[][][],int k)
    {
        if(i>=n || k==0)
            return 0;
        String x=i+"leet"+buyorsell+"code"+k;
        if(t[i][buyorsell][k]!=-1)
            return t[i][buyorsell][k];
        int maxbuy=0;
       
        if(buyorsell==0 )
        {
        int buy=-prices[i]+dfs(prices,i+1,1,n,t,k);
        int nobuy=dfs(prices,i+1,0,n,t,k);
         maxbuy=Math.max(buy,nobuy);
        }
        else
        {int sell=prices[i]+dfs(prices,i+1,0,n,t,k-1);
         int nosell=dfs(prices,i+1,1,n,t,k);
         maxbuy=Math.max(sell,nosell);
        }
       t[i][buyorsell][k]=maxbuy;
        return maxbuy;
            
            
            
        
        
    }
}
        
    