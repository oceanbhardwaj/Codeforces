class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
       int numsc[]=new int[n];
        for(int i=0;i<n;i++)
        {
            numsc[i]=nums[i];
        }
        Arrays.sort(numsc);
        int arr[]=new int[n];
        
        for(int i=n-1;i>=0;i--)
        { int index=0;
            for(int j=i;j<n;j++)
            {
                arr[index++]=nums[j];
            }
            for(int k=0;k<i;k++)
            {
                arr[index++]=nums[k];
            }
         if(Arrays.equals(arr,numsc))
             return true;
        }
       return false; 
    }
}