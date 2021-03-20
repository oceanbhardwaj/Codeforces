class Solution {
    int min=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
          min=Integer.MAX_VALUE;
        dfs(0,0,grid,0,n,m);
      
        return min;
    }
    public void dfs(int i,int j,int grid[][],int sum,int n,int m)
    {
        if(i>=n || j>=m || i<0 ||j<0)
            return ;
        if(i==n-1 && j==m-1)
        {
            min=Math.min(sum+grid[i][j],min);
            return;
        }
        dfs(i+1,j,grid,sum+grid[i][j],n,m);
        dfs(i,j+1,grid,sum+grid[i][j],n,m);
    }
}
////////////////////////////////////Memo//////////////////////////////////
class Solution {
    int min=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
          min=Integer.MAX_VALUE;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,grid,n,m,dp);
      
        //return min;
    }
    public int dfs(int i,int j,int grid[][],int n,int m,int dp[][])
    {
        if(i>=n || j>=m || i<0 ||j<0)
            return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(i==n-1 && j==m-1)
        {
            
            return grid[i][j];
        }
      return dp[i][j]=grid[i][j]+Math.min(dfs(i+1,j,grid,n,m,dp),dfs(i,j+1,grid,n,m,dp));
        
    }
}
////////////////////////////////////////////////////////DP/////////////////////////////////////////
class Solution {
    int min=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
          min=Integer.MAX_VALUE;
        int dp[][]=new int[n][m];
        dp[0][0]=grid[0][0];
      for(int i=1;i<m;i++)
      {
          dp[0][i]=grid[0][i]+dp[0][i-1];
      }
         for(int j=1;j<n;j++)
      {
          dp[j][0]=grid[j][0]+dp[j-1][0];
      }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
             dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
        
    }
}