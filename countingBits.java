T.C-O(n
class Solution {
    public int[] countBits(int n) {
        if(n==0)
            return new int[1];
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=calculateNoOfBits(i);
        }
        return arr;
    }
    public int calculateNoOfBits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
            
        }
        return count;
    }
}
-------------------------------------------------------------------------------------
class Solution {
    public int[] countBits(int n) {
        if(n==0)
            return new int[1];
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=calculateNoOfBits(i);
        }
        return arr;
    }
    public int calculateNoOfBits(int n){
       if(n==1)
           return 1;
        if(n==0)
            return 0;
        return n%2==0?calculateNoOfBits(n/2):calculateNoOfBits(n/2)+1;
    }
}
--------------------------------------------------------------------------------------
T.C -o(n)
class Solution {
    public int[] countBits(int n) {
        if(n==0)
            return new int[1];
        int arr[]=new int[n+1];
        //int dp[]=new int[n+1];
        arr[0]=0;
        
        for(int i=1;i<=n;i++)
        {
            arr[i]=i%2==0?arr[i/2]:1+arr[i/2];
        }
        return arr;
    }
    
}