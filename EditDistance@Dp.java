class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int dp[][]=new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return dfs(word1,word2,n1,n2,dp);
        
    }
    public int dfs(String word1,String word2,int n,int m,int dp[][])
    {
        
        if(m<=0)
            return n;
       if(n<=0)
           return m;
        if(dp[n-1][m-1]!=-1)
            return dp[n-1][m-1];
        
        
        if(word1.charAt(n-1)==word2.charAt(m-1))
        {
            return dfs(word1,word2,n-1,m-1,dp);
            
        }
        else
        {
            return dp[n-1][m-1]=1+Math.min(dfs(word1,word2,n,m-1,dp),Math.min(dfs(word1,word2,n-1,m,dp),dfs(word1,word2,n-1,m-1,dp)));
            
    }
    }
}
//////////////////////////////////////DP////////////////////////////
class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int dp[][]=new int[n1+1][n2+1];
       for(int i=0;i<=n1;i++)
       {
           for(int j=0;j<=n2;j++)
           {
               if(i==0)
                   dp[i][j]=j;
               if(j==0)
                   dp[i][j]=i;
           }
       }
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
 dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[n1][n2];
        
    }
}