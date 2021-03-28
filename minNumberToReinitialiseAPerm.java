class Solution {
    public int reinitializePermutation(int n) {
        int perm[]=new int[n];
        for(int i=0;i<n;i++)
        {perm[i]=i;
            
        }
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
          if(i%2==0)
          {
              arr[i]=perm[i/2];
              
          }
            else
            {
                arr[i]=perm[n/2+(i-1)/2];
            }
        }
        int count=1;
        if(Arrays.equals(perm,arr))
            return 1;
         while(!Arrays.equals(perm,arr))
         {
             //arr=perm;
             int arr2[]=new int[n];
              for(int i=0;i<n;i++)
        {
          if(i%2==0)
          {
              arr2[i]=arr[i/2];
              
          }
            else
            {
                arr2[i]=arr[n/2+(i-1)/2];
            }
        }
             arr=arr2;
             count++;
             
         }

        return count;
        
    }
}