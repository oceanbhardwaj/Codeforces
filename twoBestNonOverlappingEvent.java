class Solution {
    public int maxTwoEvents(int[][] events) {
        int max=0;
        Comparator co=new Comparator<int[]>(){
            
            public int compare(int a[],int b[])
            {
                if(a[1]==b[1])
                    return a[0]-b[0];
                     return a[1]-b[1]; //end tym
            }
        };
        Arrays.sort(events,co);
         ArrayList<Integer> a=new ArrayList<>();
        int dp[]=new int[events.length];
        dp[0]=events[0][2];
        a.add(events[0][1]);
        for(int i=1;i<events.length;i++)
        {
            dp[i]=Math.max(dp[i-1],events[i][2]); //get max at every loc
            a.add(events[i][1]);
        }
        
        max=events[0][2];
       for(int i=1;i<a.size();i++)
       {
            max=Math.max(max,events[i][2]); //if choosen single ele
           //apply binary search on left
            //System.out.println("startevent :"+events[i][0]);
           int index=binarySearch(a,0,i-1,events[i][0],dp);
          
           if(index!=-1)
               max=Math.max(max,events[i][2]+dp[index]);
       
           // System.out.println("max :"+max);
       
       }
        return max;
        
        
        
    }
    public int binarySearch(ArrayList<Integer> a,int start,int end,int startPoint,int dp[])
    {
        int index=-1;
        int max=Integer.MIN_VALUE;
        while(start<=end)
        {
           
            int mid=(start+end)/2;
            // System.out.println("mid :"+mid);
            if(a.get(mid)<startPoint )
            {
                
                index=mid;
               
                start=mid+1;
                
            }
            else
            {
                end=mid-1;
            }
        }
        //System.out.println("index :"+index);
       
        return index;
    }
    
}