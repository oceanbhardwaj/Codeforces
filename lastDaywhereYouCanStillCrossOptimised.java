class Solution {
    int ok=0;
    int arrX[]={-1,0,1,0};
    int arrY[]={0,1,0,-1};
    public int latestDayToCross(int row, int col, int[][] cells) {
       
        //applying binary Search
        int count=0;
        int m=cells.length;
       
        int left=0;
        int right=m-1;
        int arr[][]=new int[row][col];
        while(left<=right)
        {
            int mid=(left+right)/2;
            System.out.println("mid="+mid);
            for(int j=0;j<=mid;j++)
            {
                arr[cells[j][0]-1][cells[j][1]-1]=1; //water
            }
            for(int i=0;i<col;i++){
                 ok=0;
                if(arr[0][i]==0)
                { 
                    boolean visited[][]=new boolean[row][col];
                    dfs(arr,row-1,visited,0,i);
                 System.out.println("ok="+ok);
                 if(ok==1)
                     break;
                 }
                
                }
            if(ok==1)
            {count=mid+1;
             System.out.println("count="+count);
             left=mid+1;
            }
            else
                right=mid-1;
            
             arr=new int[row][col];  
        
        }
        return count;
    }
    
    public void dfs(int arr[][],int r,boolean visited[][],int start,int end)
    {
        if(start<0 && start>arr.length && end<0 && end>arr[0].length)
        {
            return;
        }
        if(start==r && !visited[start][end]  && arr[start][end]==0)
        {
            ok=1;
            return;
        }
        if(visited[start][end] || arr[start][end]==1)
        {
         return;
        }
        visited[start][end]=true;
        for(int j=0;j<4;j++)
        {
        int X=start+arrX[j];
        int Y=arrY[j]+end;
        if(X>=0 && Y>=0 && X<arr.length && Y<arr[0].length && !visited[X][Y]  && arr[X][Y]==0)
        {
            dfs(arr,r,visited,X,Y);
        }
            
        
        
        }
        
        
        
    }
    
    
}