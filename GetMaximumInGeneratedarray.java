class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int d=1;
       while(2*d+1<=n)
        {  int count=0;
            
            arr[d*2]=arr[d];
             count++;
         
             
             if(count==1)
            {
                arr[d*2+1]=arr[d]+arr[d+1];
                count++;
            }
         if(count==2)
             
         d++;
        }
        int max=0;
        for(int i=0;i<=n;i++)
        {
            max=Math.max(arr[i],max);
        }
        return max;
        
    }
}