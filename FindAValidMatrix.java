class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int row=rowSum.length;
        int colm=colSum.length;
        int mat[][]=new int[row][colm];
        Set<Integer> rset=new HashSet<>();
        Set<Integer> cset=new HashSet<>();
        
        while(rset.size()!=row && cset.size()!=colm)
        {
            int rc=find(rowSum,rset);
            int cc=find(colSum,cset);
            if(rowSum[rc]<colSum[cc])
            {
                mat[rc][cc]=rowSum[rc];
                colSum[cc]-=rowSum[rc];
                rset.add(rc);
            }
            else
            {
                mat[rc][cc]=colSum[cc];
                rowSum[rc]-=colSum[cc];
                cset.add(cc);
            }
            
            
        }
        return mat;
            
        
    }
    
    private int find(int a[],Set<Integer> h)
    {
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min && !h.contains(i))
            {
                min=a[i];
                index=i;
            }
        }
        return index;
    }
    
    
    
    
    
    
    
    
}