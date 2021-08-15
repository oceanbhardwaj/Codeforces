class Solution {
    int arrX[]={-1,0,1,0};
    int arrY[]={0,1,0,-1};
    int flag=0;
    public int latestDayToCross(int row, int col, int[][] cells) {
        //o land 
        //1 water 
        int count=0;
        
        
        int arr[][]=new int[row][col];
        for(int a[]:cells)
        { 
            boolean visited[][]=new boolean[row][col];
            arr[a[0]-1][a[1]-1]=1; //water
            
      
            for(int i=0;i<col;i++)
            {
                if(arr[0][i]==0)  //land
                {
                   
                    flag=0;
                    visited=new boolean[row][col];
                    dfs(arr,0,i,row-1,col-1,visited);
                        if(flag==1)
                    {
                        count++;
                           
                        break;
                    }
                }
            }
            
        }
        return count;
    }
    
    public void dfs(int arr[][],int x,int y,int start,int end,boolean visited[][])
    {
        if(x<0 || x>=arr.length || y<0 || y>=arr[0].length)
        {
           
         return ;
        }
        if(x==start && !visited[x][y] && arr[x][y]==0)
        { 
            flag=1;
            return;
        }
        if(visited[x][y] || arr[x][y]==1){
           
            return;
        }
            
        visited[x][y]=true;
        for(int j=0;j<4;j++)
        {
            int X=arrX[j]+x;
            int Y=arrY[j]+y;
           
            if(X>=0 && X<arr.length && Y>=0 && Y<arr[0].length && arr[X][Y]==0 && !visited[X][Y])
            {
               
                dfs(arr,X,Y,arr.length-1,arr[0].length-1,visited);
            }
        }
        
    }
}