class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>()
        {
             public int compare(int a[],int b[])
            {
                 if(a[0]==b[0])
                     return a[1]-b[1];
               return a[0]-b[0];              
            }
        });
        
        int start=intervals[0][0];
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++)
        {
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(end>=e)
            {
                int diff1=end-start;
                int diff2=e-s;
                if(diff1>diff2)
                {
                    start=s;
                    end=e;
                    count++;
                }
                else
                    count++;
            }
            else if(end<=s){
               
               start=s;
                end=e;
                 continue;
            }
            else if(end>s)
            {
                count++;
            }
            
        }
        return count;
    }
}