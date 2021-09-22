class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*BRUTE FORCE
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
        */
        // o(N)
        int col=matrix[0].length-1;
        int row=0;
        while(row<matrix.length && col>=0 && row>=0 && col<matrix[0].length)
        {
           if(matrix[row][col]==target)
               return true;
            else if(matrix[row][col]>target)
            {
           col--;
            }
            else
               row++;
        
        }
        return false;
        
        
        
    }
}