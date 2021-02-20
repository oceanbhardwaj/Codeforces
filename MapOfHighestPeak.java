class Solution {
    class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        Queue<Pair> pq=new LinkedList<>();
        int matrix[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        int arr1[]={-1,0,1,0};
        int brr1[]={0,1,0,-1};
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(isWater[i][j]==1)
                {
                    matrix[i][j]=0;
                    pq.add(new Pair(i,j));
                    visited[i][j]=true;
                    
                }
                else
                    matrix[i][j]=Integer.MIN_VALUE;
            }
        }
        
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int xx=p.x;
            int yy=p.y;
            for(int i=0;i<4;i++)
            {
                int a=arr1[i]+xx;
                int b=brr1[i]+yy;
                if(a>=0 && a<n && b>=0 && b<m && !visited[a][b])
                {
                 matrix[a][b]=matrix[xx][yy]+1;
                    pq.add(new Pair(a,b));
                    visited[a][b]=true;
                }
            }
            
            
        }
        return matrix;
        
    }
}