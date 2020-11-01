//use ladders for maximum distance.
class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        for( i=0;i<n-1;i++)
        {
         int d=heights[i+1]-heights[i];
            if(d<0)
                continue;
            if(d>0)
                pq.add(d);
            if(pq.size()>ladders)
            {
                bricks=bricks-pq.poll();
            }
            if(bricks<0)
                return i;
        }
        
        
        
        
        
      return n-1;  
        
        
        
}
}


