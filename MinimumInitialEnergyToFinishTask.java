class Solution {
    public int minimumEffort(int[][] tasks) {
        Comparator co=new Comparator<int[]>()
        {
           public int compare(int a[],int b[])
           {
               
               return (b[1]-b[0])-(a[1]-a[0]);
           }
        };
        Arrays.sort(tasks,co);
        int sum=0;
        for(int e[]:tasks)
        {
            sum=sum+e[0];
        }
        //sum=sum-1;
        int a=sum;
        int d=0;
        int count=0;
        for(int e[]:tasks)
        {
            if(e[1]>sum)
            { d=e[1]-sum;
             count=count+d;}
            sum=sum+d;
            sum=sum-e[0];
            
            
        }
      
        return a+count;
        
    }
}