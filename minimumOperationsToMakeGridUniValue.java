class Solution {
    int min=Integer.MAX_VALUE;
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> a=new ArrayList<>();
        int mod=grid[0][0]%x;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]%x!=mod)
                    return -1;
                else
                    a.add(grid[i][j]);
            }
        }
        Collections.sort(a);
        int d=a.size();
        
        if(d%2==1)
        {
            
           int c= call(a,a.size()/2,x);
            min=Math.min(c,min);
        }
        else
        {
          int c1=  call(a,a.size()/2,x);
          int c2=  call(a,a.size()/2-1,x);
            min=Math.min(min,Math.min(c1,c2));
        }
         return min;   
        
    }
    public int call(ArrayList<Integer> a,int index,int x)
    {
        int c=0;
        int med=a.get(index);
        for(int i=0;i<a.size();i++)
        {
            c=c+(Math.abs(a.get(i)-med)/x);
            
        }
        return c;
    }
}