class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        if(points.length==0)
            return 0;
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
            
        };
        int max=0;
        Arrays.sort(points,co);
        for(int i=1;i<points.length;i++)
        {
            max=Math.max(max,points[i][0]-points[i-1][0]);
        }
        return max;
    }
}