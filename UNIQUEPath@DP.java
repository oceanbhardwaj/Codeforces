class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return dfs(0,0,m-1,n-1,dp);
        
        
        
    }
    public int dfs(int i,int j,int m,int n,int dp[][])
    {
      if(i==m && j==n)
          return 1;
         if(i>m ||j>n)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
       
        return dp[i][j]=dfs(i+1,j,m,n,dp)+dfs(i,j+1,m,n,dp);
    
    
    
    
    
    }
}
//////////////////////////////DP////////////////////////
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            dp[i][0]=1;
           
        }
         for(int i=0;i<n;i++)
        {
            dp[0][i]=1;
           
        }
       // dp[0][0]=0;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        
        