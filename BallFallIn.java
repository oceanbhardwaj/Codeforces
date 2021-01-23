class Solution {
    public int[] findBall(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans[]=new int[col];
        Arrays.fill(ans,-1);
        for(int i=0;i<col;i++)
        {
            int rownumber=0;
            int colnumber=i;
            while(rownumber<row){
            if(grid[rownumber][colnumber]==-1)
            {
                if(colnumber==0 || grid[rownumber][colnumber-1]==1)
                    break;
                else
                {
                    rownumber++;
                    colnumber--;
                }
            }
            else
            {
                if(colnumber==col-1 || grid[rownumber][colnumber+1]==-1)
                    break;
                else
                {
                  colnumber++;
                    rownumber++;
                }
            }
            }
            if(rownumber==row)
                ans[i]=colnumber;
        }
        return ans;
    }
}