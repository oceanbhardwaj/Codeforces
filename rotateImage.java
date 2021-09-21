class Solution {
    public void rotate(int[][] matrix) {
        //swap rows then transpose
        
        //swapping rows
        int start=0;
        int end=matrix.length-1;
       
        while(start<end)
        {
             int startC=0;
        int endC=matrix.length-1;
           while(startC<=endC)
            {
                int temp=matrix[start][startC];
                matrix[start][startC]=matrix[end][startC];
               matrix[end][startC]=temp;
               startC++;
               
            }
            start++;
            end--;
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
    }
}