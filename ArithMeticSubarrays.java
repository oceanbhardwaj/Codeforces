class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> a=new ArrayList<>();
        int n=nums.length;
        int n1=l.length;
       for(int i=0;i<n1;i++){
           int n2=r[i]-l[i]+1;
           int arr[]=new int[n2];
           int d=0;
            for(int j=l[i];j<=r[i];j++)
            {
                arr[d++]=nums[j];
                
            }
           Arrays.sort(arr);
           if(arr.length==1)
               a.add(true);
           else{
               int flag=1;
               int diff=arr[0]-arr[1];
           for(int i1=2;i1<n2;i1++)
           {
              if(arr[i1-1]-arr[i1]==diff)
                  continue;
               else
               {flag=0;
               break;}
           }
                if(flag==1)
                    a.add(true);
                else
                    a.add(false);
               }}
        return a;
    }
}