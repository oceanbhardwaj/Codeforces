class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int diff[]=new int[n];
        int total=0;
         int mod=(int)1e9+7;
        for(int i=0;i<n;i++)
        {
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            total+=diff[i];
            total=total%mod;// total abs diff 
            
        }
        //sort first array
        Arrays.sort(nums1);
        int arr[]=new int[n]; //closest elment of nums1
        for(int i=0;i<n;i++)
        {
            int target=nums2[i];
            int x=binarySearch(nums1,target);
            if(x!=0 && x!=n && x!=-1)
            {
                arr[i]=Math.min(Math.abs(nums2[i]-nums1[x]),Math.abs(nums2[i]-nums1[x-1]));
            }
            else if(x==0 )
                   {
                       arr[i]=Math.abs(nums2[i]-nums1[x]);
                   }
                   else if(x==-1)
                 arr[i]= Math.abs(nums2[i]-nums1[n-1]);
                   
        }
       
           //max abs diff
       
        int best=Integer.MIN_VALUE; 
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            best=Math.max(Math.abs(arr[i]-diff[i]),best);
        }        
        return (int)(total-best)%mod;
        
        
        
        
        
        
    }
                   public int binarySearch(int nums[],int target)
                   {
                       int left=0;
                       int right=nums.length-1;
                      int index=-1;
                       while(left<=right)
                       {
                          int mid=(left+right)/2;
                           if(nums[mid]==target)
                               return mid;
                           else if(nums[mid]<target)
                           {
                                
                               left=mid+1;
                           }
                           else
                           {
                              index=mid;
                               right=mid-1;
                           }
                           
                           
                           
                           
                       }
                       return index;
                   }
}