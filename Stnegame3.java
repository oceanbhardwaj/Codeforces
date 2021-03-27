class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
       // HashMap<String,Integer> h=new HashMap<>();
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int d=dfs(stoneValue,0,0,n,dp);
        if(d==0)
            return "Tie";
        else if(d>0)
            return "Alice";
        else
            return "Bob";
    }
    public int dfs(int stoneValue[],int i,int ch,int n, int dp[][])
    {
        if(i>=n)
            return 0;
       
       // String x=i+"leet"+ch;
       //  if(h.containsKey(x))
       //      return h.get(x);
        if(dp[i][ch]!=-1)
            return dp[i][ch];
        if(ch==0)//alice
        {
            int s=stoneValue[i];
            int a1=s+dfs(stoneValue,i+1,1,n,dp);
           
          if(i+1<n)  
          {s+=stoneValue[i+1];
           a1=Math.max(a1,s+dfs(stoneValue,i+2,1,n,dp));
          }
            if(i+2<n)
            {  s+=stoneValue[i+2];
            a1=Math.max(a1,s+dfs(stoneValue,i+3,1,n,dp));
            }
            //h.put(x,a1);
            dp[i][ch]=a1;
            return a1;
        }
        else
        {
            
            int s=-stoneValue[i];
            int a1=s+dfs(stoneValue,i+1,0,n,dp);
           
          if(i+1<n)  
          {s-=stoneValue[i+1];
           a1=Math.min(a1,s+dfs(stoneValue,i+2,0,n,dp));
          }
            if(i+2<n)
            {  s-=stoneValue[i+2];
            a1=Math.min(a1,s+dfs(stoneValue,i+3,0,n,dp));
            }
            //h.put(x,a1);
             dp[i][ch]=a1;
            return a1;
            
            
            
            
            
            
            
            
            
            
            
        }
        
    }
}