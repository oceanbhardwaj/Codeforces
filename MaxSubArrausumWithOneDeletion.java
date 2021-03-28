class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int fwd[]=new int[n];
        int bwd[]=new int[n];
        fwd[0]=arr[0];
        int msf=arr[0];
        int meh=arr[0];
        for(int i=1;i<n;i++)
        {
            meh=meh+arr[i];
            if(meh<arr[i])
                meh=arr[i];
            fwd[i]=meh;
            msf=Math.max(meh,msf);
        }
        
        meh=arr[n-1];
        bwd[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--)
        {
            meh=meh+arr[i];
            if(meh<arr[i])
                meh=arr[i];
            bwd[i]=meh;
           
        }
        for(int i=1;i<n-1;i++)
        {
            msf=Math.max(msf,fwd[i-1]+bwd[i+1]);
        }
        return msf;
    }
}