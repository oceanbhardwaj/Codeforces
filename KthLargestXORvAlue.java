class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int xValue=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            xValue=xValue^matrix[i][0];
            dp[i][0]=xValue;
          
            pq.add(dp[i][0]);
        }
         xValue=0;
        for(int i=0;i<m;i++)
        {
            xValue=xValue^matrix[0][i];
            dp[0][i]=xValue;
            
            if(i!=0)
            pq.add(dp[0][i]);
            
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                dp[i][j]=dp[i-1][j]^dp[i][j-1]^matrix[i][j]^dp[i-1][j-1];
                
                pq.add(dp[i][j]);
               
            }
        }
      
        
        int d=0;
        while(!pq.isEmpty() && k>0)
        {
            d=pq.poll();
            k--;
        
        }
        return d;
    }
}