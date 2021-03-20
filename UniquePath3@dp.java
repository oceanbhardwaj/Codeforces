class Solution {
    int count1=0;
    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int row=0;
        int colm=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
              if(grid[i][j]==1)
              {
                  row=i;
                  colm=j;
                  //break;
              }
              else if(grid[i][j]==0)
                  zero++;
          }
        }
        count1=0;
        dfs(row,colm,grid, n, m,zero,0);
        
     return count1;   
        
        
        
        
        
    }
    public void dfs(int i,int j,int grid[][],int n,int m,int zero,int count){
        
        if(i>=n || j>=m || i<0 ||j<0|| grid[i][j]<0)
            return;
        if(grid[i][j]==2 )
        {  if(count==zero)
         
            count1++;
            return;
        
        }
         if(grid[i][j]==1 && count>0)
            return;
        
        if(grid[i][j]==0)
        { grid[i][j]=-2;
      count++;}
        
        dfs(i+1,j,grid,n,m,zero,count);
        
        dfs(i,j+1,grid,n,m,zero,count);
      
        dfs(i-1,j,grid,n,m,zero,count);
      
        dfs(i,j-1,grid,n,m,zero,count);
        if(grid[i][j]==-2)
        { grid[i][j]=0;
      count--;}
        
        
        
        
        
        
    }
    
}