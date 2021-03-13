class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int lis[]=new int[n];
          int print[]=new int[n];
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]>nums[j] && lis[j]+1>lis[i])
                {
                    lis[i]=lis[j]+1;
                    print[i]=j;
                }
                
                
            }

        }
        int max=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
           
            //index of max length
            if(lis[i]>max)
            {
                 max=Math.max(lis[i],max);
                index=i;
            }
        }
        
        //printing lis
        int arr[]=new int[max];
        arr[max-1]=nums[index];
        int i=max-2;
        while(i>=0)
        {
            int p=print[index];
            int val=nums[p];
            arr[i--]=val;
            index=p;
            
        }
        for(i=0;i<max;i++)
            System.out.print(arr[i]+"  ");
        
        System.out.println();
        
        
        
        
        
        
        //
        
        
        
        return max;
        
        
    }
}